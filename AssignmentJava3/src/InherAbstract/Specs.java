package InherAbstract;

public abstract class Specs {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract Float Bluetoothver(Float f);
	abstract String colour(String c);
	abstract int backup(int a);
}
