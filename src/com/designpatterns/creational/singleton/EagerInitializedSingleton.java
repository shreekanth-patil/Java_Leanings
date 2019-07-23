package com.designpatterns.creational.singleton;




/**
 * @author shreekanth
 * 
 */

/**
 * @javadoc 
 * 
 * ------------ 
 * Singleton 
 * ------------ 
 * 
 * Singleton pattern restricts the
 *          instantiation of a class and ensures that only one instance of the
 *          class exists in the java virtual machine. The singleton class must
 *          provide a global access point to get the instance of the class.
 *          Singleton pattern is used for logging, drivers objects, caching and
 *          thread pool.
 * 
 *          To implement Singleton pattern, we have different approaches but all
 *          of them have following common concepts.
 * 
 *          a. Private constructor to restrict instantiation of the class from
 *          other classes. 
 *          
 *          b. Private static variable of the same class that is
 *          the only instance of the class. 
 *          
 *          c. Public static method that returns the instance of the class, this is
 *          the global access point for 
 *           
 *           d.outer world to get the instance of the singleton class.
 * 
 * 
 *          1. Eager initialization
 *           ------------------------ 
 *          In eager initialization, the instance of Singleton Class is created at the
 *          time of class loading, this is the easiest method to create a
 *          singleton class but it has a drawback that instance is created even
 *          though client application might not be using it.
 * 
 * 
 */


public class EagerInitializedSingleton {
     
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
     
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}
 
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
