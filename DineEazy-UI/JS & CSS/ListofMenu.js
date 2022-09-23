import React from "react";
import imglogin from '../assets/cafe-mozaic.webp';

const ListofMenu = props =>{
    return(

        <div className="container-fluid py-10 px-0 wow fadeInUp" data-wow-delay="0.1s">
        <div className="row g-0">
        <div className="col-md-12 d-flex align-items-center">
                <div className="p-0 wow fadeInUp" data-wow-delay="0.2s">

                <div>
                <img src={imglogin} class="card-img" style={{width:1320,height:300}}/>
                <div className="col-12">
                    <div class="card-body" className="col-md-12 bg-dark">
                    <h2 class="card-title" className="btn btn-primary w-100 py-3" style={{color:"#0F172B"}}  >Hotel Radisson blu, Nagpur, 440025</h2>
                    </div>
                </div>
                
                        <div className="text-center wow fadeInUp" data-wow-delay="0.1s">
                            <br/><br/><h2 className="section-title ff-secondary text-center text-primary fw-normal">Menu at [Restaurant Name]</h2><br/><br/><br/>
                        </div>

                            <form >                         
                                <div class="tab-content">
                                    <div id="tab-1" class="tab-pane fade show p-0 active">
                                        <div className="row g-4">
                                       {/*************************************************************************************/}
                                            <div className="col-lg-2"></div>
                                                <div className="col-lg-8">
                                                    <div className="d-flex align-items-center">
                                                        <i className="fa fa-utensils fa-3x text-primary"></i>
                                                            <div className="w-100 d-flex flex-column text-start ps-4">
                                                                <h5 className="d-flex justify-content-between border-bottom pb-2">
                                                                    <span>Chicken Burger</span>
                                                                    <span className="text-primary">&#8377; 200 &ensp;&ensp;&ensp;&ensp;&ensp;</span>
                                                                </h5>
                                                                <small class="fst-italic">Cuisine : From database</small>
                                                            </div>
                                                            <div className="col-lg-1">
                                                            <input type="number" className="form-control" value="" id="number" placeholder="" />
                                                          </div>
                                                         <div className="col-lg-2">
                                                            <button className="btn btn-primary w-50 py-2" type="button">&#43;</button>
                                                         </div>
                                                        </div>
                                                    </div>   
                                                    <div class="col-lg-1"></div>
                                             {/*************************************************************************************/}    
                                             <div className="col-lg-2"></div>   
                                             <div class="col-lg-8">
                                                 <div class="d-flex align-items-center">
                                                     <i class="fa fa-utensils fa-3x text-primary"></i>
                                                         <div class="w-100 d-flex flex-column text-start ps-4">
                                                             <h5 class="d-flex justify-content-between border-bottom pb-2">
                                                                 <span>Chicken Burger</span>
                                                                 <span class="text-primary">&#8377; 200 &ensp;&ensp;&ensp;&ensp;&ensp;</span>
                                                             </h5>
                                                             <small class="fst-italic">Cuisine : From database</small>
                                                         </div>
                                                         <div className="col-lg-1">
                                                            <input type="number" className="form-control" value="" id="number" placeholder="" />
                                                          </div>
                                                         <div className="col-lg-2">
                                                            <button className="btn btn-primary w-50 py-2" type="button">&#43;</button>
                                                         </div>
                                                     </div>
                                                 </div>   
                                                 <div class="col-lg-1"></div>
                                                 <div className="col-lg-12"></div>
                                                 
                                            {/*************************************************************************************/} 
                                            <br/><h2 className="ff-secondary text-center text-primary ">----------------------------------------------------------------------------------</h2>
                                                <div className="col-lg-1"></div>   
                                                <div class="col-lg-9">
                                                    <div class="d-flex align-items-center">
                                                        <i class="fa  fa-6x text-primary">&#8377;</i>
                                                            <div class="w-100 d-flex flex-column text-start ps-4">
                                                                <h5 class="d-flex justify-content-between border-bottom pb-2">
                                                                    <span>Grand Total</span>
                                                                    <span class="text-primary fa-2x"> 200 /-&ensp;&ensp;&ensp;&ensp;&ensp;</span>
                                                                </h5>
                                                                <small class="fst-italic">Including all taxes+ 18% GST</small>
                                                            </div>
                                                            <div className="col-lg-3">
                                                                <button className="btn btn-primary w-100 py-3" type="button">Place your Order</button>
                                                            </div>
                                                        </div>
                                                    </div>   
                                                    <div class="col-lg-1"></div>
                                           
                                            {/*************************************************************************************/}                                            
                                            <div className="col-lg-12"></div>
                                           
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                </div>    
       
    );
}

export default ListofMenu;
