package InherAbstract;

public class Device {
	public static void main(String args[]) {
		Specs sc=new DeviceDetails();
		sc.setName("Boat stone Rugby");
		System.out.println(sc.getName());
		System.out.println(sc.Bluetoothver(5.1f));
		System.out.println(sc.colour("Blue"));
		System.out.println(sc.backup(8));
	}
}
