import React from "react";
import "../css/Day.css";
import imglogin from '../assets/cafe-mozaic.webp';



const EachRestroPage = props =>{

    return(
        
        
        <div className="container-xxl py-5 px-0 wow fadeInUp" data-wow-delay="0.1s">
            <div className="row g-0">
            <div className="col-md-12 bg-dark d-flex align-items-center">
                        <div className="p-0 wow fadeInUp" data-wow-delay="0.2s"></div>

                        <div>
                        <img src={imglogin} class="card-img" style={{maxWidth:"90rem",maxHeight:"25rem"}}/>
                        <div className="col-12">
                            <div class="card-body" className="col-md-12 bg-dark ">
                            <h2 class="card-title" className="btn btn-primary w-100 py-3" style={{color:"#0F172B"}}  >Hotel Radisson blu, Nagpur, 440025</h2>
                            </div>
                        </div>
         
                        <br/><br/><h4 className="section-title ff-secondary text-start text-primary fw-normal">&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Make a Revervation</h4>
                        
                        <form > 
                            <div className="row g-3">
                            <div className="col-md-2"></div>
                                
                                <div className="col-md-8">
                                    <input type="date" id="DatetimeLocal" className="form-control"  />
                                </div>

                                <div className="col-md-2"></div>
                                <div className="col-md-2"></div>
                                <div className="col-1">
                                     <button className=" btn-primary w-100 py-1" type="11.00 AM">11.00 AM</button>
                                </div>  
                                <div className="col-1">
                                    <button className=" btn-primary w-100 py-1" type="12.00 PM">12.00 PM</button>
                                </div>
                                <div className="col-1">
                                    <button className=" btn-primary w-100 py-1" type="01.00 PM">01.00 PM</button>
                                </div>
                                <div className="col-1">
                                    <button className=" btn-primary w-100 py-1" type="02.00 PM">02.00 PM</button>
                                </div>
                                <div className="col-1">
                                    <button className=" btn-primary w-100 py-1" type="11.00 AM">08.00 AM</button>
                                </div>  
                                <div className="col-1">
                                    <button className=" btn-primary w-100 py-1" type="12.00 PM">10.00 PM</button>
                                </div>
                                <div className="col-1">
                                    <button className=" btn-primary w-100 py-1" type="07.00 PM">07.00 PM</button>
                                </div>
                                <div className="col-1">
                                     <button className=" btn-primary w-100 py-1" type="05.00 PM">05.00 PM</button>
                           </div>                                        
                             
                


                                <div className="col-md-2"></div>
                                <div className="col-md-2"></div>
                            <div className="col-md-4">
                                <div className="form-floating">
                                    <input type="text" className="form-control" id="text" placeholder="contact person name" />
                                    <label for="text">Name</label>
                                </div>
                             </div>   
                                <div className="col-md-4">
                                    <div className="form-floating">
                                        <input type="number" className="form-control" id="number" placeholder="seats" />
                                        <label for="number">Mobile Number</label>
                                    </div>
                                </div>

                                <div className="col-md-2"></div>
                                <div className="col-md-2"></div>
                            <div className="col-md-8">
                                <div className="form-floating">
                                    <input type="number" className="form-control" id="number" placeholder="number" />
                                    <label for="number">Number of Guest</label>
                                </div>
                             </div>   
                             
                                <div className="col-md-2"></div>
                                <div className="col-md-2"></div>
                                <div className="col-md-8">
                                <div className="form-floating">
                                    <input type="number" className="form-control" id="number" placeholder="number" disabled/>
                                    <label for="number">Payable Amount</label>
                                </div>
                             </div>   
                                
                                <div className="col-md-2"></div>
                                <div className="col-md-8"></div>
                                <div className="col-md-2"></div>
                                <div className="col-md-2"></div>
                                <div className="col-md-2"></div>
                               <div className="col-8">
                                    <button className="btn btn-primary w-100 py-3" type="submit">Pay &ensp;&ensp; & &ensp;&ensp;Book</button>
                               </div>                            
                            
                             </div>

                            <br/><br/> <br/><br/><h4 className="section-title ff-secondary text-start text-primary fw-normal">&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Features</h4>                        
                             <div className="col-md-2"></div>
                             <div className="col-md-2"></div>
                             <div className="col-md-3"></div>
                                 <div className="col-md-12">
                                 <div className="htmlForm-floating">
                                 <div class="form-check">
                                     <center><table>
                                    <tr>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Air Condition &ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" checked />
                                            <label class="form-check-label">Live Music &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Outdoor Seating &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>   
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Lift &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                    </tr>
                                    <tr> 
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Crad Accepted&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Bar & Pubs &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Child Allowed &ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Live Music &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                    </tr>
                                    <tr>    
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Live Performance &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Alcohol Served &ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled">Smoking Area&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                        <td>
                                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDisabled" checked/>
                                            <label class="form-check-label" for="flexCheckDisabled"> DJ &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;</label>
                                        </td>
                                    </tr>   
                                 </table></center><br/><br/><br/>
                               </div>
                             </div>
                             </div>
                        </form>
                     </div>
                     </div>
                    </div>
                   </div>
                                            
    );
}



export default EachRestroPage;