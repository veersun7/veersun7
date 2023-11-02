import React, { Component } from 'react';
import AppNavbar from './AppNavbar';
import Footer from './Footer';
import Logo from './images/Sec1.JPG'
import Capture from './images/Sec2.JPG';

class Home extends Component {

      constructor(props) {
        super(props);
  }

  componentDidMount() {
  }

  render() {
    return (
      <div>
        <AppNavbar/>                       
        <section>
        <div class="card">
          <img src={Logo} class="card-img-top" alt="" href="" />
          <img src={Capture} class="card-img-top py" alt="" href="" />
        </div>
      </section>
        <Footer />      
      </div>
    );
  }
}

export default Home;