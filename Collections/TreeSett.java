
package Collections;

import java.util.Objects;

class Stud{
	int id;
	String name;
	public Stud(int id, String name) {
		super();
		this.id = id;
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
		if (!(obj instanceof Stud)) {
			return false;
		}
		Stud other = (Stud) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	
	
}
public class TreeSett {
	public static void main(String[] args) {
		Stud s1=new Stud(1, "teju");
		Stud s2=new Stud(1, "teju");
		
//		String n1="teju";
//		String n2 ="teju";
//		System.out.println(n1.equals(n2));
		System.out.println(s1.equals(s2));
	}
}
