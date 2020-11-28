package demo1;
import java.util.*;
public abstract class Employees { // ���������
	String number;
	String name;
	double baseS = 3000;
	double salary;

	public Employees() {}
	public Employees(String num, String n) {
		this.number = num;
		this.name = n;
	}
	public abstract void setSubsidy();
	public abstract double getSalary();
}

class Worker extends Employees { // ��д���๹����
	public Worker() {}
	public Worker(String num, String n) {
		super(num, n);
	}
	public void setSubsidy() {
//		��ͨԱ������������+ס������(�������ʵ�0.1��)+��ͨ����(�������ʵ�0.2��)+ҽ�Ʋ���(300Ԫ)��
		super.salary = super.baseS + super.baseS * 0.1 + super.baseS * 0.2 + 300; //super=this
	};
	public double getSalary() {
		return this.salary;
	}
}

class Manager extends Employees { // ��д���๹����
	public Manager() {}
	public Manager(String num, String n) {
		super(num, n);
	}
	public void setSubsidy() {
//		������������+ס������(�������ʵ�0.2��)+��ͨ����(�������ʵ�0.2��)+ҽ�Ʋ���(1000Ԫ)+�����(2000Ԫ)
		this.salary = this.baseS + this.baseS * 0.2 + this.baseS * 0.2 + 1000 + 2000;
	};
	public double getSalary() {
		return this.salary;
	}
}

class TestEmp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ա�����ͣ�����ͨԱ��Ϊ1������Ϊ2��");
		if(scanner.hasNextInt()) {
			int input = scanner.nextInt();
			System.out.println("*********************************************************");
			if (input != 1 && input != 2) {
				System.out.println("��������");
			} else if (input == 1) {
				Worker w = new Worker("012345678901", "���"); // ������ͨԱ������
				w.setSubsidy();
				System.out.print("Ա����ţ�" + w.number + "(ѧ��)\t");
				System.out.println("Ա��������" + w.name + "(Ա��)");
				System.out.println("\t��Ա���Ĺ����ǣ�" + w.getSalary());
			} else if (input == 2) {
				Manager m = new Manager("012345678901", "���"); // ������ͨԱ������
				m.setSubsidy();
				System.out.print("Ա����ţ�" + m.number + "(ѧ��)\t");
				System.out.println("Ա��������" + m.name + "(����)");
				System.out.println("\t��Ա���Ĺ����ǣ�" + m.getSalary());
			}
			System.out.println("*********************************************************");
		} else {
			System.out.println("���������֣�");
		}
	}
}
