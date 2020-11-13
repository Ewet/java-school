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

	// 存款
	public void deposit(double money) {
		this.balance = money;
	}

	// 查询余额
	public double check() {
		return this.balance;
	}

	// 取款
	public void draw() {
		System.out.print("请输入取款金额:");
		double money = scanner.nextDouble();
		double num = this.balance - money;
		if (num > 0) {
			System.out.println("取款成功，剩下余额为：" + num);
		} else {
			System.out.println("取款失败，余额不足，您的余额为：" + this.balance);
		}
		this.reStart();
	}

	// 查询余额
	public void reStart() {
		System.out.println("是否需要重新取款？(y/n)");
		String isClose = scanner.next();
		if (isClose.equals("y")) {
			this.draw();
		} else if (isClose.equals("n")) {
			System.out.print("程序结束。");
		} else {
			System.out.print("输入错误，");
			this.reStart();
		}
	}
}

class TestAccount {
	// 创建自己的账号
	static Account myAccount = new Account("20551121010", "chenyuanting", "123456", 10000);

	// 输入取款金额，返回取款结果和显示余额
	public static void main(String[] args) {
		System.out.println("账号：" + myAccount.AccountNum + "\t" + "名称：" + myAccount.name + "\t" + "密码："
				+ myAccount.password + "\t" + "余额：" + myAccount.balance + "\n");

		myAccount.draw();
	}
}
