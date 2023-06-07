import React from 'react';
import './Signup.js';
import './Login.css';

function login(){
    return(
        <div>
        <div className="loginmain">
            <div className="loginmainTag">
                <div className="loginleftTag">
                <img  className = "size"src="sign3.jpg"alt=""/>
                </div>
                <div className="loginrightTag">
                        <h2>Login</h2>
                       
                        <input type="text" className="loginchange" placeholder="Username"></input><br/>
                       
                        <input type="Password" placeholder="Password"></input><br/>
                        
                        <input className="box" type="checkbox"></input>
                        <label className="label">Remember me</label>
                        <button className="button">Login</button> 
                        <p className="password">Forgot Password?</p>
                        <p className="Account">Don't have an account please Sign up?</p>
                       
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