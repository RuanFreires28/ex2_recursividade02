package controller;

public class Controller 
{
	
	public Controller()
	{
		super();
	}
	
	
	public double Divide(int dividendo, int divisor)
	{
		if ( divisor > dividendo)
		{
			return dividendo;
		}
		else
		{
			return Divide((dividendo-divisor), divisor);
		}
	}
	
}
