/* Necessário importar as biblioteca Scanner e ArrayList para encriptação do
texto, informado pelo usuário */
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public String textoSemEspacos;
	public ArrayList<Character> listaCaracteres = new ArrayList<>();
	public String textoEncriptado = "";
	
	public void encriptaTexto() {
		char[] textoEncriptado = this.textoSemEspacos.toCharArray();
		
		for (int i  = 0; i < Math.round(Math.sqrt(textoEncriptado.length)); i++) {
			for (int j = i; j < textoEncriptado.length; j+= Math.round(Math.sqrt(textoEncriptado.length))) {
				if (j >= textoEncriptado.length) {
					break;
				} else {
					listaCaracteres.add(textoEncriptado[j]);
				}
			}
			listaCaracteres.add(' ');
		}
	}
	
	public String calc(String textoOriginal) {
		this.textoSemEspacos = textoOriginal.replaceAll("\\s+","");
		encriptaTexto();
		
		for (int i = 0; i < this.listaCaracteres.size(); i++) {
			this.textoEncriptado += listaCaracteres.get(i);
		}
		
		return this.textoEncriptado;
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Bem-vindo ao encriptador 2022!");
		String textoOriginal = sc.nextLine();
		System.out.println(textoOriginal);
		calc(textoOriginal);
	}
}
