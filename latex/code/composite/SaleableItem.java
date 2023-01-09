package designpattern.composite;

public class SaleableItem extends Item{
	private double weight;
	private String type;
	private double price;
	private String size;
	
	public SaleableItem(String name,String type, double weight, double price,String size) {
		super(name);
		this.weight = weight;
		this.price = price;
		this.type = type;
		this.size = size;
	}

	@Override
	public void describe() {
		 System.out.println( "SaleableItem: " + name  +", type: "+type +", weight: "+weight +"kg"+", price: "+price +"�" +", size:" + size); 
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
