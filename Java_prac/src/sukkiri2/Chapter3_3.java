package sukkiri2;
import java.util.ArrayList;
import java.util.Iterator;

public class Chapter3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jon");
		names.add("Bob");
		names.add("Mary");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}

}
