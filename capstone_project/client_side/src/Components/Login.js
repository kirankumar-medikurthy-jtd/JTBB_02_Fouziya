import React from 'react';
import './Signup.js';
import './Login.css';

function login(){
    return(
        <div>
        <div className="loginMain">
            <div className="loginMainTag">
                <div className="loginLeftTag">
                <img  className = "size"src="resources/sign3.jpg"alt=""/>
                </div>
                <div className="loginRightTag">
                        <h2>Login</h2>
                       
                        <input type="text" className="loginChange" placeholder="Username"></input><br/>
                       
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
                <img className="google" src="resources/googleicon.webp" alt=""/>
                <img className="twitter" src="resources/twitter.png"alt=""/>
                <img className="linkdin" src="resources/linkdin.png"alt=""/>
                <img className="facebook" src="resources/facebook.png"alt=""/>
            </div>
            
        </div>
       
    </div>
    )
}
export default login;