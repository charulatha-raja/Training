package com.training.exception;

public class RangeCheckException extends Exception
{
private String message;
public RangeCheckException()
{
	super();
}
public RangeCheckException(String message)
{
	super();
	this.message = message;
}

public void setMessage(String message) {
	this.message = message;
}
@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return this.message;
}

}
