package com.getterSetter.common;

public class GetterSetterMainClass 
{
	
	public static void main(String[] args) 
	{
		GetterSetter g1 = new GetterSetter();
		g1.setFirstName("sahil");
        g1.setRegno(21);
        g1.setLastName("siddiqui");
        g1.setRollno(30);
		
		
		GetterSetter x2 = new GetterSetter();
		x2.setFirstName("wasim");
		
		
		
		
		
		System.out.println("g1 First name :"+g1.getFirstName());
		System.out.println("g1 last name :"+g1.getLastName());
		System.out.println("g1 rollno. :"+g1.getRollno());
		System.out.println("g1 regon :"+g1.getRegno());
		
		System.out.println("____________+==================----------");
		System.out.println("simply done for wasim bhai also....bye bye take care");		
		System.out.println(x2.getFirstName());
		
	}
	
	
	
	
}
