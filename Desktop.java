package week3.day2.assignments;

public class Desktop implements HardWare, SoftWare {
	static String sUnitName = "SoftWare Component declared as public and static";
	String hUnitName = "Hardware component declared as non-static";
	
	public void softwareResources(String SComponents) {
		
		System.out.println("SoftWare components: " +SComponents);
	}

	public void hardwareResources(String hComponent) {
		System.out.println("HardWare components: " +hComponent);
		
	}

	public static void main(String[] args) {
	Desktop obj = new Desktop();
	obj.hardwareResources(obj.hUnitName);
	obj.softwareResources(sUnitName);
	
	
	}


}
