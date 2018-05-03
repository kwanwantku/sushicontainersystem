package model;

/**
 * The attribute of each appitizer.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 * @since 2018.04.18
 */
public class Appitizer implements MenuDetail{
	
	private long productId;
	private String name;
	private String image;
	private int amount;
	private String type;

	public Appitizer(long productId, String name, String image, int amount,String type) {
		this.name = name;
		this.image = image;
		this.amount = amount;
		this.type = type;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getImage() {
		return image;
	}

	@Override
	public int getAmount() {
		return amount;
	}
	
	@Override
	public long getProductId() {
		return productId;
	}

	@Override
	public String getType() {
		return type;
	}

}
