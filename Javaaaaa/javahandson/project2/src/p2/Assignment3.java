package p2;

public class Assignment3 {
	
	public void characterLocator(String inital, String pos)
	{
		try {
			System.out.println(inital.charAt(Integer.parseInt(pos)));
			
		}catch(NumberFormatException e){
			System.err.println("NumberFormatException");
		}catch(StringIndexOutOfBoundsException e) {
			System.err.println("StringIndexOutOfBoundsException");
		}
		
	}
	
	public static void main(String[] args) {
		Assignment3 obj = new Assignment3();
		obj.characterLocator("This is a demo sentence", "3");
	}
}

