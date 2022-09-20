import ankit from '../assets/ankit.jpg';
import ranjeet from '../assets/ranjeet.jpg';
import rajat from '../assets/rajat.jpg';
import pooja from '../assets/pooja.jpg';
import paresh from '../assets/paresh.jpg';
import amol from '../assets/amol.jpg';

import "../css/card-style.css";

function Team(){
    return(
        <div className="container-xxl pt-5 pb-3">
            <div className="container">
                <div className="text-center wow fadeInUp" data-wow-delay="0.1s">
                    <h2 className="section-title ff-secondary text-center text-primary fw-normal">Team Members</h2><br/><br/><br/>
                </div>
                <div className="row g-4">
                <div className="col-lg-2 col-md-2 wow fadeInUp" data-wow-delay="0.3s">
                <div className=" text-center rounded overflow-hidden">
                    <div className="rounded-circle overflow-hidden m-4">
                        <img className="img-fluid" src={ankit} alt=""/>
                    </div>
                    <h6 className="text-primary">Ankit Raut</h6>
                </div>
            </div>
                    <div className="col-lg-2 col-md-2 wow fadeInUp" data-wow-delay="0.3s">
                        <div className=" text-center rounded overflow-hidden">
                            <div className="rounded-circle overflow-hidden m-4">
                                <img className="img-fluid" src={amol} alt=""/>
                            </div>
                            <h6 className="text-primary">Amol Deore</h6>
                        </div>
                    </div>
                    <div className="col-lg-2 col-md-2 wow fadeInUp" data-wow-delay="0.5s">
                        <div className=" text-center rounded overflow-hidden">
                            <div className="rounded-circle overflow-hidden m-4">
                                <img className="img-fluid" src={pooja} alt=""/>
                            </div>
                            <h6 className="text-primary">Pooja Raijade</h6>
                        </div>
                    </div>
                    <div className="col-lg-2 col-md-2 wow fadeInUp" data-wow-delay="0.3s">
                        <div className=" text-center rounded overflow-hidden">
                            <div className="rounded-circle overflow-hidden m-4">
                                <img className="img-fluid" src={paresh} alt=""/>
                            </div>
                            <h6 className="text-primary">Paresh Londhe</h6>
                        </div>
                    </div>
                    <div className="col-lg-2 col-md-2 wow fadeInUp" data-wow-delay="0.3s">
                        <div className=" text-center rounded overflow-hidden">
                            <div className="rounded-circle overflow-hidden m-4">
                                <img className="img-fluid" src={ranjeet} alt=""/>
                            </div>
                            <h6 className="text-primary">Ranjeet Kumkar</h6>
                        </div>
                    </div>
                    <div className="col-lg-2 col-md-2 wow fadeInUp" data-wow-delay="0.7s">
                        <div className=" text-center rounded overflow-hidden">
                            <div className="rounded-circle overflow-hidden m-4">
                                <img className="img-fluid" src={rajat} alt=""/>
                            </div>
                            <h6 className="text-primary">Rajat Sabale</h6>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Team;