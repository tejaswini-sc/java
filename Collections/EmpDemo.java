package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class Empp implements Comparable<Empp>{
	int id;
	String name;
	
	public Empp(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Empp)) {
			return false;
		}
		Empp other = (Empp) obj;
		return  this.id==other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public int compareTo(Empp o) {
//		// TODO Auto-generated method stub
		if(this.id==o.id)
			return this.name.compareTo(o.name);
		return Integer.compare(this.id,o.id);
	}
	
	
}
public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Empp> set=new HashSet<>();
		set.add(new Empp(1, "teju"));
		set.add(new Empp(5, "swapna"));
		set.add(new Empp(5, "kursii"));
		set.add(new Empp(5, "kursii"));
		set.add(new Empp(6,"swapna"));
		set.add(new Empp(6,"swapn"));
		set.add(new Empp(6,"swapna"));
		
		
		ArrayList<Empp> al= new ArrayList<>(set); 
		
		Collections.sort(al);
		
		System.out.println(set);
		System.out.println(al);

	}

}
