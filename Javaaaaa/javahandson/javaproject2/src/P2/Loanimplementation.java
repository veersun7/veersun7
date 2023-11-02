package P2;

public class Loanimplementation implements Bankloan{
	
	
		@Override
		public float calLoanInt(float amt, float rate, float period, float state) {
			// TODO Auto-generated method stub
			
			float interest=0;
			
			if(state ==1) {
				period = period / 365;
				
			}
			if (state ==2) {
				period = period /12;
				
						
			}
		
		interest = (amt * rate * period)/ 100;
				
		return interest;		
	}
	
		
}
