package subclass;

import java.util.List;

import model.Product;
import model.ProductDAO;

public class SearchProductObject{
	private Product product;
	private List<Product> productList;
	public SearchProductObject(Product p){
		this.product = p;
	}
	
	public List<Product> getListProductResult() {
		Product keyWord = this.product;
		if(keyWord!=null) {
			ProductDAO productDAO = new ProductDAO();
			this.productList = productDAO.search(keyWord);
			return this.productList;
		}
		return null;
	}
}