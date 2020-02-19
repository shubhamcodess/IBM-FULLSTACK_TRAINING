package com.enumm;



enum Status {
	NEW(10), REJECTED(-10), ACCEPTED(50),COMPLETED(100);
	int value;
	Status(int value) {
		//System.out.println("Inside constructor: " + value);
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		switch(this) {
			case NEW: return " NEW "; 
			case REJECTED: return "REJECTED "; 
			case ACCEPTED: return "ACCEPTED "; 
			case COMPLETED: return "COMPLETED "; 
			default: return "Invalid Status Order";
		}
	}
};
class Order{
	private int orderId;
	private String name;
	private int quantity;
	private double price;
	private Status status;
	//Status s;
	public Order(int orderId,String name,int quantity,double price,Status status)
	{
		this.orderId=orderId;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		this.status=status;
		
		
	}
	
	public  String toString() {
		return "orderId : "+this.orderId+" Name : "+this.name+" Quantity : "+this.quantity+" price : "+this.price+" Status : "+this.status;
		
	}
}
	
public class EnumTest {

	public static void main(String[] args) {
		Order o[]=new Order[5];
		
		o[0]=new Order(1,"ABC",5,500.0,Status.REJECTED);
		o[1]=new Order(2,"DEF",4,465.0,Status.NEW);
		o[2]=new Order(3,"GHI",45,900.0,Status.COMPLETED);
		o[3]=new Order(4,"JKL",3,980.0,Status.REJECTED);
		o[4]=new Order(5,"MNO",12,1230.0,Status.NEW);
		
		for(int i=0;i<o.length;i++)
		System.out.println(o[i]);

		
		}
	}


