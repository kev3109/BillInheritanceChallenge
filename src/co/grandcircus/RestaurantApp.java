package co.grandcircus;

public class RestaurantApp {
	public static void main(String[] args) {
	System.out.println("Thanks For Dining With Me, Here is your Bill");
	Bill b = new Bill(15.80, 0.06);
	pay(b);
	
	TippableBill tb = new TippableBill(8.50, 0.06, 2.00);
	pay((Bill)tb);
	}
	
	public static void pay(Bill b) {
		System.out.println("$" + b.calcTotal());
	}

	
		
	
		
		
	}

