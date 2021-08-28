package com.dxc.exceptionpack;

public class InvalidAgeException  extends Exception{
	
	private static final long serialVersionUID = 110001L;
	private String msg;

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}

}
