import './App.css';
import {BrowserRouter as Router, Route, Switch}  from 'react-router-dom';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ListProvidedServicesComponent from './components/ListProvidedServicesComponent';
import CreateProvidesServicesComponent from './components/CreateProvidesServicesComponent';

function App() {

  return (
    <div>
      <Router>
          <HeaderComponent />
            <div className="container">
              <Switch>
                <Route path = "/" exact component = {ListProvidedServicesComponent}></Route>
                <Route path = "/services" component = {ListProvidedServicesComponent}></Route>
                <Route path = "/add-service" component = {CreateProvidesServicesComponent}></Route>
              </Switch>
            </div>
          <FooterComponent />
      </Router>
    </div>
  );
}

export default App;
