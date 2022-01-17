import React, { Component } from 'react';
import ProvidedServices from '../services/ProvidedServices-Service';

class ListProvidedServicesComponent extends Component {
    constructor(props) {
        super(props);

        this.state = {
            services:[]
        }
        this.addService = this.addService.bind(this);
    }

    addService(){
        this.props.history.push('/add-service');
    }

    componentDidMount(){
        ProvidedServices.getServices().then((res) => {
            this.setState({ services: res.data });
        });
    }
    
    render() {
        return (
            <div>
                <h1 className="text-center">Services List</h1>
                <div className="row">
                    <button className="btn btn-primary" onClick={this.addService}>Add Service</button>
                </div>
                <div className="row">
                    <table className="table table-striped table bordered">
                        <thead>
                            <tr>
                                <th>Service Name</th>
                                <th>Service Description</th>
                                <th>Service Price</th>
                                <th>Expected duration</th>
                                <th>actions</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.services.map(
                                    service => 
                                    <tr key = { service.id }>
                                        <td>{ service.serviceName }</td>
                                        <td>{ service.serviceDescription }</td>
                                        <td>{ service.servicePrice }</td>
                                        <td>{ service.expectedDuration }</td>
                                    </tr>
                                )
                            }
                        </tbody>
            
                    </table>    
                </div>
            </div>
        );
    }
}

export default ListProvidedServicesComponent;
