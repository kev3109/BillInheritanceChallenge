package co.grandcircus;

public class Bill {
	private double subtotal;
	private double taxRate;
	
	public Bill() {
		
	}
	
	public Bill(double subtotal, double taxRate) {
		this.subtotal = subtotal;
		this.taxRate = taxRate;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public double calcTotal() {
		return (subtotal *(1 + taxRate));
		
	}
		
		
	
	
	
}
