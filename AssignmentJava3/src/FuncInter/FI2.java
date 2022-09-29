package FuncInter;
@FunctionalInterface
public interface FI2 extends FI1{
	default void display() {
		System.out.println("FI2");
	}
}
