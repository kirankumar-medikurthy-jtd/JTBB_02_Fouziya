import React from 'react';
import './Signup.js';
import './Login.css';

function login(){
    return(
        <div>
        <div className="main">
            <div className="mainTag">
                <div className="leftTag">
                <img  className = "size"src="sign3.jpg"alt=""/>
                </div>
                <div className="rightTag">
                        <h2>Login</h2>
                       
                        <input type="text" className="change" placeholder="Username"></input><br/>
                       
                        <input type="Password" placeholder="Password"></input><br/>
                    
                        <button className="button">Login</button> 
                        
                 </div>
            </div>
            {/* <h5>____Or Connect with____</h5> */}
            <div className="bottom">
            <h5>____Or Connect with____</h5>
                <img className="google" src="googleicon.webp" alt=""/>
                <img className="twitter" src="twitter.png"alt=""/>
                <img className="linkdin" src="linkdin.png"alt=""/>
                <img className="facebook" src="facebook.png"alt=""/>
            </div>
            
        </div>
       
    </div>
    )
}
export default login;