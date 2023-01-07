package designpattern.composite;

public class SaleableItemException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaleableItemException() {
		super("Not supported method, you cant add Item on SaleableItem");
	}
}
