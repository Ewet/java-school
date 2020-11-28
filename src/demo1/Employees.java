package demo1;
import java.util.*;
public abstract class Employees { // 定义抽象类
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

class Worker extends Employees { // 重写父类构造器
	public Worker() {}
	public Worker(String num, String n) {
		super(num, n);
	}
	public void setSubsidy() {
//		普通员工：基本工资+住房补贴(基本工资的0.1倍)+交通补贴(基本工资的0.2倍)+医疗补贴(300元)；
		super.salary = super.baseS + super.baseS * 0.1 + super.baseS * 0.2 + 300; //super=this
	};
	public double getSalary() {
		return this.salary;
	}
}

class Manager extends Employees { // 重写父类构造器
	public Manager() {}
	public Manager(String num, String n) {
		super(num, n);
	}
	public void setSubsidy() {
//		经理：基本工资+住房补贴(基本工资的0.2倍)+交通补贴(基本工资的0.2倍)+医疗补贴(1000元)+出差补贴(2000元)
		this.salary = this.baseS + this.baseS * 0.2 + this.baseS * 0.2 + 1000 + 2000;
	};
	public double getSalary() {
		return this.salary;
	}
}

class TestEmp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入员工类型：（普通员工为1，经理为2）");
		if(scanner.hasNextInt()) {
			int input = scanner.nextInt();
			System.out.println("*********************************************************");
			if (input != 1 && input != 2) {
				System.out.println("输入有误！");
			} else if (input == 1) {
				Worker w = new Worker("012345678901", "黄睿"); // 创建普通员工对象
				w.setSubsidy();
				System.out.print("员工编号：" + w.number + "(学号)\t");
				System.out.println("员工姓名：" + w.name + "(员工)");
				System.out.println("\t该员工的工资是：" + w.getSalary());
			} else if (input == 2) {
				Manager m = new Manager("012345678901", "黄睿"); // 创建普通员工对象
				m.setSubsidy();
				System.out.print("员工编号：" + m.number + "(学号)\t");
				System.out.println("员工姓名：" + m.name + "(经理)");
				System.out.println("\t该员工的工资是：" + m.getSalary());
			}
			System.out.println("*********************************************************");
		} else {
			System.out.println("请输入数字！");
		}
	}
}
