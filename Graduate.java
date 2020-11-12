package teachingassistant;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
	    // 成员变量
		String name;
		String sex;
		int age;
		double fee;
		double pay;
		
		// 实现接口中的抽象方法
		@Override
		public void setPay(double pay) {
			this.pay = pay * 12;
			System.out.println("你的年收入为：" + this.pay);
		}
		
		@Override
		public void getPay(double pay) {
			this.pay = pay * 12;
			System.out.println("你的年收入为：" + this.pay);
		}
		
		@Override
		public void setFee(double fee) {
			this.fee = fee;
			System.out.println("你一年的学费为：" + this.fee);
		}

		@Override
		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("你一年的学费为：" + this.fee);
		}
		
		//判断缴费情况
		public boolean Loan(){
			if ((this.pay - this.fee)<3000) {
				System.out.println("减去学费：" + this.fee);
				System.out.println("你的实际年收入为：" + (this.pay - this.fee));
				return true;
			}else {
			    System.out.println("应缴纳税额："+this.pay*0.03+"  减去学费：" + this.fee );
			    System.out.println("你的实际年收入为：" + (this.pay - this.fee));
			return false;
		}
	}
		
		public static void main(String[] args) {
			// 创建对象
			Graduate graduate1 = new Graduate();
			Graduate graduate2 = new Graduate();
			// 对象的初始化
			graduate1.name = "李明";
			graduate1.age = 24;
			graduate1.sex = "男";
			
			graduate2.name = "珍妮";
			graduate2.age = 25;
			graduate2.sex = "女";
			
			System.out.println("姓名:" + graduate1.name+"   年龄："+graduate1.age+"岁"+"    性别："+graduate1.sex);
			
			// 设置学费
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你一年的学费：");
			
			double fee = scanner.nextDouble();
			graduate1.setFee(fee);
			
			// 异常处理
			try {
				System.out.println("请输入你的月工资：");
				double pay = scanner.nextDouble();
				graduate1.setPay(pay);
				if(pay<0) {
					System.out.println("工资不能为负数！");
				}
			}catch(Exception e) {
				
			}
			boolean flag = graduate1.Loan();
			if (flag) {
				System.out.println("不能缴纳学费！");
			}else {
				System.out.println("OK！");
			}
			
			System.out.println();
			System.out.println("姓名:" + graduate2.name+"   年龄："+graduate2.age+"岁"+"    性别："+graduate2.sex);
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("请输入你的学费：");
			
			double fee1 = scanner1.nextDouble();
			graduate1.setFee(fee1);
			
			// 异常处理
			try {
				System.out.println("请输入你的月工资：");
				double pay = scanner.nextDouble();
				graduate1.setPay(pay);
				if(pay<0) {
					System.out.println("工资不能为负数！");
				}
			}catch(Exception e) {
				
			}
			boolean flag1 = graduate1.Loan();
			if (flag1) {
				System.out.println("不能缴纳学费！");
			}else {
				System.out.println("OK！");
			}
		}
}
