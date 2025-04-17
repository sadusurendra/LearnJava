package corejava.a4.packages;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Integer.*;

public class StaticImports {

	public static void main(String[] args) {

		out.println("static import");

		Scanner sc = new Scanner(System.in);
		int num1 = parseInt(sc.next());

		System.out.println(num1);
	}

}
