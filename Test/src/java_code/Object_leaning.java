package java_code;

public class Object_leaning {
	
	int a =10;
	static int b = 20;

	public static void main(String[] args) {
		System.out.println(Object_leaning.b);
		
		Object_leaning obj = new Object_leaning();
		System.out.println(obj.a);
		System.out.println(b);
	}

}