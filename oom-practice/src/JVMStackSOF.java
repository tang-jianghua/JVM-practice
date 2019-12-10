public class JVMStackSOF {

	private int stackLength=0;

	public void stackLeak(){
		this.stackLength++;
		stackLeak();
	}

	public static void main(String[] args) {
		JVMStackSOF jvmStackSOF = new JVMStackSOF();
		jvmStackSOF.stackLeak();
	}
}
