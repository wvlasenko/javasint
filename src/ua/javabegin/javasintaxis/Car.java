package ua.javabegin.javasintaxis;

public class Car {
	private int i;
	private String name;
	

	public Car(int i, String name) {
		this.i = i;
		this.name = name;
	}
	public void test () {
		i=5;

	}
	public void go() {
//		int count =1;
//		count++;
		System.out.println(i);
	}
	public int getI() {
		return i;
	}
	public String getName() {
		return name;
	}
}
