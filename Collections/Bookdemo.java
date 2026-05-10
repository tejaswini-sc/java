package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>{
	
	int bid;
	String title;
	public Book(int bid, String title) {
		super();
		this.bid = bid;
		this.title = title;
	}
	/**
	 * @return the bid
	 */
	public int getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + "]";
	}
	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.title);
	}
	
	
}

public class Bookdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> al =new ArrayList<Book>();
		al.add(new Book(5, "automic habits"));
		al.add(new Book(5, "java"));
		al.add(new Book(23, "aaaa"));
		
	}

}
