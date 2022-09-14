import About from "../Components/About";
import Footer from "../Components/Footer";
import HomeRestCards from "../Components/HomeRestCards";
import Navbar from "../Components/Navbar";
import Service from "../Components/Service";


function Home() {
    return (
      <div className="container-xxl bg-white p-0">
        {/* <Spinner></Spinner> */}
        <Navbar></Navbar>
        <Service></Service>
        <About></About>
        <HomeRestCards></HomeRestCards>
        <HomeRestCards></HomeRestCards>
        {/* <Testimonial></Testimonial> */}
        <Footer></Footer>
        <a href="#" className="btn btn-lg btn-primary btn-lg-square back-to-top"><i className="bi bi-arrow-up"></i></a>
      </div>
    );
  }

  export default Home;