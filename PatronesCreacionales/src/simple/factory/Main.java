package simple.factory;

public class Main {

	public static void main(String[] args) {
		
		//sin implementar simple factory
//		Pizza pizzaPeperoni = new Pizza(8);
//		System.out.println(pizzaPeperoni);
		
		
		Pizzeria pizzeriaCF = new Pizzeria();
		Pizza pizzaPeperoni = pizzeriaCF.crearPizzaChica();
		
		System.out.println(pizzaPeperoni);
		
	}

}
