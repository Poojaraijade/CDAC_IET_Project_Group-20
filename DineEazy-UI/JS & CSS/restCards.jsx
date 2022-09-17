import React from "react";
import imag1 from '../assets/cafe-mozaic.webp';
import "../css/card-style.css";

const RestCards = props =>{
    return(
        <div className="card text-center shadow">
            <div className="overflow">
                <img src={imag1} alt="img1" className="card-img-top"/>
            </div>
            <div className="card-body text-dark">
                <h4 className="card-title">Coriander Kitchen</h4>
                <p className="card-text text-secondary">
                    Conrad Pune, Pune
                    30% off
                </p>
                <div className="btn btn-outline-primary w-80 py-0" >
                <div class="btn-group">
                    <a class="btn" href="#">Book Now</a>
                </div>
                </div>
                <div className="btn btn-primary w-20 py-2" >
                <div class="btn-group">
                    <a class="btn" ><i class="icon-plus">&#9733; 4.5</i></a>
                </div>
                </div>

            </div>
        </div>   
    );
}

export default RestCards;