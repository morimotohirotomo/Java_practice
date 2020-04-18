package practice3;
import java.util.Scanner;
public class Chap13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~12");
		int month = scanner.nextInt();
		switch( month ){
		    case 2:
		        System.out.println( "28日です" );
		        break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		        System.out.println( "30日です" );
		        break;
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		        System.out.println( "31日です" );
		        break;
		    default:
		        System.out.println( "入力が間違っています" );
		        break;
		}
	}

}
