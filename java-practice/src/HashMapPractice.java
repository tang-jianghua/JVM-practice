import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {

public static void main(String[] args) {
	Map<String,Object> map = new HashMap(1 << 2, 0.75f) {{
		put("a", "1");
		put("b", "1");
		put("c", "1");
		put("d", "1");
	}};
	Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
	int i = 0;
	while (iterator.hasNext()){
		Map.Entry<String,Object> next = iterator.next();
	}
}
}
