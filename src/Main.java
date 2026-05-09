import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		var value = """
				{"name":"João","age":30,
				""";

		Map<String, String> map = new HashMap<>();
		
		value = value.replace("{", "").replace("}", "").replace("\"", "");
		var valueArr = value.split(",");
		for (var v: valueArr) {
			var keyValue = v.split(":");
			map.put(keyValue[0], keyValue[1]);
		}
		
		System.out.println(map);
	}
}
