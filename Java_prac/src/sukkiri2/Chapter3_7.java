package sukkiri2;
import java.util.HashMap;
import java.util.Map;

public class Chapter3_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Integer> profs = new HashMap<String, Integer>();
		profs.put("Jon", 12);
		profs.put("Bob", 15);
		profs.put("Mary", 14);
		System.out.println(profs.keySet());
		System.out.println(profs.get("Jon"));
		for (String key : profs.keySet()) {
			int age = profs.get(key);
			System.out.println(key + " : " + age);
		}
	}

}
