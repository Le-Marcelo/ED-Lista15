package controller;

import model.BarraDeChocolate;
import model.Lista;

public class ChocolateController {

	Lista<BarraDeChocolate>[] hashtable = new Lista[5];
	
	public ChocolateController() {
		for(Lista<BarraDeChocolate> i : hashtable) {
			i =  new Lista<BarraDeChocolate>();
		}
	}
	
	//Ver a condição do arquivo (ifs?)
	public int hash(int valor) {
		
	}

}
