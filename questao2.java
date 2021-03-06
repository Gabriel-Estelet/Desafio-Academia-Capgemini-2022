/* Necessário importar a biblioteca Scanner para ler o valor de x, definido pelo
usuário do programa */
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int[] vetor = {78, 62, 12, 11, 10, 7, 9};
        
        System.out.print("Informar valor de x: ");
        int valorDiferenca = sc.nextInt();
        System.out.println("x = " + valorDiferenca + "\n");
        
        System.out.print("Vetor n: [ ");
        for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
        }
        System.out.print("]");
        
        int n = vetor.length;
        int temp = 0; 
        
        /* O algoritmo abaixo compara cada elemento de índice i com outro 
        elemento de índice k dentro do array vetor, de maneira a determinar se a 
        diferença entre ambos (subtração) é equivalente ao valor armazenado
        da variável valorDiferenca definida anteriormente - caso seja,
        os dois elementos são exibidos como saída. */
        System.out.println("\n\nPares do vetor com uma diferença de " + valorDiferenca + ":");
        for (int i = 0; i < vetor.length; i++) {
            for (int k = 0; k < vetor.length; k++) {
                if (vetor[i] - vetor[k] == valorDiferenca) {
                    System.out.print("\n[" + vetor[i] + ", " + vetor[k] + "]");
                }
            }
        }
}
}
