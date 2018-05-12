package model.menu;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "MenuItem")
public class MenuItem {

    @DatabaseField(generatedId = true)
	private Integer productId;
    @DatabaseField
	private String name;
    @DatabaseField
	private String image;
    @DatabaseField
	private double price;

    public MenuItem() {
        this(-1, null, null, 0);
    }

    public MenuItem(Integer productId, String name, String image, double price) {
        this.productId = productId;
        this.name = name;
        this.image = image;
        this.price = price;
    }

	public int getProductId() {
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

	@Override
	public String toString() {
		return "MenuItem{" +
				"productId=" + productId +
				", name='" + name + '\'' +
				", image='" + image + '\'' +
				", price=" + price +
				'}';
	}
}