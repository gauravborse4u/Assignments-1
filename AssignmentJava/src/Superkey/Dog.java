package Superkey;
class Animal{
	int legs;
}
public class Dog extends Animal{
	Dog(){
		super();
	}
	public static void main(String a[]) {
        System.out.println("Parent class default constructor is called");
	}
}
