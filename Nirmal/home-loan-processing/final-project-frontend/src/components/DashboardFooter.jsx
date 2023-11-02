import React from "react";
import linkedin from "../images/linkedin.png";
import twitter from "../images/twitter.png";

function DashboardFooter() {
  return (
    <footer data-testid="footerunit" title="FooterUnit" className="py-1 my-2">
      <hr></hr>
      <ul className="nav justify-content-center border-bottom pb-1 mb-1">
        <div class="col-md-1 col-lg-2 col-xl-3 mx-auto mb-4">
          <li
            data-testid="listName"
            className="nav-item nav-link px-2 text-muted"
          >
            Quick links
          </li>

          <li>
            <a href="link">Leadership & governance</a>
          </li>
          <li>
            <a href="link">GRG</a>
          </li>
          <li>
            <a href="link">Bank of APIs</a>
          </li>
          <li>
            <a href="link">Supplying goods and service UK</a>
          </li>
        </div>
        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
          <li className="nav-item nav-link px-2 text-muted">Key reports</li>
          <li>
            <a href="link">Annual report and accounts (PDF 13MB)</a>
          </li>
        </div>
        <div class="col-md-4 col-lg-2 col-xl-2 mx-auto mb-4">
          <li className="nav-item nav-link px-2 text-muted">Contact Us</li>
          <li>
            <a href="link">FAQ's</a>
          </li>
          <li>
            <a href="link">Customer contacts</a>
          </li>
          <li>
            <a href="link">Investor contacts</a>
          </li>
          <li>
            <a href="link">Media contacts</a>
          </li>
          <li>
            <a href="link">Sustainable Banking contacts</a>
          </li>
        </div>
        <div class="col-md-5 col-lg-2 col-xl-2 mx-auto mb-4">
          <li className="nav-item nav-link px-2 text-muted">Downloads</li>
          <li>
            <a href="link">Modern Slavery Act (PDF 672KB)</a>
          </li>
          <li>
            <a href="link">Managing political activities (PDF 134KB)</a>
          </li>
          <li>
            <a href="link">Our readiness for resolution 2022 (PDF 1MB)</a>
          </li>
        </div>
      </ul>

      <ul className="nav justify-content-center border-bottom pb-1 mb-1 py-1 my-2">
        <li className="text-center px-2 text-muted"> © Natwest Group 2023 </li>
        <li className="text-center px-2 text-muted"> Cookie policy </li>
        <li className="text-center px-2 text-muted"> Privacy notice </li>
        <li className="text-center px-2 text-muted"> Legal information </li>
        <li className="text-center  px-2 text-muted"> Site map </li>
        <li className="text-center px-2 text-muted"> Accessibility </li>
      </ul>
      <a
        className="btn btn-outline-light btn-floating m-1"
        href="/india"
        role="button"
      >
        <img src={twitter} alt="" height="60" width=" 60" />
        <i className="fab fa-twitter"></i>
      </a>
      <a
        className="btn btn-outline-light btn-floating m-1"
        href="/india"
        role="button"
      >
        <img src={linkedin} alt="" height="60" width="60" />
        <i className="fab fa-linkedin-in"></i>
      </a>
    </footer>
  );
}

export default DashboardFooter;
