public class Main {

	public static void main(String[] args) {
		
		CompoundItem store = new CompoundItem("Atelier Splendor");
		
		CompoundItem splendorCreation = new CompoundItem("splendorCreation");
		
		CompoundItem otherBrand = new CompoundItem("OtherBrand");
		
		CompoundItem accessories = new CompoundItem("Accessories");
		
		try {

			store.addItem(splendorCreation);
			store.addItem(otherBrand);
			otherBrand.addItem(accessories);
		} catch (SaleableItemException e) {
			
			e.printStackTrace();
		}
		
		
		SaleableItem pantalone = new SaleableItem("pantalone","vestito",0.5,12.00,"42",30);
		SaleableItem maglia = new SaleableItem("maglia","vestito",0.3,14.00,"XS",2);
		SaleableItem cintura = new SaleableItem("cintura","accessories",0.1,5.00,"1m",4);
		SaleableItem giubbotto = new SaleableItem("giubbotto","vestito",2,75.00,"S",6);
		SaleableItem stivale = new SaleableItem("stivale","calzature",2,25.00,"42",16);
		
		SaleableItem sciarpa = new SaleableItem("sciarpa","accessories",0.1,5.00,null,5);
		
		try {
			splendorCreation.addItem(pantalone);
			splendorCreation.addItem(maglia);
			splendorCreation.addItem(stivale);
			
			otherBrand.addItem(giubbotto);
			accessories.addItem(cintura);
			accessories.addItem(sciarpa);
			
			
		} catch (SaleableItemException e) {
			
			e.printStackTrace();
		}
		
		store.describe();
		
		
		
	}

}