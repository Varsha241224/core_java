package Variables;

public class Variables_java {
	int a = 10; // Instance variable

		    void print() {
		        String msg = "hello";
		        System.out.println(msg);
		    }

		    static String message = "hello students"; // Static variable

		    public static void main(String[] args) {
		    	Variables_java  obj = new Variables_java ();
		        System.out.println("The value of a: " + obj.a);
		        obj.print();
		        System.out.println(message);
	}

}


