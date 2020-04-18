package practice6;

public class Chap6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i < 10; i++) {
			kuku(i);
		}
	}
	public static void kuku(int n) {
		for(int i = 1; i < 10; i++) {
			System.out.printf(" %2d", n * i);
		}
		System.out.println();
	}

}
