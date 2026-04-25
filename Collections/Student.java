package Collections;

import java.awt.geom.FlatteningPathIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Students implements Comparable<Students>{
	private int id;
	private String name;
	private float marks;
	public Students(int id,String name,float marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
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
	 * @return the marks
	 */
	public float getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
//	@Override
//	public int compareTo(Students e2) {
//		Students e1= this;
//		Integer id1= e1.id ;
//		Integer id2 = e2.id;
//		return id1.compareTo(id2);		
//	}
	
//	@Override
//	public int compareTo(Students e2) {
//		// TODO Auto-generated method stub
//		Students s1= this;
//		String name1=s1.name;
//		String name2=e2.name;
//		
//		return name1.compareTo(name2);
//	}
	
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub		
		return -1*Float.valueOf(this.marks).compareTo(o.marks);
	}

	
	
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students(10, "teju", 96.3f); 
		Students s2=new Students(25, "Swapna", 99.3f); 
		Students s3=new Students(3, "Kursii", 100f); 
		ArrayList<Students> al= new ArrayList<Students>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
