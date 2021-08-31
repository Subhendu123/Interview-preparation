package com.mazeresolver.multithreading;

public class ChildThread extends Thread
{

	@Override
	public void start()
	{
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Start method");
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Child Thread " + i);
			Thread.yield();
		}
	}

}
