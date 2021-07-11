package com.personal.hackerank;

public class IntegerArgument {
	
	private int arg;

	public IntegerArgument(int arg) {
		super();
		this.arg = arg;
	}

	@Override
	public String toString() {
		return "IntegerArgument [arg=" + arg + "]";
	}
	
	@Override
    public int hashCode() {
        return 5;
    }
	
	

}
