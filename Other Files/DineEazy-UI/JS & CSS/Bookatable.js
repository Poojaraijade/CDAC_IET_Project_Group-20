import React,{Component} from "react";
import RestCards from "./restCards";


class Bookatable extends Component {

    render(){
        return(
            <div className="container-xxl pt-5 pb-3">
            <div className="container">
                <div className="text-center wow fadeInUp" data-wow-delay="0.1s">
                <div className="text-right wow fadeInUp" data-wow-delay="0.1s">
                <div className="container-fluid d-flex flex-row-reverse justify-content-right">
                <h5>
                <a style={{Color:"#FEA116"}}><label> Sort By :  </label></a>
                <select>  
                <option selected disabled value="select"> ---- Select ----</option>
                <option value = "Rating"> Rating </option>  
                <option value = "Popularity"> Popularity </option>  
                <option value = "Low to high"> Price : Low to High  </option>  
                <option value = "high to low"> Price : High to Low </option>  
                </select>  <br/><br/><br/><br/>
                </h5> 
                </div>
                </div>
                </div>
                <div className="container-fluid d-flex justify-content-center">
                    <div className="row">
                        <div className="col-md-3">
                           <br/> <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                        <br/><RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                        <br/> <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                        <br/> <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                        <div className="col-md-3">
                            <RestCards></RestCards><br/>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        );
    }
}

export default Bookatable;