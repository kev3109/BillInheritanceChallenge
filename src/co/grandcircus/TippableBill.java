package co.grandcircus;

public class TippableBill extends Bill {

	private double tip;
	
	public TippableBill() {
	
	}
	
	public TippableBill(double subtotal, double taxRate, double tip) {
		super(subtotal, taxRate);
		this.tip = tip;
	}

	public double getTip() {
		return tip;
	}

	public void setTip(double tip) {
		this.tip = tip;
	}

	@Override
	public double calcTotal() {
		double total = super.calcTotal();
		total += tip;
		return total;
		
	}

	
	
	
	

}
