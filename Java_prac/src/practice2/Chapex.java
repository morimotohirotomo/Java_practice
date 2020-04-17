package practice2;

public class Chapex {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 1, b = 2, c = 3, d = a, e = a, f = a, g = a, n = 5;
		for (int i = 1; i < n; i++) {
			d += b;
			e *= c;
			f += d;
			g += e;
		}
		System.out.println("初項："+a+",公差："+b+",公比："+c+",n："+n);
		System.out.println("等差数列："+d+",等比数列："+e);
		System.out.println("等比級数："+f+",等比級数："+g);
	}

}
