/*****************************************************************
 *  Hello.java
 *  Created on : Apr 23, 2012 11:17:55 AM
 *  Author : sanumala @ javaj2ee.com
 *  License : Copyright 2012 Its OpenSource. 
 *          : Please feel free to Share!
 *          : If you like it fork me @ http://github.com/sanumala
 *****************************************************************/
package com.sanumala.ws.service;


import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sanumala.ws.core.bo.HelloBo;

/**
 *
 * @author sanumala
 */
@WebService
public class Hello {
    
    //This BO will be injected by Spring using DI.
    private HelloBo helloBoImpl;
    
    /**
     * Sample web service method to say Hello
     * @param name
     * @return 
     */
    @WebMethod(operationName="sayHello")
    public String sayHello(String name)
    {
        return "Hey! "+name.toUpperCase()+ " Welocme to JAX-WS without Spring!";
    }
    
    @WebMethod(operationName="sayHelloUsingSpring")
    public String sayHelloUsingSpring(String name)
    {
        return helloBoImpl.sayHello(name);
    }
    
    @WebMethod(exclude=true)
    public void setHelloBoImpl(HelloBo helloBoImpl)
    {
        this.helloBoImpl = helloBoImpl;
    }
    
    
}
