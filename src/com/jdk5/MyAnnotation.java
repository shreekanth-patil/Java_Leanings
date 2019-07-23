package com.jdk5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shreekanth
 * 
 *         Annotations are meta data to be used by compiler or run time
 *         environment.Creating your custom annotation in java is very simple .
 * 
 *         Here , the RetentionPolicy.RUNTIME will determine whether the
 *         annotation will be present at run time or not.To test the annotation
 *         and get the values , let's create a test class.
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {
	
	String value() default "myAnootation";

	String[] arr() default { "testarr" };
}