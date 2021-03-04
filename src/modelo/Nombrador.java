package modelo;

public class Nombrador {

	private String nombres[]= {"anacleto","benvenuto","cirilo","diocleciano"};
	
	public String giveMeMyName(char letra) {
		char miLetra=Character.toLowerCase(letra);
		byte letraCero='a';
		int posicion=miLetra-letraCero;
		if(posicion>nombres.length-1) {
			return "Romualdo";
		}
		return nombres[posicion];
	}
}
