package demo1;

public class Employee {
	String name;
	String department;
	double salary;
//	Employee() {};
	public Employee(String n, String dep, double sl) {
		name = n;
		department = dep;
		salary = sl;
	}

	void setName(String n) {
		name = n;
	}

	String getName() {
		return name;
	}

	void setDepartment(String dep) {
		department = dep;
	}

	String getDepartment() {
		return department;
	}

	void setSalary(double sl) {
		salary = sl;
	}

	double getSalary() {
		return salary;
	}

	static double raiseSalary(double sl, double p) {
		double raise = sl * p / 100;
		return sl + raise;
	}

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new Employee("����", "������", 5000);
		arr[1] = new Employee("����", "������", 3800);
		arr[2] = new Employee("����", "������", 6800);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("������" + arr[i].name + "\t" + 
							   "���ţ�" + arr[i].department + "\t" + 
							   "���ʣ�" + arr[i].salary);
		}
		System.out.println("**************��н7%*****************");
		for (int i = 0; i < arr.length; i++) {
			arr[i].salary = raiseSalary(arr[i].salary, 7);
			System.out.println("������" + arr[i].name + "\t" + 
							   "���ţ�" + arr[i].department + "\t" + 
							   "���ʣ�" + arr[i].salary);
		}
	}
}
