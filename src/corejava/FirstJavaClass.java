package corejava;

public class FirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.name = "swapnil";
		System.out.println(std1.name);
		std1.attendSession();
		
		Student std2 = new Student();
		std2.name = "abhishek";
		System.out.println(std2.name);
		std2.attendSession();	
	}

}


class Student{
	String name;
	int rollNo;
	String course;
	
	void attendSession(){
		System.out.println("attent session method called");
	
	}
	void leaveSession() {
		
	}
	void askquestion() {
		
	}
}

