package com.vm.training.java.assignments;

public abstract class MyCalculator implements AdvancedArithmetic
{
    int n;
    
	public MyCalculator(int n) {
		super();
		this.n = n;
	}

	@Override
	public void int_divisor(int n) 
	{
		// TODO Auto-generated method stub
		int sum=0;
		if(n==0)
		{
			System.out.println("0");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					sum+=i;
				}
			}
		}
		System.out.println("The divisor sum of the Given Number "+n+" is :"+sum);
		
	}
	
}
