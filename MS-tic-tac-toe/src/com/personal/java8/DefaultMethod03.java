package com.personal.java8;

interface I1 {
	default void m() {
	}
}
interface I2 {
	default void m() {
	}
}


public class DefaultMethod03 implements I1,I2{

	public static void main(String[] args) {}

	@Override
	public void m() {
		// TODO Auto-generated method stub
//		I2.super.m();
	}

}
