package com.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	/**
	 * @return if you dont override this method... it allows to create mulitple
	 *         objects and destroyes singleton
	 * 
	 *  Hence need to override
	 * 
	 *   So it destroys the singleton pattern, to overcome this scenario
	 *         all we need to do it provide the implementation of readResolve()
	 *         method and call getInstance
	 */
	protected Object readResolve() {
	    return getInstance();
	}

}
