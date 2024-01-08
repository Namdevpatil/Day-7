package day7;

//step-1: the class should implements Cloneable interface
public class Patient implements Cloneable
{
	
	private int patientId;
	private String patientName;
	private String patientProblem;
	private String patientAddress; 
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, String patientName, String patientProblem, String patientAddress) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientProblem = patientProblem;
		this.patientAddress = patientAddress;
	}

	@Override
	public String toString() 
	{
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientProblem=" + patientProblem
				+ ", patientAddress=" + patientAddress + "]";
	}
	
	//step3: declare 
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		//general way of creating an object, using 'new' keyword
		Patient patient1 = new Patient(190, "ABC", "Kidney Problem", "Hyderabad");
		System.out.println(patient1.toString());
		
		System.out.println(patient1.hashCode());
		System.out.println("----------------cloning-------------------");
		
		//step-2: call clone() method of Object class
		Patient patient2 = (Patient) patient1.clone();//creating an object
		System.out.println(patient2.toString());
		System.out.println(patient2.hashCode());
		
	}
	
	
}
