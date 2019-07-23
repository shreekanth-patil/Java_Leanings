package com.jdk7;

/*
 * building custom resources with AutoCloseable and order in which resources
 *  are closed.
 */
public class CustomResourceWithAutoCloseable {

	private void orderOfClosingResources() throws Exception {
		try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
				AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

			af.doSomething();
			as.doSomething();
		}
	}

	public static void main(String[] args) throws Exception {
		CustomResourceWithAutoCloseable object = new CustomResourceWithAutoCloseable();
		object.orderOfClosingResources();
	}

}
