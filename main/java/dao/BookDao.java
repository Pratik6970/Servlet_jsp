package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Book;
import utils.DBUtils;

public class BookDao implements AutoCloseable {
	
	private Connection connection;
	private PreparedStatement pst1;

	public BookDao()throws Exception{
		this.connection=DBUtils.fetchDBConnection();
	}
	
	public int insert(Book book)throws Exception
	{
		// book_id | subject_name | book_name             | author_name    | price
		String sql="INSERT INTO books33 VALUES(?,?,?,?,?)";
		try(PreparedStatement insertStatement=connection.prepareStatement(sql) ){
			insertStatement.setInt(1, book.getBook_id());
			insertStatement.setString(2, book.getSubject_name());
			insertStatement.setString(3, book.getBook_name());
			insertStatement.setString(4, book.getAuthor_name());
			insertStatement.setFloat(5, book.getPrice());
			return insertStatement.executeUpdate();
		}
		
		
	}
	
	public int update(Book book)throws Exception
	{
		// book_id | subject_name | book_name             | author_name    | price
		String sql=" UPDATE books33 SET  book_id=?,subject_name =?, book_name=?,author_name =?,price=?";
		try(PreparedStatement updateStatement=connection.prepareStatement(sql) ){
			updateStatement.setInt(1, book.getBook_id());
			updateStatement.setString(2, book.getSubject_name());
			updateStatement.setString(3, book.getBook_name());
			updateStatement.setString(4, book.getAuthor_name());
			updateStatement.setFloat(5, book.getPrice());
			return updateStatement.executeUpdate();
		}
		
		
	}
	public int delete(int book_id)throws Exception
	{
		// book_id | subject_name | book_name             | author_name    | price
		String sql="DELETE FROM books33 WHERE book_id=?";
		try(PreparedStatement updateStatement=connection.prepareStatement(sql) ){
			updateStatement.setInt(1, book_id);
			
			return updateStatement.executeUpdate();
		}
		
		
	}
	public Book getBook(int book_id)throws Exception
	{
		// book_id | subject_name | book_name             | author_name    | price
		String sql="SELECT  book_id,subject_name,book_name,author_name,price FROM books33 WHERE book_id=?";
		Book book=null;
		try(PreparedStatement SelectStatement=connection.prepareStatement(sql) ){
			SelectStatement.setInt(1, book_id);
			
			
			try(ResultSet rst=	SelectStatement.executeQuery()){
				if(rst.next())
				{
					book = new Book(rst.getInt("book_id"),rst.getString("subject_name"),rst.getString("book_name"),rst.getString("author_name"),rst.getFloat("price"));
				}
			}
			
			return book;
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public List<String> getSubject_name() throws SQLException {
		String sql="SELECT DISTINCT subject_name from books33";
		try(PreparedStatement pst1=connection.prepareStatement(sql) ){
		List<String> subject_name=new ArrayList<>();
		try(ResultSet rst=pst1.executeQuery()){
			while(rst.next())
			{
				subject_name.add(rst.getString(1));
			}
				
			
		}	
		return subject_name;
}
	}
	public List<Book> getBooks(String subject_name) throws SQLException {
	    String sql = "SELECT * FROM books33 WHERE subject_name = ?";
	    List<Book> books = new ArrayList<>();

	    try (PreparedStatement pst1 = connection.prepareStatement(sql)) {
	        pst1.setString(1, subject_name);

	        try (ResultSet rst = pst1.executeQuery()) {
	            while (rst.next()) {
	                Book book = new Book(
	                        rst.getInt("book_id"),
	                        rst.getString("subject_name"),
	                        rst.getString("book_name"),
	                        rst.getString("author_name"),
	                        rst.getFloat("price")
	                );
	                books.add(book);
	            }
	        }
	    }

	    return books;
	}
}




     
            

           
             
	

	
	




	

	
		
		
	
	
		
		
	
		
	
	
	
		
	

	
	
	
