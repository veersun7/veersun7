package p2;

public class ProductService {

	public ProductService() {
		super();
		
	}

	public String findNameByCode(int id) {
		for (Product x :ProductRepository.getProducts()) {
			if(x.getProductCode()==id) {
				return x.getName();
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		ProductService obj = new ProductService();
		System.out.println(obj.findNameByCode(107));
	}
}
