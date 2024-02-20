package sunbeam.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CartBean {
	
	private String[]book_id;
	private List<Integer>cart;
	
	public CartBean()
	{
		this.book_id=new String[0];
		this.cart=new ArrayList<Integer>();
	}

	public String[] getBook_id() {
		return book_id;
	}

	public void setBook_id(String[] book_id) {
		this.book_id = book_id;
	}

	public List<Integer> getCart() {
		return cart;
	}

	public void setCart(List<Integer> cart) {
		this.cart = cart;
	}
	
	public void addCart()
	{
		for (int i = 0; i < book_id.length; i++) {
			int id=Integer.parseInt(book_id[i]);
			System.out.println("addcart id = "+id);
			if(cart!=null)
			cart.add(id);
			
		
		}
	
		
	
	}
}
		

