/*****************************************************************
 *  HelloBoImpl.java
 *  Created on : Apr 23, 2012 11:32:09 AM
 *  Author : sanumala @ javaj2ee.com
 *  License : Copyright 2012 Its OpenSource. 
 *          : Please feel free to Share!
 *          : If you like it fork me @ http://github.com/sanumala
 *****************************************************************/
package com.sanumala.ws.core.bo.impl;

import com.sanumala.ws.core.bo.HelloBo;

/**
 *
 * @author sanumala
 */
public class HelloBoImpl implements HelloBo{

    public String sayHello(String name) {
        return "Hey! "+name.toUpperCase()+ " Welocme to JAX-WS with Spring!";
    }
    
}
