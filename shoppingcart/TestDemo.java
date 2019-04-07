package shoppingcart;

import java.util.Scanner;

import shoppingcart.ShoppingCart;

import shoppingcart.GoodsManage;
public class TestDemo {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 根据需求设计完成主流程实现

		TestDemo one = new TestDemo();
		one.menu();
	
		

	}

		
		public void menu() {
			GoodsManage gm = new GoodsManage();
			ShoppingCart cart = new ShoppingCart();
			boolean flag1= true;// 进行一个判断，如果有输入相应的数组的话

	
			//菜单循环
			while (flag1) {
			show1();// 调用当前类的show1()方法	

			int input1 = sc.nextInt();
			switch (input1) {
			case 1:
			
			boolean flag2 = true;

			while (flag2) {
			show2();// 调用当前类的show2()方法
			int input2 = sc.nextInt();
			switch (input2) {
		
				case 1:
				System.out.println("商品信息导入");
				gm.importGoods();

				break;
				case 2:
				System.out.println("显示所有商品信息");
				gm.displayAllGoods();
				break;
				case 9:
				flag2 = false;
				}
			}	
			break;//返回上一级菜单
			
			
			case 2:
			boolean flag3 = true;
			while (flag3) {
			show3();// 调用当前类的show3()方法
			int input3 = sc.nextInt();
			switch (input3) {
			
				case 1:
				System.out.println("添加商品到购物车");
				gm.importGoods();
				gm.displayAllGoods();
		        cart.addGoodsToCart(gm);
			
				break;
				case 2:
				System.out.println("修改购物车中的商品数量");
				cart.updateNumInCart();
				
				break;
				case 3:
				System.out.println("显示购物车中的所有商品信息");
				cart.displayAllInCart();
				
				break;
				case 4:
				System.out.println("结算");
				cart.settleAccounts();
				
				break;
				case 9:
				flag3 = false;
				}
			}
			break;
			
			//退出
			
			case 0:
			flag1 = false;
			break;
			}
	
			}
			
			sc.close();//在程序结束时结束输入流，释放内存。
	}
	
	



	void show1() {
		System.out.println("**********************************");
		System.out.println("           **主菜单**               ");
		System.out.println("           1--商品管理                                        ");
		System.out.println("           2--购物车                                            ");
		System.out.println("           0--退出                                                ");
		System.out.println("**********************************");	
		System.out.println("请输入对应数字进行操作：");			
	}
	void show2() {
		System.out.println("**********************************");
		System.out.println("           **商品管理**             ");
		System.out.println("           1--商品信息导入                               ");
		System.out.println("           2--显示所有商品信息                        ");
		System.out.println("           9--返回上一级菜单                            ");
		System.out.println("**********************************");	
		System.out.println("请输入对应数字对商品进行管理：");		
	}
	void show3() {
		System.out.println("**********************************");
		System.out.println("           **购物车管理**            ");
		System.out.println("           1--添加商品到购物车                         ");
		System.out.println("           2--修改购物车中的商品数量              ");
		System.out.println("           3--显示购物车中的所有商品信息      ");
		System.out.println("           4--结算                                                ");		
		System.out.println("           9--返回上一级菜单                             ");
		System.out.println("**********************************");			
	}
	


}
