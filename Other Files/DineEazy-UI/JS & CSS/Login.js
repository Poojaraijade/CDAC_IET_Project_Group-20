import React from "react";
import imglogin from '../assets/cafe-mozaic.webp';

const Login = props =>{
    return(
        <div className="container-xxl py-5 px-0 wow fadeInUp" data-wow-delay="0.1s">
            <div className="row g-0">
                <div className="col-md-6">
                    <div>
                        <img src={imglogin} alt="login-image"></img>
                    </div>
                </div>
                <div className="col-md-6 bg-dark d-flex align-items-center">
                    <div className="p-5 wow fadeInUp" data-wow-delay="0.2s">
                        <h5 className="section-title ff-secondary text-start text-primary fw-normal">Welcome</h5>
                        <h1 className="text-white mb-4">Login</h1>
                        <form>
                            <div className="row g-3">
                                <div className="col-md-9">
                                    <div className="form-floating">
                                        <input type="number" className="form-control" id="number" placeholder="Registered Mobile number" />
                                        <label for="number">Registered Mobile number</label>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-9">
                                    <div className="form-floating">
                                        <input type="password" className="form-control datetimepicker-input" id="datetime" placeholder="password" />
                                        <label for="password">Password</label>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-12"></div>
                                <div className="col-md-12"></div>
                               <div className="col-9">
                                
                                    <button className="btn btn-primary w-100 py-3" type="submit">login</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Login;