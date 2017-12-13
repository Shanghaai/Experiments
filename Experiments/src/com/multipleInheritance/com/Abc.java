package com.multipleInheritance.com;

public class Abc 
{
	public void barking()
	{
		System.out.println("In abc class method");
	}
	
	void leavingTheRoom()
	{
		System.out.println("i am leaving the room");
	}
}

class xyz 
{
	public void m()
	{
		System.out.println("xyz class method");
	}
}

//class ttt extends  Abc,xyz 

// can not write like bcz java doesn't support multiple inheritance
// but we can achieve this by using interfaces( myclass implements interface1,interface2 ) or single level inheritance like
// b extends a
//c extends b ... so here c class getting properties of both class as like in multiple inheritance  
class ttt extends xyz
{
	public void m()
	{
		System.out.println("Over-ridding xyz class method");
	}
}
// and for m() method over-rided method will be printed