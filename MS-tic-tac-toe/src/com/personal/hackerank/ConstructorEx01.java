package com.personal.hackerank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class A{
	
	A() throws IOException{
		System.out.println("A");
	}
}
class  B extends A{
	B() throws IOException{
			super();
	}
}
public class ConstructorEx01 {

	public static void main(String[] args) throws IOException{
			B b = new B();
			System.out.println(b instanceof A);
//		A a = new A();
		
	}

}
