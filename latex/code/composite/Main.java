package designpattern.composite;

public class Main {

	public static void main(String[] args) {
		
		CompoundItem store = new CompoundItem("SplendorStore");
		
		CompoundItem splendorCreation = new CompoundItem("splendorCreation");
		
		CompoundItem otherCreation = new CompoundItem("OtherCreation");
		
		CompoundItem accessories = new CompoundItem("Accessories");
		
		try {
			store.addItem(otherCreation);
			store.addItem(splendorCreation);
			otherCreation.addItem(accessories);
		} catch (SaleableItemException e) {
			
			e.printStackTrace();
		}
		
		
		SaleableItem pantalone = new SaleableItem("pantalone","vestito",0.5,12.00,"42");
		SaleableItem maglia = new SaleableItem("maglia","vestito",0.3,14.00,"XS");
		SaleableItem cintura = new SaleableItem("cintura","accessories",0.1,5.00,"1m");
		SaleableItem giubbotto = new SaleableItem("giubbotto","vestito",2,75.00,"S");
		
		try {
			splendorCreation.addItem(pantalone);
			splendorCreation.addItem(maglia);
			
			otherCreation.addItem(giubbotto);
			accessories.addItem(cintura);
			
			
		} catch (SaleableItemException e) {
			
			e.printStackTrace();
		}
		
		store.describe();
	}

}
