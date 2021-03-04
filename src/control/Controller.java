package control;

import modelo.Asignador;
import modelo.Nombrador;

public class Controller {
	private Nombrador nombrador;
	private Asignador asignador;

	public Controller() {
		super();
		nombrador=new Nombrador();
		asignador=new Asignador();
	}
	
	public String dameNombre(char letra) {
//		return nombrador.giveMeMyName(letra);
		return asignador.teDoyAlgo();
	}
}
