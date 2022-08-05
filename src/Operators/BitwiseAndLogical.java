package Operators;

public class BitwiseAndLogical {
	
	static void Bitwise() {
		int a=45,b=65,c=5;
		System.out.println(a<b & c>b);   
		System.out.println(c<a & b>c);
		System.out.println(a==b & c!=a);
		System.out.println(a>c | b>a);
		System.out.println(a==b | b==c);
		System.out.println(a>c | c<b);	
	}
	
	static void Logical() {
		int a=10,b=15,c=5;
		System.out.println(a<b && c<a);
		System.out.println(c<=b && a<b);
		System.out.println(a>c || c<b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bitwise ();
		Logical ();
	}

}
