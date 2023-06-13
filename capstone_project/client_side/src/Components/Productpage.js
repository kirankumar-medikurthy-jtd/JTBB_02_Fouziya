import React from 'react';

import './Productpage.css';

function Product(){
    return(
            <div>
                <div id="navbar">
                    <img className="height" src="resources/logowelding.jpeg" alt=""/>
                    <div className="Home">Home</div>
                    <div className="Gallery">Gallery</div>
                    <div className="Signup">Signup</div>
                </div>
                <div className="block">
                    <p>Welcome to our online welding store, your one-stop destination for all your welding needs! We offer a wide range of high-quality welding products and equipment to cater to professionals, hobbyists, and DIY enthusiasts alike.

Browse through our extensive collection of welding machines, electrodes, protective gear, and consumables, carefully selected to ensure durability, performance, and safety. Our products come from trusted brands in the industry, guaranteeing reliability and excellent results for your welding projects.

In addition to our comprehensive product offerings, we provide valuable resources to support your welding journey. Explore our blog section, where you'll find informative articles, tutorials, and tips on various welding techniques, safety measures, and industry updates. We believe in empowering our customers with knowledge to enhance their skills and stay updated with the latest trends and advancements in the welding field.

Customer satisfaction is our top priority. Our dedicated customer support team is readily available to assist you with any inquiries, product recommendations, or technical support you may need. We strive to provide a seamless online shopping experience, ensuring secure transactions and timely deliveries to your doorstep.

Whether you're a professional welder looking for top-of-the-line equipment or an aspiring welder eager to learn and practice, our website is here to serve your needs. Start exploring our collection, and let us be your trusted partner in all your welding endeavors.</p>

                </div>
                
                    <h2>categories</h2>
                    <h2>Single gates</h2>

             
            <div className="welding">
                <div className="smallContainer">
                    <div className="weld">
                        <img className="width"  src = "resources/single5.jpg" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                    <div className="weld">
                        <img className="width" src = "resources/single4.jpeg" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                    <div className="weld">
                        <img className="width" src = "resources/single2.jpeg" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                    <div className="weld">

                        <img className="width" src = "resources/single3.jpeg" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                </div> 
                <div className="firstContainer">
                    <div className="weld">
                        <img className="width" src = "resources/single9.png" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                    <div className="weld">
                        <img className="width" src = "resources/single10.png" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                    <div className="weld">
                        <img className="width" src = "resources/single7.jpeg" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                    <div className="weld">
                        <img className="width" src = "resources/single8.jpg" alt=""/>
                        <p></p>
                        <button></button>
                    </div>
                </div>
                
            </div>
                    <h2>Double gates</h2>
                    <div className="bigContainer">
                        <div className="smallContainer">
                            <div className="weld">
                                <img className="width" src = "resources/double1.png" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                            <div className="weld">
                                <img className="width" src = "resources/double2.jpeg" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                            <div className="weld">
                                <img className="width" src = "resources/double.jpeg" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                            <div className="weld">
                                <img className="width" src = "resources/double4.jpeg" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                        
                        </div>
                        <div className="smallestContainer">
                                <div className="weld">
                                    <img className="width" src = "resources/double5.jpeg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                                <div className="weld">
                                    <img className="width" src = "resources/double6.jpeg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                                <div className="weld">
                                    <img className="width" src = "resources/double7.jpeg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                                <div className="weld">
                                    <img className="width" src = "resources/double8.jpeg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                        </div>
                    </div>
                <h2>Roller gates</h2>
                <div className="bigContainer">
                        <div className="smallContainer">
                            <div className="weld">
                                <img className="width" src = "resources/Rgate1.png" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                            <div className="weld">
                                <img className="width" src = "resources/Rgate2.jpg" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                            <div className="weld">
                                <img className="width" src = "resources/Rgate3.webp" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                            <div className="weld">
                                <img className="width" src = "resources/Rgate4.jpg" alt=""/>
                                <p></p>
                                <button></button>
                            </div>
                        
                        </div>
                        <div className="smallestContainer">
                                <div className="weld">
                                    <img className="width" src = "resources/Rgate5.jpg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                                <div className="weld">
                                    <img className="width" src = "resources/double3.jpeg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                                <div className="weld">
                                    <img className="width" src = "resources/Rgate8.jpeg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                                <div className="weld">
                                    <img className="width" src = "resources/roller.jpg" alt=""/>
                                    <p></p>
                                    <button></button>
                                </div>
                        </div>
                    </div> 
            </div>
    )
}
export default Product;

