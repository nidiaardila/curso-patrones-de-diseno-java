package main;

public class Main {

	public static void main(String[] args) {
		
		Jaguar yagua = new Jaguar(10, 120f);
		
		System.out.println(yagua);
		
		yagua.dormir();
		yagua.comer();
		
		yagua.rugir();
		yagua.cazar();
		yagua.maullar();
		
		Jaguar jaguar2= new Jaguar();
		System.out.println(jaguar2);
		
		Jaguar jaguar3= new Jaguar(10);
		System.out.println(jaguar3);
		
		Jaguar jaguar4= new Jaguar(100f);
		System.out.println(jaguar4);


	}

}
