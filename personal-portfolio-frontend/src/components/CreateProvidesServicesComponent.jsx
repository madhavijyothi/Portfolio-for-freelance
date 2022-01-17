import React, { Component } from 'react';

class CreateProvidesServicesComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            serviceName: '',
            serviceDescription: '',
            servicePrice: 0,
            expectedDuration: Date()
        }
        this.changeServiceNameHandler = this.changeServiceNameHandler.bind(this);
        this.changeServiceDescriptonHandler = this.changeServiceDescriptonHandler.bind(this);
        this.changeservicePriceHandler = this.changeservicePriceHandler.bind(this);
        this.changeExpectedDurationHandler = this.changeExpectedDurationHandler.bind(this);
        this.saveService = this.saveService.bind(this);
    }
    saveService = (e) =>{
        e.preventDefault();
        let service = {serviceName: this.state.serviceName, serviceDescription: this.state.serviceDescription,
             servicePrice: this.state.servicePrice, expectedDuration: this.state.expectedDuration};
             console.log('service =>' + JSON.stringify(service));

    }
    cancel(){
        this.props.history.push('/services');
    }

    changeServiceNameHandler= (event) => {
        this.setState({serviceName: event.target.value});
    }

    changeServiceDescriptonHandler= (event) => {
        this.setState({serviceDescription: event.target.value});
    }

    changeservicePriceHandler= (event) =>{
        this.setState({servicePrice: event.target.value});
    }
    changeExpectedDurationHandler= (event) =>{
        this.setState({expectedDuration: event.target.value});
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    <div className="card col-md-6 offset-md-3 offset-md-3">
                        <h3 className="text-center">Add Service</h3>
                        <div className= "card-body">
                            <form action="">
                                <div className="form-group">
                                    <label>Service Name:</label>
                                    <input placeholder="Service Name" name="ServiceName" className="form-control"
                                    value={this.state.serviceName} onChange={this.changeServiceNameHandler} />
                                </div>
                                <div className="form-group">
                                    <label>Service Descripton:</label>
                                    <input placeholder="Service Descripton" name="ServiceDescripton" className="form-control"
                                    value={this.state.serviceDescription} onChange={this.changeServiceDescriptonHandler} />
                                </div>
                                <div className="form-group">
                                    <label>Service Price:</label>
                                    <input type="number" className="form-control"
                                    value={this.state.servicePrice} onChange={this.changeservicePriceHandler} />
                                </div>
                                <div className="form-group">
                                    <label>Expected Duration:</label>
                                    <input type="date" className="form-control"
                                    value={this.state.expectedDuration} onChange={this.changeExpectedDurationHandler} />
                                </div>
                                <button className="btn btn-success" onClick={this.saveService}>Save</button>
                                <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft:"10px"}}>Cancel</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default CreateProvidesServicesComponent;