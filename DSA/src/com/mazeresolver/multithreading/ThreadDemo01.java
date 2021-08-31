package com.mazeresolver.multithreading;

public class ThreadDemo01
{

	public static void main(String[] args)
	{

		Thread t = new ChildThread();
//		t.setPriority(10);
		System.out.println(t.getPriority());
		t.start();
//		Thread.currentThread().setName("Subhendu");
//		Thread.currentThread().setPriority(10);
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Main Thread " + i);
		}
	}

}
