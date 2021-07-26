package com.personal.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.personal.hackerank.Player;
import com.personal.pojoobj.Employee;

public class ContructorReference {
	
	public static void main(String[] args) {
		SimpleInterface si = Sample::new;
		si.get(5);
	}

	
}

interface SimpleInterface{
	public void get(int i);
}
class Sample{
	
	public Sample() {
		System.out.println("Default Constructor!");
	}
	
	public Sample(int i) {
		System.out.println("Parameter Constrcutor - "+i);

	}

	@Override
	public String toString() {
		return "Sample [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
