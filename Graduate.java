package teachingassistant;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
	    // ��Ա����
		String name;
		String sex;
		int age;
		double fee;
		double pay;
		
		// ʵ�ֽӿ��еĳ��󷽷�
		@Override
		public void setPay(double pay) {
			this.pay = pay * 12;
			System.out.println("���������Ϊ��" + this.pay);
		}
		
		@Override
		public void getPay(double pay) {
			this.pay = pay * 12;
			System.out.println("���������Ϊ��" + this.pay);
		}
		
		@Override
		public void setFee(double fee) {
			this.fee = fee;
			System.out.println("��һ���ѧ��Ϊ��" + this.fee);
		}

		@Override
		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("��һ���ѧ��Ϊ��" + this.fee);
		}
		
		//�жϽɷ����
		public boolean Loan(){
			if ((this.pay - this.fee)<3000) {
				System.out.println("��ȥѧ�ѣ�" + this.fee);
				System.out.println("���ʵ��������Ϊ��" + (this.pay - this.fee));
				return true;
			}else {
			    System.out.println("Ӧ����˰�"+this.pay*0.03+"  ��ȥѧ�ѣ�" + this.fee );
			    System.out.println("���ʵ��������Ϊ��" + (this.pay - this.fee));
			return false;
		}
	}
		
		public static void main(String[] args) {
			// ��������
			Graduate graduate1 = new Graduate();
			Graduate graduate2 = new Graduate();
			// ����ĳ�ʼ��
			graduate1.name = "����";
			graduate1.age = 24;
			graduate1.sex = "��";
			
			graduate2.name = "����";
			graduate2.age = 25;
			graduate2.sex = "Ů";
			
			System.out.println("����:" + graduate1.name+"   ���䣺"+graduate1.age+"��"+"    �Ա�"+graduate1.sex);
			
			// ����ѧ��
			Scanner scanner = new Scanner(System.in);
			System.out.println("��������һ���ѧ�ѣ�");
			
			double fee = scanner.nextDouble();
			graduate1.setFee(fee);
			
			// �쳣����
			try {
				System.out.println("����������¹��ʣ�");
				double pay = scanner.nextDouble();
				graduate1.setPay(pay);
				if(pay<0) {
					System.out.println("���ʲ���Ϊ������");
				}
			}catch(Exception e) {
				
			}
			boolean flag = graduate1.Loan();
			if (flag) {
				System.out.println("���ܽ���ѧ�ѣ�");
			}else {
				System.out.println("OK��");
			}
			
			System.out.println();
			System.out.println("����:" + graduate2.name+"   ���䣺"+graduate2.age+"��"+"    �Ա�"+graduate2.sex);
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("���������ѧ�ѣ�");
			
			double fee1 = scanner1.nextDouble();
			graduate1.setFee(fee1);
			
			// �쳣����
			try {
				System.out.println("����������¹��ʣ�");
				double pay = scanner.nextDouble();
				graduate1.setPay(pay);
				if(pay<0) {
					System.out.println("���ʲ���Ϊ������");
				}
			}catch(Exception e) {
				
			}
			boolean flag1 = graduate1.Loan();
			if (flag1) {
				System.out.println("���ܽ���ѧ�ѣ�");
			}else {
				System.out.println("OK��");
			}
		}
}
