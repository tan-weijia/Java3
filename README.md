# Java3
实验四
计G202--2020322101
#阅读程序
##实验目的
```
1.掌握Java中抽象类和抽象方法的定义； 
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；
3.了解异常的使用方法，并在程序中根据输入情况做异常处理。
```
##实验要求
```
1.在博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。
```
##实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
+ 设计两个管理接口：学生管理接口（StudentInterface）和教师管理接口（TeacherInterface）。
  学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
+ 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
+ 编写测试类，并实例化两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。
##核心代码
1.学生管理接口
```
public interface StudentInterface {
	    // 设置学生的学费
		public abstract void setFee(double fee);
		
		// 获取学生的学费
		public abstract void getFee(double fee);

}
```
2.教师管理接口
```
public interface TeacherInterface {
	    // 设置教师的工资
		public abstract void setPay(double pay);
		
		// 获取教师的工资
		public abstract void getPay(double pay);
}
```
3.参数args一次性赋值
 ```
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
 ```
4.Scanner类交互式输入
```
// 设置学费
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你一年的学费：");
			
			double fee = scanner.nextDouble();
			graduate1.setFee(fee);
```
5.异常处理
```
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
```
##实验结果
```
![image](https://github.com/tan-weijia/Java3/blob/main/yunxingjieguo.png)
```
##实验感想
```
本次实验掌握了抽象类和抽象方法的定义，接口的定义形式以及接口的实现方法，同时也尝试做了异常处理。实验过程中遇到很多难题，
但老师的帮助中和与同学的探讨中问题都一一解决了，这次实验收获很多，接下来的学习会更加努力。
```
待完善...
