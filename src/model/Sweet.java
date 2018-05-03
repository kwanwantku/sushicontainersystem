package model;

/**
 * The attribute of each sushi.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 * @since 2018.04.18
 */
public class Sweet implements MenuDetail{
	
	private long productId;
	private String name;
	private String image;
	private int amount;
	private int typeid;
	private String type;

	public Sweet(long productId, String name, String image, int amount) {
		this.name = name;
		this.image = image;
		this.amount = amount;
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
		// TODO Auto-generated method stub
		return null;
	}

}

