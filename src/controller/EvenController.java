package controller;

public class EvenController {

	public EvenController() {
		
		super();
	
	}
	
	public int fnPar(int[] vet, int tamanho) {
		
		int repasse = 0;
		
		if(tamanho == -1) {
			
			return 0;
			
		} else {
			
			repasse = fnPar(vet, tamanho - 1);
			
			if((vet[tamanho] % 2) == 0) {
				
				return repasse + 1;
				
			} else {
				
				return repasse;
				
			}
			
		}
		
	}
	
}