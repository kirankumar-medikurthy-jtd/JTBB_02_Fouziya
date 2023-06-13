import React from 'react'
import './Homepage.css';

function Home(){
    return(
        <div>
            <div id="navbar">
                <img className="height" src="resources/logowelding.jpeg" alt=""/>
                <div className="Home">Home</div>
                <div className="Gallery">Gallery</div>
                <div className="Signup">Signup</div>
            </div>
            <div className="slide">
                <img className="slid"src="resources/f4.jpeg" alt=""/>
            
            </div>
            <div className="screen">
                <div className="homeimage">
                <img  className="home"src="resources/f1.png" alt=""/>
                </div>
                <div className="color">
                    <h5>Lorem ipsum dolor sit amet, consectetur adipisicing elit 
sed do eiusmod tempor incididunt ut labore et dolore 
magna aliqua. quis nostrud exercitation.</h5>
                </div>
                 
            </div>
            <div className="flex">
                    <div className="border">
                        <div className="top">
                            <img className="content" src="resources/f2.jpeg" alt=""/> 
                        </div>   
                        <h6>Taking the length of the weld is crucial for ensuring accuracy, precision, and high-quality results in welding.</h6> 
                    </div>
                    <div className="control">
                        <div className="bottom">
                            <img  className="enter"src="resources/f3.jpeg" alt=""/> 
                        </div>
                        <h6>Softening the pipe during welding improves its appearance and enhances its overall quality and functionality.</h6>
                    </div>   
                    <div className="margin">
                        <div className="left">
                            <img  className="back" src="resources/nawaz.jpeg" alt=""/> 
                        </div> 
                        <h6>The man is diligently working on welding to create sturdy and functional gates.</h6>   
                    </div>   
            </div>
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
             
            
    
            
           
        </div>
    )
}
export default Home;