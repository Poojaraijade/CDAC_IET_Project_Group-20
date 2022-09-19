import React from "react";
import img from '../assets/addmenu.jpg';

const FoodMenu = props =>{
    return(
        <div className="container-xxl py-5 px-0 wow fadeInUp" data-wow-delay="0.1s">
            <div className="row g-0">
                <div className="col-md-4">
                    <div>
                        <img src={img} alt="login-image" width={1200}></img>
                    </div>
                </div>
                <div className="col-md-8 bg-dark d-flex align-items-center ">
                    <div className="p-5 wow fadeInUp" data-wow-delay="0.2s">
                        <h3 className="section-title ff-secondary text-start text-primary fw-normal">Select Food Items from Cuisines to add to the Restaurant</h3><br/><br/><br/>
            
                        <form>
                            <div className="row g-3">
                                <div className="col-md-12">
                                    <div className="form-floating">
                                    <input type="text" name="name" className="form-control" id="text" placeholder="Food name"  />
                                    <label for="text"> Food Name</label>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-12">
                                    <div className="form-control">
                                    <select   id="sel">
                                    <option name="" disabled >&ensp;---- Select  the  type  of  Cuisine ----</option>
                                    <option name="" value="">Maharashtrian</option>
                                    <option name="" value="">South Indian</option>
                                    <option name="" value="">North Indian</option>
                                    <option name="" value="">Chinese</option>
                                    <option name="" value="">Fast Food</option>
                                    <option name="" value="">Thai Food</option>
                                    <option name="" value="">Italian</option>
                                    <option name="" value="">Bengali</option>
                                    <option name="" value="">Hyderabadi</option>
                                    <option name="" value="">Mexican</option>
                                    <option name="" value="">Rajastani</option>
                                    <option name="" value="">Japanese</option>
                                </select>
                                    </div>
                                </div>

                                <div className="col-md-3"></div>
                                <div className="col-md-12">
                                    <div className="form-control">
                                    <select   id="sel">
                                    <option name="" disabled >&ensp;---- Select  the  Food category ----</option>
                                    <option name="" value="">Main Course</option>
                                    <option name="" value="">Rice</option>
                                    <option name="" value="">Indian Breads</option>
                                    <option name="" value="">Curry</option>
                                    <option name="" value="">Dessert</option>
                                    <option name="" value="">Starter</option>
                                    <option name="" value="">Soup</option>
                                    <option name="" value="">Salad</option>
                                    <option name="" value="">Continental</option>
                                    <option name="" value="">Beverage</option>
                                </select>
                                    </div>
                                </div>
                                <div className="col-md-3"></div>    
                                <div className="col-md-12">
                                <div className="form-floating">
                                <input type="number" name="name" className="form-control" id="number" placeholder="Unit Price"  />
                                <label for="number"> Unit Price in &#8377;</label>
                                </div>
                            </div>
                                <div className="col-md-3"></div>
                                <div className="col-md-12"></div>
                                <div className="col-md-12"></div>
                               <div className="col-12">
                                
                                    <button className="btn btn-primary w-100 py-3" type="Add Food Item">Add Food Item</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default FoodMenu;