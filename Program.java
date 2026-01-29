package program;

import maths.Addition;
import maths.Division;
import maths.geometry.Square;
import maths.geometry.Triangle;
import bank.CreditCard;
import bank.DebitCard;
import ecommerce.Product;
import ecommerce.Order;

public class Program{
	
	public static void main(String[] args){
		
		Addition addition = new Addition();
		addition.additionOperation1();
		addition.additionOperation2();
		
		Division division = new Division();
		division.divisionOperation1();
		division.divisionOperation2();
		
		CreditCard credit = new CreditCard();
		credit.creditCardOperation1();
		credit.creditCardOperation2();
		
		DebitCard debit = new DebitCard();
		debit.debitCardOperation1();
		debit.debitCardOperation2();
		
		Product product = new Product();
		product.productOperation1();
		product.productOperation2();
		
		Order order = new Order();
		order.orderOperation1();	
		order.orderOperation2();
		
		Triangle triangle = new Triangle();
		triangle.triangleOperation1();
		triangle.triangleOperation2();
		
		Square square = new Square();
		square.squareOperation1();
		square.squareOperation2();
	}
	
}
		