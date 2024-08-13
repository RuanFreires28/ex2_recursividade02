package view;

import controller.Controller;

public class Main 
{

	public static void main (String[] args) 
	{
		Controller c = new Controller();
		
		int dividendo = 10;
		int divisor = 2;
			
		double resultado = c.Divide(dividendo, divisor);
		
		System.out.println(resultado);
		
	}
	
}
