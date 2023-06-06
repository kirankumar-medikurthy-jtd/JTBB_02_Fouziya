import React from 'react'
import './Signup.css'


function signup(){
    return(
        <div>
            <div class="main">
                <div class="mainTag">
                    <div class="leftTag">
                    <img  class = "size"src="sign.webp"alt=""/>
                    </div>
                    <div class="rightTag">
                            <h2>SignUp Page</h2>
                            <input type="text" placeholder="name"></input><br/>
                            <input type="text" placeholder="Username"></input><br/>
                            <input type="text" placeholder="E-mail"></input><br/>
                            <input type="Password" placeholder="Password"></input><br/>
                            <input type="number" placeholder="Mobile number"></input><br/>
                            <button class="button">Submit</button> 
                            
                     </div>
                </div>
                <h5>____Or Connect with____</h5>
                <div class="bottom">
                    <img class="google" src="googleicon.webp" alt=""/>
                    <img class="twitter" src="twitter.png"alt=""/>
                    <img class="linkdin" src="linkdin.png"alt=""/>
                    <img class="facebook" src="facebook.png"alt=""/>
                </div>
                
            </div>
           
        </div>
    )
}
export default signup;