public class CompoundItem extends Item {
	private ArrayList<Item> items;

	public CompoundItem(String name) {
		super(name);
		items = new ArrayList<Item>();
	}

	@Override
	public void describe() {
		System.out.println(name);
		System.out.println("\tComposed by:");
		System.out.println("\t\t{");
		items.forEach(Item::describe);
		System.out.println("}");
	}

	public void addItem(Item c) throws SaleableItemException {
		items.add(c);
	}

	public void removeItem(Item c) throws SaleableItemException {
		items.remove(c);
	}

	public Item getItem(int n) {
		if (n<0 || n>items.size()) return null;
		return (Item) items.get(n);
	}
	
	public Item getItem(String name) {
		List<Item> tmp= items.stream().filter(x->x.name.equals(name)).collect(Collectors.toList());
		return tmp.size() == 0 ? null : tmp.get(0);
	}
}
