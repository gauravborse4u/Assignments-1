package FuncInter;
@FunctionalInterface
public interface FI1 {
	int Fi1();
	default void displayy() {
		System.out.println("FI1");
	}
}
