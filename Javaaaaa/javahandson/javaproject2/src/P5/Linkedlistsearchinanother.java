package P5;

import P4.Student;
import p1.Read;

public class Linkedlistsearchinanother {

	public static void main(String[] args) {
		int flag = 0;
			Student root1=null,root2=null, root3=null;
			Student cob=null;
			Student ob = new Student();
			System.out.println("Enter Name, age and Marks of student");
			ob.name = Read.sc.next();
			ob.age = Read.sc.nextInt();
			ob.marks = Read.sc.nextInt();
			ob.nextobj = null;
			root1 = ob;
			cob = ob;
			//  2nd node
			
			 Student ob1 = new Student();
			System.out.println("Enter Name, age and Marks of student");
			ob1.name = Read.sc.next();
			ob1.age = Read.sc.nextInt();
			ob1.marks = Read.sc.nextInt();
			ob1.nextobj = null;
			 cob.nextobj = ob1;
			 cob = ob1;
			
			//  2nd node
				
				 Student ob2= new Student();
				System.out.println("Enter Name, age and Marks of student");
				ob2.name = Read.sc.next();
				ob2.age = Read.sc.nextInt();
				ob2.marks = Read.sc.nextInt();
				ob2.nextobj = null;
				 cob.nextobj = ob2;
				 cob = ob2;
				
				
			//----------2nd linked list---------------------------------------------
				
				 Student obj = new Student();
					System.out.println("Enter Name, age and Marks of student");
					obj.name = Read.sc.next();
					obj.age = Read.sc.nextInt();
					obj.marks = Read.sc.nextInt();
					obj.nextobj = null;
					root2 = obj;
					cob = obj;
					//  2nd node
					
					 Student obj1 = new Student();
					System.out.println("Enter Name, age and Marks of student");
					obj1.name = Read.sc.next();
					obj1.age = Read.sc.nextInt();
					obj1.marks = Read.sc.nextInt();
					obj1.nextobj = null;
					 cob.nextobj = obj1;
					 cob = obj1;
					
					//  2nd node
						
						 Student obj2= new Student();
						System.out.println("Enter Name, age and Marks of student");
						obj2.name = Read.sc.next();
						obj2.age = Read.sc.nextInt();
						obj2.marks = Read.sc.nextInt();
						obj2.nextobj = null;
						 cob.nextobj = obj2;
						 cob = obj2;
						
						 System.out.println("--------------1st list -------------");
						Student object = root1;
						while (object !=null) {
							System.out.println(object.name +"   "+ object.age+"  "+object.marks);
							object = object.nextobj;
						}
						
						System.out.println("--------------2nd list -------------");
					object = root2;
						while (object !=null) {
							System.out.println(object.name +"   "+ object.age+"  "+object.marks);
							object = object.nextobj;
						}
						
						
				   object = root1;
						while (object !=null) {
							
							Student object1 = root2;
							while (object1 !=null) {
	if(object.name.equals(object1.name) && object.age == object1.age && object.marks==object1.marks)
	{
		if( flag ==0){
			root3 = object1;
		
		root3.nextobj=null;
		cob = object1;
		flag=1;
		}else {
			cob.nextobj = object1;
					cob = object1;
			cob.nextobj = null;
					
	}
	}
								object1= object1.nextobj;
							}
							object = object.nextobj;
						}
						
						
						System.out.println("--------------3nd list -------------");
						object = root3;
							while (object !=null) {
								System.out.println(object.name +"   "+ object.age+"  "+object.marks);
								object = object.nextobj;
							}
						
			
			
		}
	}
					


