package view;
import controller.EvenController;
public class Principal {

	public static void main(String[] args) {
		
		EvenController ec = new EvenController();
		
		int[] vet = {3, 15, 2, 12, 4, 32, 6, 29, 8, 14};
		
		int tamanho = vet.length - 1;
		
		System.out.println("Quantidade de pares igual a: " + ec.fnPar(vet, tamanho));
		
	}
	
}