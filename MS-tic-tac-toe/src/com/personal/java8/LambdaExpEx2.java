package com.personal.java8;


interface Inter {
	
	public void method();
}
 

public class LambdaExpEx2 {
	
	
	public static void main(String[] args) {
		
		Inter i = new Inter() {

			@Override
			public void method() {
				System.out.println("Annonymous Inner Class Implementation");
			}
			
		};
		i.method();
	}

	
}
