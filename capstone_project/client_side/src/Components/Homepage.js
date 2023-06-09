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
                <img className="slid"src="resources/f1.png" alt=""/>
            </div>
            <div className="screen">
                <div className="homeimage">
                <img  className="home"src="resources/homeimage.jpeg" alt=""/>
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
                    <div>Hello</div>
                   
                </div>
                <div className="connect">
                    <b>Keep Connect</b>
                    <div className ="equal">
                        <img  className="facebookimage"src = "resources/facebook.png" alt=""/>
                        <h2>Let us an facebook</h2>
                    </div>
                    <div className="equal">    
                        <img  className="facebookimage"src = "resources/googleicon.webp" alt=""/>
                        <h2>Add us on google</h2>
                    </div> 
                    <div className="equal">    
                        <img  className="facebookimage"src = "resources/twitter.png" alt=""/>
                        <h2>Add us on google</h2>
                    </div>  
                    <div className="equal">    
                        <img  className="facebookimage"src = "resources/linkdin.png" alt=""/>
                        <h2>Add us on google</h2>
                    </div>       
                   
                </div>
                <div className="contact"><b>Contact Information</b></div>
            </footer>
             
            
    
            
           
        </div>
    )
}
export default Home;