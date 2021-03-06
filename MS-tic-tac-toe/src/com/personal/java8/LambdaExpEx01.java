package com.personal.java8;


@FunctionalInterface
interface Interf {
	
	public void method();
//	public void method2(int a);
	public static void staticMethod() {
		int a = 10;
		System.out.println("STATIC + "+a);		
	}
}
 

public class LambdaExpEx01 {
	
	public static Interf interf = () -> {System.out.println("Static Interface Implementation...");};
	public static int constdata = 1;
	public Interf nonStaticInterf = () -> {System.out.println("Non Static Interface Implementation...");};
	static{
		interf.method();
	}

	{
		constdata++;
		System.out.println("Non static block!!");
		nonStaticInterf.method();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i = () -> {System.out.println("Method level implementation...");};
		i.method();
		interf.method();
		System.out.println(constdata);
		Interf.staticMethod();
	}

	
}
