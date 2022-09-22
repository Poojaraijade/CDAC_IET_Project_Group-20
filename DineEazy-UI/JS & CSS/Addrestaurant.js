import React from "react";


const Addrestaurant = props =>{
    return(
        <div>
                <div className="container-xxl py-5 px-0 wow fadeInUp" data-wow-delay="0.1s">
                <div className="row g-0">
                    <div className="col-md-12 bg-dark d-flex align-items-center">
                        <div className="p-5 wow fadeInUp" data-wow-delay="0.2s">
                            <center><h3 className="section-title ff-secondary text-start text-primary fw-normal">Please fill the following feilds to book your Table</h3></center><br /><br />
                            <htmlForm > 
                                <div className="row g-3">

                                     <div className="col-md-2"></div>
                                        <div className="col-md-8">
                                        <div className="htmlForm-floating">
                                            <input type="text" className="htmlForm-control" id="text" placeholder="restaurant name" />
                                            <label htmlFor="text">Restaurant Name</label>
                                        </div>
                                        </div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-8">
                                        <div className="htmlForm-floating">
                                            <input type="text" className="htmlForm-control" id="text" placeholder="restaurant address" />
                                            <label htmlFor="text">Restaurant Address</label>
                                        </div>
                                        </div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-4">
                                        <div className="htmlForm-floating">
                                            <input type="number" className="htmlForm-control" id="number" placeholder="Mobile number" />
                                            <label htmlFor="number">contact number</label>
                                        </div>
                                        </div>
                                        <div className="col-md-4">
                                        <div className="htmlForm-floating">
                                            <input type="email" className="htmlForm-control datetimepicker-input" id="email" placeholder="email" />
                                            <label htmlFor="password">Email</label>
                                        </div>
                                        </div>

                                        <div className="col-md-2"></div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-8">
                                        <div className="htmlForm-floating">
                                          <select className="htmlForm-control" name="cities" id="city" >
                                          <option selected disabled value="select">--Select the City--</option>
                                          <option value="Delhi">Delhi</option>
                                          <option value="Mumbai">Mumbai</option>
                                          <option value="Pune">Pune</option>
                                          <option value="Banglore">Banglore</option>
                                          </select>                 
                                        </div>
                                        </div>

                                        <div className="col-md-2"></div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-4">
                                        <div className="htmlForm-floating">
                                        <input type="text" className="htmlForm-control" id="text" placeholder="contact person name" />
                                        <label htmlFor="text">Executive's Name</label>
                                        </div>
                                        </div>

                                        <div className="col-md-4">
                                        <div className="htmlForm-floating">
                                            <input type="number" className="htmlForm-control" id="number" placeholder="seats" />
                                            <label htmlFor="number">Number of Seats</label>
                                        </div>
                                        </div>

                                        <div className="col-md-2"></div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-4">
                                        <div className="htmlForm-floating">
                                        <input type="time" className="htmlForm-control" id="time" placeholder="openig time" />
                                        <label htmlFor="time">Opening Time</label>
                                        </div>
                                        </div>

                                        <div className="col-md-4">
                                        <div className="htmlForm-floating">
                                            <input type="time" className="htmlForm-control" id="time" placeholder="closing time" />
                                            <label htmlFor="time">Closing Time</label>
                                        </div>
                                        </div>

                                        <div className="col-md-2"></div>
                                        <div className="col-md-2"></div>
                                        <div className="col-md-8">
                                        <div className="htmlForm-floating">
                                            <input type="number" className="htmlForm-control" id="number" placeholder="amount per person" />
                                            <label htmlFor="number">Booking Amount Per Person</label>
                                        </div>
                                        </div>
    
                                        <div className="col-md-2"></div>
                                        <div className="col-md-2"></div>
                                              {/********************************************************************************************************/}
                    
                       <div className="col-md-4" >    
                       <div class="dropdown">
                       
                         <button  class="btn btn-secondary dropdown-toggle w-100 py-3"  type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false" >&ensp;&ensp;Select the cuisines &ensp;&ensp;</button>
                         <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input" name="1" type="radio"  value="Maharashtrian" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Maharashtrian &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="2" type="radio" value="South Indian" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; South Indian &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="3" type="radio" value="North Indian	" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; North Indian &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="4" type="radio" value="Chinese" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Chinese &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="5" type="radio" value="Fast Food" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Fast Food &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="6" type="radio" value="Thai Food" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Thai Food &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="7" type="radio" value=" Italian" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp;  Italian &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="8" type="radio" value="Bengali" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Bengali &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="9" type="radio" value="Rajastani" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Rajastani &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="10" type="radio" value="Hyderabadi" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Hyderabadi &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="11" type="radio" value="Mexican" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Mexican &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input"  name="12" type="radio" value="Japanese" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Japanese &ensp;</label>
                             </a>
                           </li>
                         </ul>
                       </div>
                       </div>

                        {/******************************************************************************************************/}

                  
                     
                     <div className="col-md-4" >    
                        <div class="dropdown">
                         <button class="btn btn-secondary dropdown-toggle w-100 py-3"  type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false" >&ensp;&ensp;&ensp;Select Features&ensp;&ensp;&ensp;&ensp;</button>
                         <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input" type="radio" name="13" value="Air Condition" onClick={(e)=>{cuisinesList.push(e.target.value)}}/>
                                 <label class="form-check-label">&ensp; Air Condition &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input" type="radio" name="14" value="Live Music" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Live Music &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input" type="radio" name="15" value="Outdoor Seating" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Outdoor Seating &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input" type="radio" name="16" value=" Lift" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp;  Lift &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input" type="radio" name="17" value="Card Accepted" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Card Accepted &ensp;</label>
                             </a>
                           </li>
                           <li>
                              <a class="dropdown-item">
                                 <input class="form-check-input" type="radio" name="18" value="Bar & Pubs" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                 <label class="form-check-label">&ensp; Bar & Pubs &ensp;</label>
                             </a>
                           </li>
                            <li>
                            <a class="dropdown-item">
                                <input class="form-check-input" type="radio" name="19" value="Child Allowed" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                <label class="form-check-label">&ensp; Child Allowed &ensp;</label>
                            </a>
                            </li>
                             <li>
                                <a class="dropdown-item">
                                <input class="form-check-input" type="radio" name="20" value="Live Music" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                <label class="form-check-label">&ensp; Live Music &ensp;</label>
                            </a>
                            </li>
                            <li>
                            <a class="dropdown-item">
                                <input class="form-check-input" type="radio" name="21" value="Live Performance" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                <label class="form-check-label">&ensp; Live Performance &ensp;</label>
                            </a>
                            </li>
                            <li>
                            <a class="dropdown-item">
                                <input class="form-check-input" type="radio" name="22" value="Alcohol Served" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                <label class="form-check-label">&ensp; Alcohol Served &ensp;</label>
                            </a>
                        </li>
                        <li>
                        <a class="dropdown-item">
                            <input class="form-check-input" type="radio" name="23" value="Smoking Area" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                            <label class="form-check-label">&ensp; Smoking Area &ensp;</label>
                        </a>
                        </li>
                            <li>
                                <a class="dropdown-item">
                                <input class="form-check-input" type="radio" name="24" value="DJ" onClick={(e)=>{cuisinesList.push(e.target.value)}} />
                                <label class="form-check-label">&ensp; DJ &ensp;</label>
                            </a>
                            </li>
                         </ul>
                       </div>
                       </div>
                        
                       <div className="col-md-2"></div>
                       <div className="col-md-2"></div>
                       <div className="col-md-8">
                       <div className="form-floating">
                       <div className=" w-100 py-3" style={{backgroundColor:"darkgrey"}}>
                       <input type="file" style={{paddingInline:10}} id="photo" name="photo" accept="image/*" onChange={(e) => {
                                       setImage(e.target.files[0])}}/>
                       </div>
                       </div>
                       </div>
                       <div className="col-md-2"></div>
                       <div className="col-md-2"></div>

                                   
                                    <div className="col-md-2"></div>
                                   <div className="col-8">
                                        <button className="btn btn-primary w-100 py-3" type="submit">Submit</button>
                                   </div>
                                 </div>
                            </htmlForm>
                         </div>
                        </div>
                       </div>
                       </div>    
        </div>
     
  

    );
}

export default Addrestaurant;
