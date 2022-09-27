import React from "react";
import imgsignin from '../assets/cafe-mozaic.webp';

const Signup_restro = props =>{
    return(
        <div className="container-xxl py-5 px-0 wow fadeInUp" data-wow-delay="0.1s">
            <div className="row g-0">
                <div className="col-md-6">
                    <div>
                        <img src={imgsignin} alt="signup-image"></img>
                    </div>
                </div>
                <div className="col-md-6 bg-dark d-flex align-items-center">
                    <div className="p-5 wow fadeInUp" data-wow-delay="0.2s">
                        <h5 className="section-title ff-secondary text-start text-primary fw-normal">Please Register for Restaurant</h5>
                        <h1 className="text-white mb-4">Signup</h1>
                        <form > 
                            <div className="row g-3">
                                <div className="col-md-9">
                                    <div className="form-floating">
                                        <input type="text" className="form-control" id="text" placeholder="First name" />
                                        <label for="text">Restaurant Name</label>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-9">
                                    <div className="form-floating">
                                        <input type="number" className="form-control" id="number" placeholder="Mobile number" />
                                        <label for="number">Contact number</label>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-9">
                                    <div className="form-floating">
                                    <input type="password" className="form-control datetimepicker-input" id="password" placeholder="set password" />
                                    <label for="password">Set Password</label>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-9">
                                    <div className="form-floating">
                                    <input type="password" className="form-control datetimepicker-input" id="password" placeholder="Conform password" />
                                    <label for="password">Conform Password</label>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-12"></div>
                                <div className="col-md-12"></div>
                               <div className="col-9">
                                    <button className="btn btn-primary w-100 py-3" type="submit">Signup</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Signup_restro;