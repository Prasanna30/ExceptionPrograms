package ExceptionalHandling;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int num = 55+0 ;
			int a[] = new int[3];
			System.out.println(num);
		}
		catch (ArithmeticException e) {
			System.out.println("give a right operations");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning of ArrayElement");
		}
		catch (Exception e) {
			System.out.println(" invalid data");
		}
		finally {
			System.out.println(" process this program");
		}

	}

}
