package AbstractConcrete;

public class Concrete2 extends Food{

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 140;
	}

	@Override
	int rating() {
		// TODO Auto-generated method stub
		return 4;
	}
	public static void main(String a[]) {
		Food f=new Concrete2();
		int p=f.price();
		int r=f.rating();
		System.out.println(p);
		System.out.println(r);
		
	}

}