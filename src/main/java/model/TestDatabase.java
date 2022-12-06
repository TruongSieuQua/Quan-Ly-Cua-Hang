package model;

import java.util.List;

public class TestDatabase {
	public static void main(String args[]) {
		ProductDAO productDAO = new ProductDAO();
		
		
		List<Product> productList = productDAO.getListProduct();
		
		productList.forEach(product ->{
			System.out.println(product.getName());
		});
		
	}
}
