import './App.css';
import Spinner from './Components/Spinner';
import Navbar from './Components/Navbar';
import Demo from './Components/Demo';
import Service from './Components/Service';
import Testimonial from './Components/Testimonial';
import Footer from './Components/Footer';
import Login from './Pages/Login';
import HomeRestCards from './Components/HomeRestCards';
import Home from './Pages/Home';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import SignUp from './Pages/SignUp';
import ContactUs from './Pages/ContactUs';
import AboutUs from './Pages/AboutUs';
import TableBooking from './Components/TableBooking';



function App(){
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home></Home>}></Route>
          <Route path='home' element={<Home></Home>}></Route> 
          <Route path='login' element={<Login></Login>}></Route>  
          <Route path='signUp' element={<SignUp></SignUp>}></Route> 
          <Route path='contact' element={<ContactUs></ContactUs>}></Route>                           
          <Route path='aboutUs' element={<AboutUs></AboutUs>}></Route> 
          <Route path='tableBooking' element={<TableBooking></TableBooking>}></Route>                       
        </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App;
