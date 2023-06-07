import React from 'react'
import './Signup.css'


function signup(){
    return(
        <div>
            <div className="main">
                <div className="mainTag">
                    <div className="leftTag">
                    <img  className = "size"src="sign3.jpg"alt=""/>
                    </div>
                    <div className="rightTag">
                            <h2>SignUp</h2>
                            <input type="text" placeholder="name"></input><br/>
                            <input type="text" placeholder="Username"></input><br/>
                            <input type="text" placeholder="E-mail"></input><br/>
                            <input type="Password" placeholder="Password"></input><br/>
                            <input type="number" placeholder="Mobile number"></input><br/>
                            <button className="button">Submit</button> 
                            
                     </div>
                </div>
                {/* <h5>____Or Connect with____</h5> */}
                <div id="bottom">
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
export default signup;