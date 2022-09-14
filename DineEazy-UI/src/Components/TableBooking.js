import BookingRestCards from "./BookingRestCards";
import Footer from "./Footer";
import Reservation from "./Reservation";
import Spinner from "./Spinner";
import TableBookingNavbar from "./TableBookingNavbar";


function TableBooking() {
    return (
      <div className="container-xxl bg-white p-0">
        {/* <ImageUpload></ImageUpload> */}
        {/* <Spinner></Spinner> */}
        <TableBookingNavbar></TableBookingNavbar>
        <BookingRestCards></BookingRestCards>
        {/* <Service></Service> */}
        {/* <About></About> */}
        {/* <Team></Team> */}
        {/* <Testimonial></Testimonial> */}
        {/* <Reservation></Reservation> */}
        <Footer></Footer>
        <a href="#" className="btn btn-lg btn-primary btn-lg-square back-to-top"><i className="bi bi-arrow-up"></i></a>
      </div>
    );
  }

  export default TableBooking;