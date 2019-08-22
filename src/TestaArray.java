
import java.util.Scanner;

public class TestaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] pa = new int[10];
		int[] pg = new int[10];
		
		//progressaoAritmetica(sc, pa);
		progressaoGeometrica(sc, pg);

	}

	private static void progressaoGeometrica(Scanner sc, int[] pg) {
		// TODO Auto-generated method stub
		System.out.print("PG - Inicio da sequencia: ");
		int i = sc.nextInt();
		System.out.print("Razao: ");
		int r = sc.nextInt();
		
		pg[0] = i;
		for (int k=1; k<pg.length; k++) {
			pg[k] = pg[k-1] * r;
		}
		for (int x: pg) {
			System.out.println(x);
		}
		
		
	}

	private static void progressaoAritmetica(Scanner sc, int[] pa) {
		System.out.println("PA - Inicio da sequencia: ");
		int i = sc.nextInt();
		System.out.println("Razao: ");
		int r = sc.nextInt();
		
		pa[0] = i;
		for (int k=1; k<pa.length; k++) {
			pa[k] = pa[k-1] + r;
		}
		for (int x: pa) {
			System.out.println(x);
		}
	}

}
