package Exception;

public class Demo5 {
	
	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			try {
				
				System.out.println(i);
				if (i%4 == 0) {
					continue;
				}
				try {
					
					System.out.println(i);
					if(i%3==0) {
						continue;
					}
					try {
						
						System.out.println(i);
						
					}catch(Exception e) {
						
					}finally {
						System.out.println("I am in inner inner finnaly block");
					}
					
				}catch(Exception e) {
					
				}finally {
					System.out.println("I am in inner finnaly block");
				}
			}catch(Exception e) {
				
			}finally {
				System.out.println("I am in outer finnaly block");
			}
		}
	}

}