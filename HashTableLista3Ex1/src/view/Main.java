package view;
import controller.ListaController;

public class Main {
	
	public static void main(String[] args) {
		
		ListaController[] lista = new ListaController[4];
		
		for(int i = 0; i< lista.length; i++) {
			
			lista[i] = new ListaController();
			
		}
		
		
		
	}
}
