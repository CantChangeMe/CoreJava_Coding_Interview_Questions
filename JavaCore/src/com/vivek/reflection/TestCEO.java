package com.vivek.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCEO {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c = Class.forName("com.vivek.reflection.CEO");
		CEO ceo = (CEO) c.newInstance();
		
		Method method = c.getDeclaredMethod("getClientDetails", null);
		//method.setAccessible(true);
		
		method.invoke(ceo, null);
	}

}
