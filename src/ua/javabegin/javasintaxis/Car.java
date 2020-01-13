package ua.javabegin.javasintaxis;

public class Car { 
	private String name;
	
	private int i=5,Z=6;
	private int x=7;
	private int j=7;
	
	public Car(int i, String name) {
		this.i = i;
		this.name = name;
	}
	public void test () {
		i=5;
		go (i);

	}
	public void go(int i) {
// 		local variable
		int count =0;
		count++;
		System.out.println(i);
		if (count>8) {
			int j=5;
		}
	}
	public int getI() {
		return i;
	}
	public String getName() {
		return name;
	}
}

