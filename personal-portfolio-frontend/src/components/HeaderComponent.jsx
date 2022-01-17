import React, { Component } from 'react';

class HeaderComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {

        }
    }
    

    render() {
        return (
            <div>
                <header className="navbar navbar-expend-md navbar-dark bg-dark">
                    <div>
                        <a href="https://github.com/allcodesnick" className="navbar-brand">
                            Github Link
                        </a>
                    </div>
                </header>
            </div>
        );
    }
}

export default HeaderComponent;