package entities;

public class importedProduct extends Product {
	public Double customsFee;
	
	public importedProduct() {
		super();
	}

	public importedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " $ "
				+ String.format("%.2f", getPrice())
				+ " (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}

}
