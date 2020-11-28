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
		return "������" + this.name + "\t�Ա�" + this.sex + "\t\t���䣺" + this.age;
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
		return "ѧ�ţ�" + this.number + "\t" + super.toString() + "\t\t��߷֣�" + this.max();
	}

	//�������
	public static void main(String[] args) {
		Student stu = new Student(20551121010L, 88.0, 95.0, 93.5, "��Ԫͥ", '��', 26);
		System.out.println(stu.toString()); // ����ͨ�������ķ�ʽ����ʵ������
	}

}
