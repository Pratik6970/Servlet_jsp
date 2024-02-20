package sunbeam.beans;

import java.util.ArrayList;
import java.util.List;

import dao.BookDao;
import pojos.Book;

public class BooksBean {
	private String subject_name;
	private List<Book> bookList;
	
	
	public BooksBean() {
		this.subject_name="";
		this.bookList=new ArrayList<Book>();
	}


	public String getSubject_name() {
		return subject_name;
	}


	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}


	public List<Book> getBookList() {
		return bookList;
	}


	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void fetchBooks()
	{
		try (BookDao dao = new BookDao()){
			this.bookList=dao.getBooks(this.subject_name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
