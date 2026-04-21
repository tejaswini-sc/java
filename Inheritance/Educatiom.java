package Inheritance;

class EducationInstitue
{
	void admitStud()
	{
		System.out.println("student admitted");
	}
	
	void conductExam() {
		System.out.println("conduct Exam");
	}
}

class School extends EducationInstitue
{
	@Override
	void conductExam() {
		System.out.println("school exam");
	}
	
	void ConductFieldTrip() {
		System.out.println(" school field trip");
	}
}

class Collage extends EducationInstitue{
	
	@Override
	void conductExam() {
		System.out.println("clg Exam");	
	}
	
	void conductInternship() {
		System.out.println(" clg internship");
	}
}

class University extends EducationInstitue{
	
	@Override
	void conductExam() {
		System.out.println("university Exam");	
	}
	
	void ConductResearch() {
		System.out.println(" university research");
	}
}

public class Educatiom {

	public static void main(String[] args) {
		EducationInstitue e = new EducationInstitue();
		System.out.println("education class");
		e.admitStud();
		e.conductExam();
		System.out.println();
		
		System.out.println("School class");
		School s = new School();
		s.conductExam();
		s.ConductFieldTrip();
		System.out.println();

		System.out.println("Clg class");
		Collage c = new Collage();
		c.conductExam();
		c.conductInternship();
		System.out.println();
		
		System.out.println("University class");
		University u = new University();	
		u.conductExam();
		u.ConductResearch();		
		
	}


}
