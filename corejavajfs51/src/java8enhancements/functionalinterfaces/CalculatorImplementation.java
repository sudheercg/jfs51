package java8enhancements.functionalinterfaces;

public class CalculatorImplementation  {

	/*
	 * public int calculate(int a, int b) { 
	 * return a+b; 
	 * }
	 */
	public static void main(String[] args) {
		//Runnable run = ()->{};
		
		Calculator caculateSum = (var1,var2)->var1+var2;
		
		Calculator caculateProduct = (x,y)->x*y;
		
		Calculator calculateQuotient = (a,b)->{ return a/ b;};
		
		System.out.println(caculateSum.calculate(20,30));
		System.out.println(caculateProduct.calculate(20,10));
		
		System.out.println(calculateQuotient.calculate(50, 10));
	
		Calculator adder = new Calculator() {

		    @Override
		    public int calculate(int a, int b) {
		        return a + b;
		    }

		    @Override
		    public void showOperation() {
		        System.out.println("Custom operation");
		    }
		};
	
	
	
	}
}
