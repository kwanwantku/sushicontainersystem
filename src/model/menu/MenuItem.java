package model.menu;

import util.MenuAdapter;

public abstract class MenuItem implements MenuAdapter.Item {

	private String productId;
	private String name;
	private String image;
	private double price;

	public MenuItem(String productId, String name, String image, double price) {
		this.productId = productId;
		this.name = name;
		this.image = image;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public double getPrice() {
		return price;
	}
}