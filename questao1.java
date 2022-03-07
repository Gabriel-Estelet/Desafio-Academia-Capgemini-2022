public class Main
{
	public static void main(String[] args) {
		
        int[] lista = {8, 25, 13, 59, 57, 63, 7};
        
        System.out.println("Lista: ");
        
        for (int i = 0; i < lista.length; i++) {
        System.out.print(lista[i] + " ");
        }
        
        /* Foi utilizado o algoritmo bubble sort, ou ordenação por flutuação,
        para reorganizar a lista por ordem crescente, afim de se encontrar a
        mediana posteriormente. */
        int n = lista.length;
        int temp = 0; 
        
        for (int i = 0; i < n; i++) {
                 for (int j = 1; j < (n-i); j++) {
                     
                          if(lista[j-1] > lista[j]) {  
                                 temp = lista[j-1];  
                                 lista[j-1] = lista[j];  
                                 lista[j] = temp;  
                          }  
                 }
        }
        
        System.out.println("\nA mediana é: ");
        /* Sendo a saída de lista.length sempre um número inteiro, o resultado 
        será sempre a parte inteira do número decimal (já que a lista sempre 
        terá uma quantidade ímpar de números) equivalente a divisão do tamanho 
        da lista pela metade - o índice da lista correspondente à este número, 
        por sua vez, será a mediana, com a lista ordenada. */
        System.out.println(lista[(lista.length/2)]);
	}
}
