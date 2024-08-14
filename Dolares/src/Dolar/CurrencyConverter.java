package Dolar;

public class CurrencyConverter {
	private double dolar;
	private static double iof = 0.06;
	private double compra;
	

	
	public double getDolar() {
		return dolar;
	}
	
	public double getIof() {
		return iof;
	}
	public void setIof(double iof) {
		this.iof = iof;
	}
	public double getCompra() {
		return compra;
	}
	public void setCompra(double compra) {
		this.compra = compra;
	}

}
