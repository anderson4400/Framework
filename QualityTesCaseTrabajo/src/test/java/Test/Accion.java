package Test;


public abstract class Accion {
	
	public  static void hacerClick(String obj) {
		 InstanciaUnica.getInstanciaUnica().hacerClick(obj);
	}
	
	public static void navegarUrl(String Url) {
		 InstanciaUnica.getInstanciaUnica().navegarUrl(Url);;
	}
	
	public static void poblarCampo(String Obj, String text) {
		 InstanciaUnica.getInstanciaUnica().poblarCampo(Obj, text);
	}
}
