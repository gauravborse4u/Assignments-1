package FuncInter;

public class Child implements FI2,FI1{
	
	public static void main(String args[]) {
		FI1 a=new Child();
		a.Fi1();
	    FI2 b=new Child();
	    b.Fi1();
	}

	@Override
	public int Fi1() {
		// TODO Auto-generated method stub
		display();
		displayy();
		return 0;
	}
}