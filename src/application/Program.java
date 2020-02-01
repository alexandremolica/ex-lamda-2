package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*
		 * Predicate - removeIf
		 */

		// Remove da lista price maior igual a 100
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// implementando a interface
		// predicate
		/*
		 * list.removeIf(new ProductPredicate()); 
		*/
		
		// ou usar Method reference- tambem é aceito 
		// no sistema lambda
		/*
		* list.removeIf(Product:: staticProductPredicate );
		*/
		
		// ou usar metodo não static
		/*
		*list.removeIf(Product:: nonStaticProductPredicate );
		*/
		
		//ou expresao lambda declarada
		/*
		*Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		*list.removeIf(jpred);
		*/
		
		// ou expressao lambda inLine
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
