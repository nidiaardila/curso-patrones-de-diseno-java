package liskov;

public class Jaguar extends Animal implements IFelinoSalvaje{

	private int edad;
	private float peso;
		
	//constructor
	public Jaguar(int edad, float peso) {
		this.setEdad(edad);
		this.setPeso(peso);
	}
	
	public Jaguar(int edad) {
		this.setEdad(edad);
		this.setPeso(0.0f);
	}
	
	public Jaguar(float peso) {
		this.setEdad(0);
		this.setPeso(peso);
	}
	
	public Jaguar() {
		this.setEdad(0);
		this.setPeso(0.0f);
	}
	
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Mi edad es: " + this.getEdad() + " Mi peso es: " + this.getPeso();
	}
	
	public void dormir() {
		System.out.println("El Jaguar Duerme");
	}
	
	public void comer() {
		System.out.println("El Jaguar Come");
	}
	
	public void rugir() {
		System.out.println("El Jaguar Ruge!");
	}
	
	public void cazar() {
		System.out.println("El Jaguar caza!");
	}
	
	
	//Ya no es necesario implementar este metodo porque ahora Jaguar implementa IFelinoSalvaje y no IFelino
		/*
		 * public void maullar() { // TODO Auto-generated method stub 
		 * throw new UnsupportedOperationException("El jaguar no maulla"); }
		 */

	
	
}
