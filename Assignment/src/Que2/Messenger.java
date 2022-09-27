package Que2;

public abstract class Messenger {
 abstract void message();
}
class Whatsapp{
	public static void main(String a[]) {
		Whatsapp m =new Whatsapp();
		m.message();
		}
	void message() {
		System.out.println("Hi");
	}
}