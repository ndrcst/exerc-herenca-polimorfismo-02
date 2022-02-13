package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date macufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date macufactureDate) {
		super(name, price);
		this.macufactureDate = macufactureDate;
	}
	
		
	public Date getMacufactureDate() {
		return macufactureDate;
	}

	public void setMacufactureDate(Date macufactureDate) {
		this.macufactureDate = macufactureDate;
	}

	@Override
	public String priceTag() {
		return name + "(used) $ " + String.format("%.2f", price)
		+ "(Manufacture Date: " + sdf.format(getMacufactureDate()) + ")" ;
	}
	
	
	

}
