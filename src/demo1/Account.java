package demo1;

import java.util.Scanner;

public class Account {
	Scanner scanner = new Scanner(System.in);
	String AccountNum;
	String name;
	String password;
	double balance;
	public Account() {};

	public Account(String a, String n, String p, double b) {
		this.AccountNum = a;
		this.name = n;
		this.password = p;
		this.balance = b;
	};

	// ���
	public void deposit(double money) {
		this.balance = money;
	}

	// ��ѯ���
	public double check() {
		return this.balance;
	}

	// ȡ��
	public void draw() {
		System.out.print("������ȡ����:");
		double money = scanner.nextDouble();
		double num = this.balance - money;
		if (num > 0) {
			System.out.println("ȡ��ɹ���ʣ�����Ϊ��" + num);
		} else {
			System.out.println("ȡ��ʧ�ܣ����㣬�������Ϊ��" + this.balance);
		}
		this.reStart();
	}

	// ��ѯ���
	public void reStart() {
		System.out.println("�Ƿ���Ҫ����ȡ�(y/n)");
		String isClose = scanner.next();
		if (isClose.equals("y")) {
			this.draw();
		} else if (isClose.equals("n")) {
			System.out.print("���������");
		} else {
			System.out.print("�������");
			this.reStart();
		}
	}
}

class TestAccount {
	// �����Լ����˺�
	static Account myAccount = new Account("20551121010", "chenyuanting", "123456", 10000);

	// ����ȡ�������ȡ��������ʾ���
	public static void main(String[] args) {
		System.out.println("�˺ţ�" + myAccount.AccountNum + "\t" + "���ƣ�" + myAccount.name + "\t" + "���룺"
				+ myAccount.password + "\t" + "��" + myAccount.balance + "\n");

		myAccount.draw();
	}
}
