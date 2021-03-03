package businessLayer;

public class Receiving {
	
	private String ASN;
	private String item_bar_code;
	private int qty;
	private int received_qty=0;

	public String getASN() {
		return this.ASN;
	}

	public void setASN(String ASN) {
		this.ASN = ASN;
	}

	public String getItem_bar_code() {
		return item_bar_code;
	}

	public void setItem_bar_code(String item_bar_code) {
		this.item_bar_code = item_bar_code;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
		setReceived_qty(this.qty);
	}

	public int getReceived_qty() {
		return received_qty;
	}

	public void setReceived_qty(int received_qty) {
		this.received_qty = this.received_qty + received_qty;
	}
	
	public void enterItemDetails() {
		System.out.println("Please enter the item details in order to proceed next");
	}
	

}
