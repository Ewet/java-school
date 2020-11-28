package demo1;
public class Person {
	String name;
	char sex;
	int age;

	Person(String s) {
		this.name = s;
	}
	Person(String s, char c) {
		this(s);
		this.sex = c;
	}
	Person(String s, char c, int i) {
		this(s, c);
		this.age = i;
	}
	
	public String toString() {
		return "姓名：" + this.name + "\t性别：" + this.sex + "\t\t年龄：" + this.age;
	}
}

class Student extends Person {
	long number;
	double phi;
	double eng;
	double comp;

	Student(long n, double p, double e, double m, String s, char c, int i) {
		super(s, c, i);
		this.number = n;
		this.phi = p;
		this.eng = e;
		this.comp = m;
	}
	
	private double max() {
		double max;
		if (phi > eng) {
			max = phi;
		} else {
			max = eng;
		}
		if (max > comp) {
			return max;
		} else {
			return comp;
		}
	}

	public String toString() {
		return "学号：" + this.number + "\t" + super.toString() + "\t\t最高分：" + this.max();
	}

	//操作输出
	public static void main(String[] args) {
		Student stu = new Student(20551121010L, 88.0, 95.0, 93.5, "陈元庭", '男', 26);
		System.out.println(stu.toString()); // 可以通过类名的方式调用实例方法
	}

}
