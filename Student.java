package Lab_Session_21st_July;

public class Student {
	//Instance variable
	int studentNo;
	int fees;
	String studentName;
	String mailId;
	String address;
	
	
	public Student(int studentNo, String studentName, String mailId, String address) {  // Creating parameterized constructor
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.mailId = mailId;
		this.address = address;
	}
	
	void fees(int fees) {
		 if(fees < 2000) {
			this.fees = (int) (fees + fees * 0.1); // if student fees is less 2000 then this will calculate fees by this formula
			 
		 }
		 else {
			 this.fees = fees;
		 }
	}
	
	void display() {  // this method will display the details of student
		
		System.out.println("Student [studentNo=" + studentNo + ", fees=" + fees + ", studentName=" + studentName + ", mailId="
				+ mailId + ", address=" + address + "]");
	}


}

class TestMain {
	public static void main(String[] args) {
		Student ss[] = new Student[5];
		ss[0] = new Student(101, "Student1", "1@gmail.com", "Unknown Place1");
		ss[1] = new Student(102, "Student2", "2@gmail.com", "Unknown Place2");
		ss[2] = new Student(103, "Student3", "3@gmail.com", "Unknown Place3");
		ss[3] = new Student(104, "Student4", "4@gmail.com", "Unknown Place4");
		ss[4] = new Student(105, "Student5", "5@gmail.com", "Unknown Place5");
		
		ss[0].fees(1300);
		ss[1].fees(2300);
		ss[2].fees(1400);
		ss[3].fees(2400);
		ss[4].fees(1500);
		
		for(int i=0; i<ss.length; i++) {  // for loop to print all the student details including updated fees
			ss[i].display();
			}
		

		
		
	}
}
