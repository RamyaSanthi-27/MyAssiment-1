package week1.day1;

public class Student {
	public void studentName() {
		String studentName = "Ramya";
		System.out.println("Student Name ="+studentName);
		}
	
	public void rollNo() {
		int rollNo =56488;
		System.out.println("Roll No="+rollNo);		
	}
	
	public void collegeName() {
		String collegeName ="RREC";
		System.out.println("Collage Name="+collegeName);
	}
	
	public void markScored(int a, int b, int c, int d, int e) {
		System.out.println("Marck Scored");
		int markScoreda =85;
		System.out.println("a="+markScoreda);
		int markScoredb =88;
		System.out.println("b="+markScoredb);
		int markScoredc =92;
		System.out.println("c="+markScoredc);
		int markScoredd =96;
		System.out.println("d="+markScoredd);
		int markScorede =87;
		System.out.println("e="+markScorede);
	}
	
	public void cgpa() {
		float cgpa =8.5f;
		System.out.println("CGPA="+cgpa);
	}
	
	public static void main(String[] args) {
		Student obj =new Student();
		obj.studentName();
		obj.rollNo();
		obj.collegeName();
		obj.markScored(85, 88, 92, 96, 87);
		obj.cgpa();
	
	}
	
}
