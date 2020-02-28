package com.lambaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Order{
	int price;
	String status;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [price=" + price + ", status=" + status + "]";
	}
	public Order(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}

}


@FunctionalInterface
 interface TransactionPredicate{
	boolean test(Order t);
}


public class OrderPredicateTest {

	public static void main(String[] args) {
		List<Order> orderList =new ArrayList<Order>();
		orderList.add(new Order(501,"ACCEPTED"));
		orderList.add(new Order(200,"ACCEPTED"));
		orderList.add(new Order(502,"COMPLETED"));
		orderList.add(new Order(480,"COMPLETED"));
		
		TransactionPredicate predicateLocation = (Order t) -> "ACCEPTED".equals(t.getStatus());	
		TransactionPredicate predicateAmount = (Order t) -> t.getPrice() > 500;	
		Consumer<List> consumer = (List x)->System.out.println(x);
		
				System.out.println("filtered By CITY : PUNE ");
				List<Order> filteredTransactions = filterTransactions(orderList, predicateAmount,consumer);
				System.out.println("---------------------------------------");
				System.out.println("filtered By PRICE >500");
				List<Order> filteredTransactions1 = filterTransactions(orderList, predicateLocation,consumer);
	
	}



	private static List<Order>  filterTransactions(List<Order> orderList, TransactionPredicate predicate, Consumer<List> consumer) {
		List<Order> filteredTransactions = new ArrayList<Order>();
		for(Order order: orderList) {
			if (predicate.test(order)) {
				filteredTransactions.add(order);
			}
		}
		consumer.accept((List) filteredTransactions);
		return filteredTransactions;
	
	}

}
