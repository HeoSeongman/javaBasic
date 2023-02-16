package 생성자;

public class Article {
	int no;
	String title;
	String content;
	String createdBy;
	
	public Article(int no, String title, String content, String createdBy) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Article [no=" + no + ", title=" + title + ", content=" + content + ", createdBy=" + createdBy + "]";
	}
	
	
}
