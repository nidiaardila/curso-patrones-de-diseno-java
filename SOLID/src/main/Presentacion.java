
package main;

public class Presentacion {
	public void imprimir(Rectangulo rectangulo) {
		System.out.println(rectangulo);
	}

	
	/*
	 * Presentacion presentacion = new Presentacion();
	 * presentacion.imprimir(rectangulo);
	 */
	  
	/*
	 * public void area(Rectangulo rectangulo) {
	 * System.out.println(rectangulo.getBase() * rectangulo.getAltura()); }
	 * 
	 * public void area(Triangulo triangulo) {
	 * System.out.println((triangulo.getBase() * triangulo.getAltura()) / 2); }
	 */
	 
	  public void area(IFigura figura) {
		  System.out.println(figura.area());
	}
}