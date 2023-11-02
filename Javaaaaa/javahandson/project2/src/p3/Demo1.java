package p3;

public class Demo1 {

	public static void main(String[] args) {
		AddTo addto = new AddTo();
		addto.setNum1(15);
		addto.setNum2(12);
		AddBo addbo = new AddBo();
		addbo.computeAdd(addto);
		
		System.out.println(addto);
		
		AddTo addto1 = new AddTo(40,50);
		addbo.computeAdd(addto1);
		System.out.println(addto1);
	}
}
