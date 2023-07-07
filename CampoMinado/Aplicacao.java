package CampoMinado;

import Modelo.Tabuleiro;
import Visao.TabuleiroConsole;

public class Aplicacao {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(10, 10, 5);
		new TabuleiroConsole(tabuleiro);
		
	}

}
