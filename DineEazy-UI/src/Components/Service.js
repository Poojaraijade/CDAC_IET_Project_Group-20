import React from 'react';

function Service(){
    return(
        <div className="container-xxl py-5">
            <div className="container">
                <div className="row g-4">
                    <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.1s">
                        <div className="service-item rounded pt-3">
                            <div className="p-4">
                                <i className="fa fa-3x fa-user-tie text-primary mb-4"></i>
                                <h5>Master Chefs</h5>
                                <p>We have Top Chefs from famous Restaurants to keep food quality top notch.</p>
                            </div>
                        </div>
                    </div>
                    <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.3s">
                        <div className="service-item rounded pt-3">
                            <div className="p-4">
                                <i className="fa fa-3x fa-utensils text-primary mb-4"></i>
                                <h5>Quality Food</h5>
                                <p>We Serve Qaulity Food that has Wide Varity and Original Taste</p>
                            </div>
                        </div>
                    </div>
                    <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.5s">
                        <div className="service-item rounded pt-3">
                            <div className="p-4">
                                <i className="fa fa-3x fa-star text-primary mb-4"></i>
                                <h5>5 Star Hotels</h5>
                                <p>We Partner only 5 Starred Hotels to give the Best Service to our Usrs</p>
                            </div>
                        </div>
                    </div>
                    <div className="col-lg-3 col-sm-6 wow fadeInUp" data-wow-delay="0.7s">
                        <div className="service-item rounded pt-3">
                            <div className="p-4">
                                <i className="fa fa-3x fa-headset text-primary mb-4"></i>
                                <h5>Instant Help</h5>
                                <p>We try to Keep our HekpDesk on 24/7 to Listen to our Customer's Querries and Help Imidiately</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    )
}

export default Service
