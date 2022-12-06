package subclass;

import java.util.ArrayList;
import java.util.List;

import model.Product;
import model.ReceiptDAO;

public class GetProductObject{
	private String receiptId;
	private List<Product> products;
	public GetProductObject(String receiptId) {
		this.receiptId = receiptId;
		products = new ArrayList<Product>();
	}
	private void getProductList() {
		ReceiptDAO receiptDAO = new ReceiptDAO();
		products = receiptDAO.getPurchasedProduct(receiptId);
	}
	
	public List<Product> get(){
		getProductList();
		return products;
	}
}