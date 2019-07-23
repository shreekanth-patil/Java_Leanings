package com.jdk5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author shreekanth
 * 
 * 
 *         Here annotation is on method level , we can access the annotation
 *         element values using reflection on method.If the do not specify
 *         RetentionPolicy as RUNTIME , the jvm will ignore this annotation and
 *         we will not be able to access this annotation.
 * 
 */
public class MyAnnotationTest {

	@MyAnnotation(value = "test my annotation", arr = { "first param of arr", "second param of array" })
	public void annotationTest() {

	}

	public static void main(String[] args) {
		
		Method[] methods = MyAnnotationTest.class.getDeclaredMethods();

		for (Method m : methods) {
			for (Annotation a : m.getAnnotations()) {
				if (a instanceof MyAnnotation) {
					MyAnnotation ann = (MyAnnotation) a;
					
					System.out.println(ann.value());
					
					for (String s : ann.arr()) {
						System.out.println(s);
					}
				}
			}
		}

	}
}