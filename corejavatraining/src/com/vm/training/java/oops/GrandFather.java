package com.vm.training.java.oops;

public class GrandFather {
	int age;
	public GrandFather(int age)
	{
		this.age=age;
	}
	void walk()
	{
		System.out.println("i can't walk fast bcos my age is :"+" "+age);
	}
}
	class Father extends GrandFather{
		int myage;
		public Father(int age,int myage)
		{
			super(age);
			this.myage=myage;
		}
		void walk()
		{
			System.out.println("i can walk fast bcos my age is:"+" "+myage);
		}
}
	class Son extends Father{
		int teenmyage;
		public Son(int age,int myage,int teenmyage)
		{
			super(age,myage);
			this.teenmyage=teenmyage;
		}
		void walk()
		{
			System.out.println("i can run bcos my age is:"+" "+teenmyage);
		}
}

