package grihamlanding.com.model;

public class Course {

	private Integer id;
	private String title;
	private String subtitle;
	private String image_480x270;
	private boolean is_paid;
	private String price;
	private String num_reviews;
	private Object result;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getImage_480x270() {
		return image_480x270;
	}
	public void setImage_480x270(String image_480x270) {
		this.image_480x270 = image_480x270;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNum_reviews() {
		return num_reviews;
	}
	public void setNum_reviews(String num_reviews) {
		this.num_reviews = num_reviews;
	}
	public boolean isIs_paid() {
		return is_paid;
	}
	public void setIs_paid(boolean is_paid) {
		this.is_paid = is_paid;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	
}
