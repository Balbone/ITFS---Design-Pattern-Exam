package designpattern.composite;

public abstract class Item {
	protected String name;

	public Item(String name) {
		this.name = name;
	}

	public abstract void describe();

	public void addItem(Item c) throws SaleableItemException {
		if (this instanceof SaleableItem)
			throw new SaleableItemException();
	}

	public void removeItem(Item c) throws SaleableItemException {
		if (this instanceof SaleableItem)
			throw new SaleableItemException();
	}

	public Item getItem(int n) {
		return null;
	}
}