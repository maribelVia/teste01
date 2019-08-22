import java.io.IOException;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		int valorInt;
		String valorString;
		char valorChar;
		double valorDouble;
		float valorFloat;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inteiro: ");
		valorInt = sc.nextInt();
		System.out.print("Double: ");
		valorDouble = sc.nextDouble();
		System.out.print("Float: ");
		valorFloat = sc.nextFloat();
		sc.nextLine();
		System.out.print("String: ");
		valorString =sc.nextLine();
		System.out.print("Char: ");
		valorChar = (char) System.in.read();

		System.out.println(valorInt);
		System.out.println(valorDouble);
		System.out.println(valorFloat);
		System.out.println(valorString);
		System.out.println(valorChar);
		
	}

}
  

