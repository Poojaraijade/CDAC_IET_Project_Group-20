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
                                        <div className="col-md-10">
                                        <pre>
                                            <div className="htmlForm-floating"><input type="file" id="photo" name="photo" accept="image/*" /></div>
                                        </pre>
                                        </div>

                                        <div className="col-md-2"></div>
                                        <div className="col-md-2">
                                        <input type="text" className="htmlForm-control" id="text" placeholder="Select Cuisines" disabled/>
                                        </div>
                                        <div className="col-md-6">
                                        <div className="htmlForm-floating">
                                        <div class="checkbox">
                                        <table>
                                            <tr>
                                                <td><label><input type="checkbox" value=""/>&ensp; Maharashtrian</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; South Indian</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; North Indian</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Chinese</label></td>
                                            </tr>
                                            <tr>
                                                <td><label><input type="checkbox" value=""/>&ensp; Fast Food</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Thai Food</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Italian</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Bengali</label></td>
                                            </tr>
                                            <tr>
                                                <td><label><input type="checkbox" value=""/>&ensp; Hyderabadi</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Mexican</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Rajastani</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Japanese</label></td>
                                            </tr>
                                        </table>
                                      </div>
                                    </div>
                                    </div>

                                    <div className="col-md-2"></div>
                                    <div className="col-md-2"></div>
                                        <div className="col-md-2">
                                        <input type="text" className="htmlForm-control" id="text" placeholder="Select Features" disabled/>
                                        </div>
                                        <div className="col-md-6">
                                        <div className="htmlForm-floating">
                                        <div class="checkbox">
                                            <table>
                                            <tr>
                                                <td><label><input type="checkbox" value=""/>&ensp; Air Condition</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Live Music</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Outdoor Seating</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; </label>Lift</td>
                                            </tr>
                                            <tr>
                                                <td><label><input type="checkbox" value=""/>&ensp; Smoking Area</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Alcohol Served</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Child Allowed</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Parking</label></td>
                                            </tr>
                                            <tr>
                                                <td><label><input type="checkbox" value=""/>&ensp; Card Accepted</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Bar & Pubs</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; Live Performance</label></td>
                                                <td><label><input type="checkbox" value=""/>&ensp; </label>DJ</td>
                                            </tr>
                                        </table> 
                                      </div>
                                    </div>
                                    </div>
                                    <div className="col-md-2"></div>
                                    <div className="col-md-2"></div>
                                    <div className="col-md-12"></div>

                                    
    
    
    
                                
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