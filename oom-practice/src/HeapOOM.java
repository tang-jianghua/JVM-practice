import java.util.ArrayList;

/**
 *  -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
 */
public class HeapOOM {

	static class OOMObject{

	}

	public static void main(String[] args) {

		ArrayList<Object> objects = new ArrayList<>();
		while (true){
			objects.add(new OOMObject());
		}
	}
}
