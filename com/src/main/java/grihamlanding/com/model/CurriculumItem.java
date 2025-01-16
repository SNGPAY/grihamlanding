package grihamlanding.com.model;

public class CurriculumItem {

	private String _class;
	private Integer id;
	private String title;
	private String  description;
	private String content_summary;
	private boolean is_free;
	private Integer  sort_order;
	
	
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent_summary() {
		return content_summary;
	}
	public void setContent_summary(String content_summary) {
		this.content_summary = content_summary;
	}
	public boolean isIs_free() {
		return is_free;
	}
	public void setIs_free(boolean is_free) {
		this.is_free = is_free;
	}
	public Integer getSort_order() {
		return sort_order;
	}
	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}
	
	
}
