package sukkiri2;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Chapter3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//順不同、重複不可
		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("red");
		System.out.println(colors.size());
		for (String color : colors) {
			System.out.println(color);
		}

		//辞書順
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("bird");
		for (String word : words) {
			System.out.println(word);
		}
	}

}
