package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		return -1*Integer.valueOf(this.id).compareTo(o.id);
//	}

//	@Override
//	public int compareTo(Product o) {
//
//		return this.name.compareTo(o.name);
//	}
	
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.valueOf(this.price).compareTo(o.price);
	}
	
}

public class ProductDemo {

	public static void main(String[] args) {

		ArrayList<Product> al =new ArrayList<>();
		al.add(new Product(2, "millk", 24));
		al.add(new Product(11, "egg", 6));
		al.add(new Product(1, "bread", 30));
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}
