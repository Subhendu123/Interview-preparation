package com.mazeresolver.multithreading;

public class ThreadYieldDemo01
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Thread t = new ChildThread();
		t.start();
		t.join();
		Thread t2 = new ChildThread();
		t2.start();

		for (int i = 0; i < 5; i++)
			System.out.println("Main Method " + i);

	}

}
