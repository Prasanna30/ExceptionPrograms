package ExceptionalHandling;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int n1, n2 ,n3 ;
		n1 =23;
		n2 = 0;
		n3 = n1/n2;
		System.out.println(n3);*/
		
	try {	
		
	int n11 = 0;
		int n12 =50;
		int n13 = n12/n11;
		System.out.println(n13);
	}

catch (ArithmeticException ex) {
		System.out.println("Enter the valid input data");
	} 
	finally {
		System.out.println("Successfully executed the program");
	}
	}
}