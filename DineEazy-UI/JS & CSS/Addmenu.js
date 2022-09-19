import React from "react";
import imglogin from '../assets/cafe-mozaic.webp';

const Addmenu = props =>{


    return(
        
        
        <div className="container-xxl py-5 px-0 wow fadeInUp" data-wow-delay="0.1s">
            <div className="col-md-12 bg-dark d-flex align-items-center">
                        <div className="p-0 wow fadeInUp" data-wow-delay="0.2s">
                                <div className="col-12 py-4">
                                    <br/><br/><h4  className="section-title ff-secondary text-start text-primary fw-normal">&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Select Food Items from Cuisines to add to the Restaurant</h4>
                                    </div>
                        <form> 
                            <div className="row g-3">
                            <div className="col-md-2"></div>
                            <div className="col-md-2"></div>
                            
                                {/*******************************************************************************************/} 
                
                                      <div className="col-md-8">
                                        <div className="htmlForm-floating">
                                            <input type="text" className="htmlform-control" id="text" placeholder="Food Name" />
                                            <label htmlFor="text">Food Name</label>
                                        </div>
                                        </div>

                                        
                              {/*******************************************************************************************/}
                              <div className="col-2"></div>
                              <div className="col-3" >    
                              <div class="dropdown">
                              
                                <button  class="btn btn-secondary dropdown-toggle w-100 py-1" style={{backgroundColor:"#FEA116"}} type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false" >&ensp;&ensp;&ensp;&ensp;Break Fast&ensp;&ensp;&ensp;&ensp;</button>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" name="a" type="radio"  value="7.00 AM" />
                                        <label class="form-check-label">&ensp; 7.00 AM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input"  name="a" type="radio" value="8.00 AM" />
                                        <label class="form-check-label">&ensp; 8.00 AM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input"  name="a" type="radio" value="9.00 AM " />
                                        <label class="form-check-label">&ensp; 9.00 AM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input"  name="a" type="radio" value="10.00 AM " />
                                        <label class="form-check-label">&ensp; 10.00 AM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input"  name="a" type="radio" value="11.00 AM" />
                                        <label class="form-check-label">&ensp; 11.00 AM &ensp;</label>
                                    </a>
                                  </li>
                                </ul>
                              </div>
                              </div>
                            
                              
                              {/*******************************************************************************************/}
                             
                              <div className="col-3" >    
                               <div class="dropdown">
                                <button    class="btn btn-secondary dropdown-toggle w-100 py-1" style={{backgroundColor:"#FEA116"}} type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false" >&ensp;&ensp;&ensp;&ensp;Dinner&ensp;&ensp;&ensp;&ensp;</button>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="6.00 PM" />
                                        <label class="form-check-label">&ensp; 6.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="7.00 PM" />
                                        <label class="form-check-label">&ensp; 7.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="8.00 PM " />
                                        <label class="form-check-label">&ensp; 8.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="9.00 PM " />
                                        <label class="form-check-label">&ensp; 9.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="10.00 PM " />
                                        <label class="form-check-label">&ensp; 10.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="11.00 PM" />
                                        <label class="form-check-label">&ensp; 11.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                </ul>
                              </div>
                              </div>
                            {/******************************************************************************************************/}
                              <div className="col-3" >    
                               <div class="dropdown">
                                <button class="btn btn-secondary dropdown-toggle w-100 py-1" style={{backgroundColor:"#FEA116"}} type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false" >&ensp;&ensp;&ensp;&ensp;Lunch&ensp;&ensp;&ensp;&ensp;</button>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="12.00 PM" />
                                        <label class="form-check-label">&ensp; 12.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="1.00 PM" />
                                        <label class="form-check-label">&ensp; 1.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="2.00 PM" />
                                        <label class="form-check-label">&ensp; 2.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="3.00 PM" />
                                        <label class="form-check-label">&ensp; 3.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="4.00 PM" />
                                        <label class="form-check-label">&ensp; 4.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                  <li>
                                     <a class="dropdown-item">
                                        <input class="form-check-input" type="radio" name="a" value="5.00 PM" />
                                        <label class="form-check-label">&ensp; 5.00 PM &ensp;</label>
                                    </a>
                                  </li>
                                </ul>
                              </div>
                              </div>
                              {/*******************************************************************************************/}
                              <div className="col-md-2"></div>
                                        <div className="col-md-8">
                                        <div className="htmlForm-floating">
                                            <input type="text" className="htmlForm-control" id="text" placeholder="restaurant name" />
                                            <label htmlFor="text">Restaurant Name</label>
                                        </div>
                                        </div>
                               {/*******************************************************************************************/}
                              
                             {/*******************************************************************************************/}

 
                    
                             </div>
                        </form>
                     </div>
                     </div>
                    </div>
                
        
                                            
    );
}



export default Addmenu;