import React from 'react'
import './Forgotpassword.css';

function Forgot(){
    return(
        <div>
            <div className="forgotmain">
                <div className="forgotleft"> 
                <img className="image" src="resources/sign3.jpg" alt=""/>
                </div>
                <div className="forgotright">
                    <div className="forgottop">
                        <h2>Forgotpassword</h2>
                        <input className="username" type="text" placeholder="Username"/><br/>
                        <input type="password" placeholder="New password"/><br/>
                        <input type="password" placeholder="Confirm password"/><br/>
                        <button className="update">Update</button><br/>
                        
                       
                    </div>
                </div>

            </div>
        </div>
    )
}
export default Forgot;