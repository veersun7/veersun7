package P4;

import p1.Read;

public class SingleList {
	
	public static void main(String[] args) {
		Student root = null;
		int flag =0; 
		int choice = 0;
		Student ob = null;
		Student cob = null;
		
		do {
			System.out.println("enter choice 1 insert 2 display 3 exit");
			choice = Read.sc.nextInt();
			switch (choice) {
			case 1: {
				ob = new Student();
				System.out.println("Enter Name, age and Marks of student");
				ob.name = Read.sc.next();
				ob.age = Read.sc.nextInt();
				ob.marks = Read.sc.nextInt();
				ob.nextobj = null;
				if(flag == 0) {
					root = ob;
					cob = ob;
					flag =1;
					
					}
				else {
					cob.nextobj = ob;
					cob = ob;
					
				}
					break;
								
			}
			case 2:{
				Student nv = root;
				while(nv !=null) {
					System.out.println(nv.name+" age : "+ nv.age +" marsk : "+ nv.marks);
					nv = nv.nextobj;
				}
				break;
				
				}
			case 3: {
				System.out.println("Program over......");
				break;
			}
			
			default:
				System.out.println("Invalid choice--------");
			}
			
		}while (choice !=3);
		}
	}

