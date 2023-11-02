package Exception;

public class Demo2 {
	public static void main(String[] args) {
		
		System.out.println("Program begins");
		try {
		System.out.println(args[1]);
		int c = Integer.parseInt(args[0],16)+Integer.parseInt(args[1]);
		
		System.out.println(c);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program ends");
		
	}

}