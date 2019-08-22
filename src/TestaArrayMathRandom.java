
import java.util.Scanner;

public class TestaArrayMathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[15];
		for (int k=0;k<vetor.length;k++) {
			vetor[k] = (int) (Math.random() * 20 + 1);
		}
		for (int x: vetor)
			System.out.println(x);
		System.out.println("Digite um valor de 0 - 20 ");
		int valor = sc.nextInt();
		boolean flag = false;
		for (int c=0;c<vetor.length;c++) {
			if (valor == vetor[c]) {
				System.out.println("Valor: " + valor + " esta presente no vetor na posicao: " + c);
				flag = true;
			}
		}
		if (!(flag)) {
			System.out.println("O valor " + valor + " nao esta presente no vetor!");
		}
		
		
		
	}

}
