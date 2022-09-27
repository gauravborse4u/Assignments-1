package Que2;
class Person{
	void message(String s) {
		System.out.println(s);
	}
	void reply(String s) {
		System.out.println(s); 
	}
}
public class Chat {
	public static void main(String args[]) {
		Person p1=new Person();
		Person p2=new Person();
		p1.message("Hi");
		p2.message("Hi");	
	}
}
