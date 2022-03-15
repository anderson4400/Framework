package Test;

import org.testng.annotations.Test;

public class prueba extends Accion   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Accion.navegarUrl("http://automationpractice.com/index.php");
		Accion.hacerClick("search_query_top");
		Accion.poblarCampo("search_query_top", "Anderson Medina");
	}

}
