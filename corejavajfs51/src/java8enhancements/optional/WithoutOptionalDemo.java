package java8enhancements.optional;

public class WithoutOptionalDemo {
	
	
	public static void main(String[] args) {
		String[] names= new String[4];
		//names[2]= "Raj";
		String name = names[2];
		//System.out.println(name.length());
		
		if(name!=null) {
			System.out.println("Name at index 2 : "+name);
			
		}else {
			System.out.println("No name at index 2");
	    }
		
	}
	
	
	

}
