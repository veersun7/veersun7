import React, { Component } from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import "./App.css";
import Home from "./app/components/Home";
import Profile from "./app/components/Profile";
import UserPage from "./app/components/UserPage";
import SignUp from "./app/components/SignUp";
import Login from "./app/components/Login";
import Content from "./app/components/Content";
import Footer from "./app/components/Footer";

class App extends Component {
  render() {
    return (
      <Router>
        <Switch>
          <Route path="/" exact={true} component={Home} />
          <Route path="/home" exact={true} component={Home} />
          <Route path="/profile" exact={true} component={Profile} />
          <Route path="/user" exact={true} component={UserPage} />
          <Route path="/signin" exact={true} component={Login} />
          <Route path="/signup" exact={true} component={SignUp} />
          <Route path="/content" exact={true} component={Content} />
          <Route path="/footer" exact={true} component={Footer} />
        </Switch>
      </Router>
    );
  }
}

export default App;
