package practice6;

public class Chap4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 3; i < 6; i++) {
			size(i);
			System.out.println();
		}
	}
	public static void size(int n) {
		for(int i = 0; i < n; i++) {
			for(int ii = 0; ii <= i; ii++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}

}
