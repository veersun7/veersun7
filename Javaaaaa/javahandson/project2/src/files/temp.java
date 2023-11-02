package files;

import java.io.*;

//all IO classes they use resources like files
//Hence there may be failure of resources sometimes. ex: file not found
//since we use resources there is probability of ambiguity. Here its better to handle exception

public class temp {

	public static void main(String[] args) {
		
		try{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// Buffer reader read only in form on string

			System.out.println("Enter two number");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = a + b;
				System.out.println(c);

} catch (Exception err){
	System.err.println(err);
	}
		System.out.println("Program Over");
		}
}
