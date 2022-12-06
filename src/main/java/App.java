import controller.CustomerController;
import controller.ProductController;
import controller.ReceiptController;
import gui.MainPage;

public class App {
	public static void main(String[] args) {
		MainPage app = new MainPage();
		//Tùy đăng nhập mà trả về các Panel tương ứng
		ProductController productController = new ProductController(app);
		CustomerController customerController = new CustomerController(app);
		ReceiptController receiptController = new ReceiptController(app);
		
		app.addContent(productController.getPanel(),"Sản Phẩm" ,"src/main/resources/logo/products.png",1 ,false);
		app.addContent(customerController.getPanel(), "Khách Hàng", "src/main/resources/logo/Customer.png",2 ,false);
		app.addContent(receiptController.getPanel(), "Hóa Đơn", "src/main/resources/logo/receipt (1).png",3 ,true);
		app.setVisible(true);
	}
	
	//	private void setItemListModel() {
	//	addControlItem("Tài Khoản", "src/main/resources/logo/user.png", true);
	//	addControlItem("Sản Phẩm", "src/main/resources/logo/products.png", false);
	//	addControlItem("Nhân Viên", "src/main/resources/logo/employee.png", false);
	//	addControlItem("Khách Hàng", "src/main/resources/logo/Customer.png", false);
	//	addControlItem("Hóa Đơn", "src/main/resources/logo/receipt (1).png", false);
	//	addControlItem("Thống Kê", "src/main/resources/logo/pie-chart.png", true);
	//	addControlItem("Cài Đặt", "src/main/resources/logo/settings.png", false);
	//	addControlItem("Đăng Xuất", "src/main/resources/logo/logout(2).png", false);
	//}
}
