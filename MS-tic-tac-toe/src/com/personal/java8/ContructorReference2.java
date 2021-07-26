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

public class ContructorReference2 {
	
	public static void main(String[] args) {
		SimpleInterface si = Sample::new;
		si.get(5);
	}

	
}

interface SimpleInterface001{
	public void get(int i);
}
class Complex{
	
	public Complex(Player p) {
		System.out.println("PArameter Constructor!");
	}
	
	public Complex(String i) {
		System.out.println("Parameter Constrcutor - "+i);

	}
	
	
}
