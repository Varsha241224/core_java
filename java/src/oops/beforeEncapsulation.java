package oops;

public class beforeEncapsulation {
		public static void main(String[] args) {
			human obj=new human();
			obj.setAge(12);
			obj.setName("Varshitha");
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
			
			obj.setAge(16);
			obj.setName("mansa");
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
			

		}

	

}
