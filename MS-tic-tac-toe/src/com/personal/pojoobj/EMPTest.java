package com.personal.pojoobj;

public class EMPTest {
	static{
		System.out.println("AAA");
	}

	{
		// will be executed iff the object is created
		System.out.println("instance");
	}

	
	public static void main(String[] args) {
		
		new EMPTest();
		
		ItrImpl i = new ItrImpl();
		i.show();

		Itr i2 = new ItrImpl();
		i2.show();
		
	
		
		i.display();
//		i2.display();
		
	}
	
	public void method() {
		ItrImpl i = new ItrImpl();
		i.show();
	}

}

interface Itr {
	default void show() {
		System.out.println("Default Method Executed");
	}

	public static void display() {
		System.out.println("Static Interface Method");
	}
}

class ItrImpl implements Itr {
	public void show() {
		System.out.println("MY SHOW ITR OIMPL");
	}
	
	public static void display() {
		System.out.println("Static Interface Method - display");
	}
}