package sunbeam.beans;

import dao.BookDao;
import pojos.Book;

public class DetailBean {
	private int book_id;
	private String subject_name;
	private String book_name;
	private String author_name;
	private Float price;
	private boolean success;
	public DetailBean() {
		
		this.book_id=0;
		this.subject_name="";
		this.book_name="";
		this.author_name="";
		this.price=0.0f;
		this.success=false;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public void find()
	{
		try (BookDao dao = new BookDao()){
			Book b=dao.getBook(this.book_id);
			this.success=(b!=null);
			if(this.success)
			{
				this.subject_name=b.getSubject_name();
				this.book_name=b.getBook_name();
				this.author_name=b.getAuthor_name();
				this.price=b.getPrice();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
