import React from "react";
import img1 from '../assets/addmenu.jpg';
import img2 from '../assets/reserved.jpg';

const Mybookings = props =>{
    return(
        <div className="container-xxl py-5 px-0 wow fadeInUp" data-wow-delay="0.1s">
            <div className="row g-0">
                <div className="col-md-4">
                    <div>
                        <img src={img1} alt="login-image" height={800} width={1200}></img>
                    </div>
                </div>
                <div className="col-md-8 bg-dark d-flex align-items ">
                    <div className="p-5 wow fadeInUp" data-wow-delay="0.2s">
                        <h1 className="section-title ff-secondary text-start text-primary fw-normal">My Bookings</h1><br/><br/><br/>
            
                        <form>
                            <div className="row g-3">
                                <div className="col-md-12">
                                    <div className="form-floating">
                                    
                                    <table border={4} >
                                    <tr>
                                        <td rowspan="3"><img src={img2} alt="login" width={200}></img></td>
                                        <td className="text-primary">&ensp;Restaurant Name : Radission &ensp;</td> 
                                        <td className="text-primary" colSpan="2">&ensp;Booking Status : conformed &ensp;</td>
                                    </tr>
                                    <tr>
                                        <td className="text-primary">&ensp;Name : Ankit Raut &ensp;</td>
                                        <td className="text-primary">&ensp;No. of Guest : 5 &ensp; </td>
                                        
                                    </tr>
                                    <tr>
                                        <td className="text-primary">&ensp;Time Slot : 7.00 PM &ensp; </td>
                                        <td className="text-primary">&ensp;Booking Amount : Rs4000 &ensp;</td>
                                    </tr>  
                                    </table><br/><br/>

                                    <table border={4} >
                                    <tr>
                                        <td rowspan="3"><img src={img2} alt="login" width={200}></img></td>
                                        <td className="text-primary">&ensp;Restaurant Name : Radission &ensp;</td> 
                                        <td className="text-primary" colSpan="2">&ensp;Booking Status : conformed &ensp;</td>
                                    </tr>
                                    <tr>
                                        <td className="text-primary">&ensp;Name : Ankit Raut &ensp;</td>
                                        <td className="text-primary">&ensp;No. of Guest : 5 &ensp; </td>
                                        
                                    </tr>
                                    <tr>
                                        <td className="text-primary">&ensp;Time Slot : 7.00 PM &ensp; </td>
                                        <td className="text-primary">&ensp;Booking Amount : Rs4000 &ensp;</td>
                                    </tr>  
                                    </table>
                            
                                   
                                        <button className="btn btn-primary w-100 py-1" type="submit">Cancel Booking</button>
                
                                    <br/><br/>

                                    <table border={4} >
                                    <tr>
                                        <td rowspan="3"><img src={img2} alt="login" width={200}></img></td>
                                        <td className="text-primary">&ensp;Restaurant Name : Radission &ensp;</td> 
                                        <td className="text-primary" colSpan="2">&ensp;Booking Status : conformed &ensp;</td>
                                    </tr>
                                    <tr>
                                        <td className="text-primary">&ensp;Name : Ankit Raut &ensp;</td>
                                        <td className="text-primary">&ensp;No. of Guest : 5 &ensp; </td>
                                        
                                    </tr>
                                    <tr>
                                        <td className="text-primary">&ensp;Time Slot : 7.00 PM &ensp; </td>
                                        <td className="text-primary">&ensp;Booking Amount : Rs4000 &ensp;</td>
                                    </tr>  
                                    </table><br/><br/>
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

export default Mybookings;