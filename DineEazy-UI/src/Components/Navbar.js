import React from 'react';
import {Link, Outlet } from "react-router-dom";

function Navbar(){
    return(
        <div className="container-xxl position-relative p-0">
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark px-4 px-lg-5 py-3 py-lg-0">
                <a href="#" className="navbar-brand p-0">
                    <h1 className="text-primary m-0"><i className="fa fa-utensils me-3"></i>DineEazy</h1>
                    {/* <img src="img/logo.png" alt="Logo"> --> */}
                </a>
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span className="fa fa-bars"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarCollapse">
                    <div className="navbar-nav ms-auto py-0 pe-4">
                        <Link to="/home" className="nav-item nav-link active">Home</Link>
                        <Link to="/tableBooking" className="nav-item nav-link">Book A Table</Link>
                        <Link to="/restaurant" className="nav-item nav-link">Restaurant</Link>
                        <Link to="/aboutUs" className="nav-item nav-link">About Us</Link>
                        <Link to="/contact" className="nav-item nav-link">Contact</Link>
                        <Link to="/login" className="nav-item nav-link">Login</Link>
                    </div>
                    <Link to="/signUp" className="btn btn-primary py-2 px-4">Sign Up</Link>
                </div>
            </nav>

            <div className="container-xxl py-5 bg-dark hero-header mb-5">
                <div className="container my-5 py-5">
                    <div className="row align-items-center g-5">
                        <div className="col-lg-6 text-center text-lg-start">
                            <h1 className="display-3 text-white animated slideInLeft">Enjoy Our<br></br>Delicious Meal</h1>
                            <p className="text-white animated slideInLeft mb-4 pb-2">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit. Aliqu diam amet diam et eos. Clita erat ipsum et lorem et sit, sed stet lorem sit clita duo justo magna dolore erat amet</p>
                            <a href="#" className="btn btn-primary py-sm-3 px-sm-5 me-3 animated slideInLeft">Book A Table</a>
                        </div>
                        <div className="col-lg-6 text-center text-lg-end overflow-hidden">
                            <img className="img-fluid" src="img/hero.png" alt=""/>
                        </div>
                    </div>
                </div>
            </div>
        <div>
            <Outlet></Outlet>
        </div>
    </div>
    );
};
  
export default Navbar;