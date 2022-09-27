package EncapConstruct;

public class Addition {
     int a, b;
     float c,d;
     Addition(){a=0;b=0;}
     Addition(int m,int n){a=m;b=n;}
     Addition(float m,float n){c=m; d=n;}
     void display() {System.out.println(a+b);}
     void display1() {System.out.println(c+d);}
     public static void main(String a[]) {
    	 Addition obj1=new Addition();
    	 Addition obj2=new Addition(2,3);
    	 Addition obj3=new Addition(0,10);
    	 Addition obj4=new Addition(1.1f,10.1f);
    	 Addition obj5=new Addition(3.3f,5.9f);
    	 obj1.display();
    	 obj2.display();
    	 obj3.display1();
    	 obj4.display1();
    	 obj5.display1();
     }
}
