/*****************************************************************
 *  HelloWebServiceClient.java
 *  Created on : Apr 23, 2012 11:55:34 AM
 *  Author : sanumala @ javaj2ee.com
 *  License : Copyright 2012 Its OpenSource. 
 *          : Please feel free to Share!
 *          : If you like it fork me @ http://github.com/sanumala
 *****************************************************************/
package com.sanumala.ws.client;

/**
 *
 * @author sanumala
 */
public class HelloWebServiceClient {

    public static void main(String[] args)
    {
        //To Call webservice you need its service object
        //then port to call exposed methods.
        /**
         * HelloService hs = new HelloService();
         * Hello hello = hs.getHelloPort();
         * hello.sayHello("Sanumala");
         */
        Hello hello = new HelloService().getHelloPort();
        System.out.println(hello.sayHello("Sanumala"));
        System.out.println(hello.sayHelloUsingSpring("Github"));
    }
}
