import React from 'react';
import {Link, Outlet } from "react-router-dom";

function TableBookingNavbar(){
    return(
        <div className="container-xxl position-relative p-0">
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark px-4 px-lg-5 py-3 py-lg-0">
                <a href="#" className="navbar-brand p-0">
                    <h1 className="text-primary m-0"><i className="fa fa-utensils me-3"></i>Restoran</h1>
                    {/* <!-- <img src="img/logo.png" alt="Logo"> --> */}
                </a>
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span className="fa fa-bars"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarCollapse">
                    <div className="navbar-nav ms-auto py-0 pe-4">
                        <Link to="/home" className="nav-item nav-link">Home</Link>
                        <Link to="/tableBooking" className="nav-item nav-link active">Book A Table</Link>
                        <a href="contact.html" className="nav-item nav-link">Contact</a>
                    </div>
                    <a href="" className="btn btn-primary py-2 px-4">Book A Table</a>
                </div>
            </nav>

            <div className="container-xxl py-2 bg-dark hero-header mb-5">
                <div className="container text-center my-5 pt-5 pb-4">
                    <h1 className="display-3 text-white mb-3 animated slideInDown">Book A Table</h1>
                    <nav aria-label="breadcrumb">
                        <ol className="breadcrumb justify-content-center text-uppercase">
                            <li className="breadcrumb-item"><a href="#">Home</a></li>
                            <li className="breadcrumb-item text-white active" aria-current="page">Book A Table</li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
    );
};
  
export default TableBookingNavbar;