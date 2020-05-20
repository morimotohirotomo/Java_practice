package sukkiri2;

public class Chapter1_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "abc,def:ghi";
		String[] word = s.split("[,:]");
		for (String w : word) {
			System.out.print(w + "->");
		}
	}

}
