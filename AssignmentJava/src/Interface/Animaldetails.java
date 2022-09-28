package Interface;

public class Animaldetails implements Animal{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Tiger");
	}

	@Override
	public void Omnivore() {
		// TODO Auto-generated method stub
		System.out.println("not Omnivore");
	}
	public static void main(String ar[]) {
		Animal a=new Animaldetails();
		a.name();
		a.Omnivore();
	}
}
