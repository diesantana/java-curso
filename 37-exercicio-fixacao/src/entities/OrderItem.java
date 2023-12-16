package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product = new Product();
	
	public OrderItem() {}

	public OrderItem(Integer quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.price = product.getPrice();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
}
