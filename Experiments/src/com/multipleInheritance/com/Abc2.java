package com.multipleInheritance.com;

public interface Abc2 {
	void m1();
	void m2();
}

interface xyz2
{
	void m1();
	void m2();
}

class tttt implements Abc2,xyz2
{

	@Override
	public void m1() {
		System.out.println("IN the m1 method inside tttt");
	}

	@Override
	public void m2() {

			System.out.println("IN the m2 method inside tttt");
	}
	
	public static void main(String[] args) {
		tttt t= new  tttt();
		t.m1();
		t.m2();
	}
}