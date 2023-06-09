import React from 'react'
import './Footer.css';
function Footer(){
    return(
        <footer>
            <div className="About">

                <b>About Us</b>
                <p className ="google">Our aim to deliver high-quality<br/> welding products and services to<br/> meet the needs of our customers. <br/>Our experienced team of welders<br/> is dedicated to ensuring customer<br/> satisfaction and delivering<br></br> exceptional results.</p>
               
            </div>
            <div className="contact">
               
                <b>Contact Information</b>
                <div className="mobile">
                <img className="contactNumber" src="resources/call.png" alt=""/>    
                <p>Mobile no:+91-9676948462</p><br/>
                {/* <p>Mobile no:+91-8886423553</p> */}
                </div>
                <div className="mobile">
                <img className="contactNumber" src="resources/email2.png" alt=""/>  
                <p>E-mail: Weldzone@gmail.com</p>
                </div>
            </div>

            <div className="connect">
                <b>Follow us on</b>
               
                <div className ="equal">
                    <img  className="facebookImage"src = "resources/facebook.png" alt=""/> 
                
                    <img  className="facebookImage"src = "resources/googleicon.webp" alt=""/> 
                
                    <img  className="facebookImage"src = "resources/twitter.png" alt=""/> 
                
                    <img  className="facebookImage"src = "resources/linkdin.png" alt=""/>
                </div>  
            </div>
            
        </footer>
        )
    }  
export default Footer; 