package com.training.ifces;

public interface AgeCondition<T>
{

	default boolean negate(Double age)
	{
		return age<58;
		
	}
}
