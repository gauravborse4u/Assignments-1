package AbstractConcrete;

public class Concrete1 extends Food{

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 240;
	}

	@Override
	int rating() {
		// TODO Auto-generated method stub
		return 5;
	}
	public static void main(String a[]) {
		Food f=new Concrete1();
		int p=f.price();
		int r=f.rating();
		System.out.println(p);
		System.out.println(r);
		
	}

}
