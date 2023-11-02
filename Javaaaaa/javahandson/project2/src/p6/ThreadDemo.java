package p6;

public class ThreadDemo extends Thread {

		String name;
		int n;
		public ThreadDemo() {
			super();
			this.name = "NatWest";
			this.n = 10;
	
		}
		public ThreadDemo(String name, int n) {
			super();
			this.name = name;
			this.n = n;
		}
 	
		
	@Override
	public void run() {
		for (int i = 10; i<=n;i++) {
			System.out.println(this.name+" "+i);
			try {
				sleep(10);	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}	
