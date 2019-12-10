import java.util.ArrayList;

public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		ArrayList<Object> objects = new ArrayList<>();
		int i = 0;
		while(true){
			objects.add(String.valueOf(i++).intern());
		}
	}
}
