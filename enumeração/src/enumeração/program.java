package enumeração;

import java.util.Date;

import entites.Order;
import entities.enums.OrderStatus;

public class program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(0), OrderStatus.DEVILERED);
		
		System.out.println(order);
	}

}
