package shoppingcart;

import java.util.Scanner;

import shoppingcart.ShoppingCart;

import shoppingcart.GoodsManage;
public class TestDemo {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// ��������������������ʵ��

		TestDemo one = new TestDemo();
		one.menu();
	
		

	}

		
		public void menu() {
			GoodsManage gm = new GoodsManage();
			ShoppingCart cart = new ShoppingCart();
			boolean flag1= true;// ����һ���жϣ������������Ӧ������Ļ�

	
			//�˵�ѭ��
			while (flag1) {
			show1();// ���õ�ǰ���show1()����	

			int input1 = sc.nextInt();
			switch (input1) {
			case 1:
			
			boolean flag2 = true;

			while (flag2) {
			show2();// ���õ�ǰ���show2()����
			int input2 = sc.nextInt();
			switch (input2) {
		
				case 1:
				System.out.println("��Ʒ��Ϣ����");
				gm.importGoods();

				break;
				case 2:
				System.out.println("��ʾ������Ʒ��Ϣ");
				gm.displayAllGoods();
				break;
				case 9:
				flag2 = false;
				}
			}	
			break;//������һ���˵�
			
			
			case 2:
			boolean flag3 = true;
			while (flag3) {
			show3();// ���õ�ǰ���show3()����
			int input3 = sc.nextInt();
			switch (input3) {
			
				case 1:
				System.out.println("�����Ʒ�����ﳵ");
				gm.importGoods();
				gm.displayAllGoods();
		        cart.addGoodsToCart(gm);
			
				break;
				case 2:
				System.out.println("�޸Ĺ��ﳵ�е���Ʒ����");
				cart.updateNumInCart();
				
				break;
				case 3:
				System.out.println("��ʾ���ﳵ�е�������Ʒ��Ϣ");
				cart.displayAllInCart();
				
				break;
				case 4:
				System.out.println("����");
				cart.settleAccounts();
				
				break;
				case 9:
				flag3 = false;
				}
			}
			break;
			
			//�˳�
			
			case 0:
			flag1 = false;
			break;
			}
	
			}
			
			sc.close();//�ڳ������ʱ�������������ͷ��ڴ档
	}
	
	



	void show1() {
		System.out.println("**********************************");
		System.out.println("           **���˵�**               ");
		System.out.println("           1--��Ʒ����                                        ");
		System.out.println("           2--���ﳵ                                            ");
		System.out.println("           0--�˳�                                                ");
		System.out.println("**********************************");	
		System.out.println("�������Ӧ���ֽ��в�����");			
	}
	void show2() {
		System.out.println("**********************************");
		System.out.println("           **��Ʒ����**             ");
		System.out.println("           1--��Ʒ��Ϣ����                               ");
		System.out.println("           2--��ʾ������Ʒ��Ϣ                        ");
		System.out.println("           9--������һ���˵�                            ");
		System.out.println("**********************************");	
		System.out.println("�������Ӧ���ֶ���Ʒ���й���");		
	}
	void show3() {
		System.out.println("**********************************");
		System.out.println("           **���ﳵ����**            ");
		System.out.println("           1--�����Ʒ�����ﳵ                         ");
		System.out.println("           2--�޸Ĺ��ﳵ�е���Ʒ����              ");
		System.out.println("           3--��ʾ���ﳵ�е�������Ʒ��Ϣ      ");
		System.out.println("           4--����                                                ");		
		System.out.println("           9--������һ���˵�                             ");
		System.out.println("**********************************");			
	}
	


}
