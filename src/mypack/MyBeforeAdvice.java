package mypack;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice 
{

	@Override
	public void before(Method method1, Object[] arg1, Object arg2) throws Throwable
	{
	    System.out.println("Before Advice "+method1.getName());
		
	}
}
