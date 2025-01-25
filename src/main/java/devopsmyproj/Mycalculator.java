package devopsmyproj;

public class Mycalculator {
	
	public int sum(int a,int b) {

	return a+b;
}
	
	public int diff(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}

public static void main(String[] args) {
	
	Mycalculator calc = new Mycalculator();
	System.out.println("Sum is "+calc.sum(20,10));
	System.out.println("difference is "+calc.diff(20,10));
	System.out.println("multiplication is "+mul.diff(20,10));
	
	}
}