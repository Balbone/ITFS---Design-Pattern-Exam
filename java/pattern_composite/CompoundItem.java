package designpattern.composite;

import java.util.Vector;

public class CompoundItem extends Item {
	private Vector<Item> item;

	public CompoundItem(String name) {
		super(name);
		item = new Vector<Item>();
	}

	@Override
	public void describe() {
		System.out.println(name);
		System.out.println("\tComposed by:");
		System.out.println("\t\t{");
		int vLength = item.size();
		for (int i = 0; i < vLength; i++) {
			Item c = (Item) item.get(i);
			c.describe();
		}
		System.out.println("}");
	}

	public void addItem(Item c) throws SaleableItemException {
		item.addElement(c);
	}

	public void removeItem(Item c) throws SaleableItemException {
		item.removeElement(c);
	}

	public Item getItem(int n) {
		return (Item) item.elementAt(n);
	}
}
