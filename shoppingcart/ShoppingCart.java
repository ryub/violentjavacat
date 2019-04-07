package shoppingcart;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ShoppingCart{
	//购物车
	public Map<String, GoodsInCart> shoppingCart = new HashMap<String, GoodsInCart>();
	Scanner console=new Scanner(System.in);
	public Map<String,GoodsInCart> goodsInCartMap=new HashMap<String,GoodsInCart>();
	//无参构造方法
	public ShoppingCart() {

	}
	//有参构造方法
	public ShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	//get/set
	public Map<String, GoodsInCart> getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	
	//方法
	//添加商品到购物车：
	public void addGoodsToCart(GoodsManage gm) {
		
		
		 //gm.getGoodsSet()调用返回的是goodsSet，也就是一个存放Goods的Set集合，
		//然后在调用isEmpty()方法返回的是一个boolean的值来判断集合是否为空；如果为空return,结束该程序。
		        if (gm.getGoodsSet().isEmpty()) {
		            System.out.println("还没有商品，记得导入商品信息哟！");
		            return;
		        }
		        System.out.println("请输入要添加商品的编号");
		        String goodsId =null;
		        //gm.getGoodsSet()调用返回的是goodsSet，也就是一个存放Goods的Set集合，
		        //因为是存放Goods的集合 所以泛型是Goods，然后用迭代器遍历集合。
		        Iterator<Goods> it = gm.getGoodsSet().iterator();
		        //定义一个Goods类型的g,并且赋值为空，用来存放用迭代器遍历出的值。
		        //定义一个boolean类型的变量并且赋值为true,用来控制循环；
		        Goods goods = null;
		        boolean flag = true;
		        //把遍历出来的值存放到goods中，然后调用getGoodsId()方法得到goodsId的值，
		        //然后和键盘输入的值（goodsId）比较，如果相等这说输入的编号是正确的，把flag赋值为false;
		        //然后break,结束当前循环（内循环），因为flag值为false了，所以外循环也结束了
		        //如果和键盘输入的值（goodsId）比较为不相等，说明输入的编号不正确，
		        //因为flag的值为true，会执行第二个if语句,然后执行continue语句跳过当前循环进入下一个循环。
		        while (flag) {
		            goodsId = console.next();
		            while (it.hasNext()) {
		                goods = it.next();
		                if (goods.getGoodsId().equals(goodsId)) {
		                    flag = false;
		                    break;
		                }
		            }
		            if (flag == true) {
		                System.out.println("输入的商品编号不正确，请重新输入：");console.next();continue;
		            }
		        }
		        System.out.println("请输入要添加商品的数量");
		        int num = console.nextInt();
		        //在上面编号相等的情况下，说明输入的编号是对的，而对应的g,就是该编号商品的信息
		        //把g和n（购买的商品数量）用GoodsInCart的构造方法传进去，
		        //然后把编号（str）作为key值，GoodsInCart作为value值添加到map集合中
		        GoodsInCart goodsInCart = new GoodsInCart(goods, num);
		        goodsInCart.setNum(num);//n的值就是购买商品的数量，把这个值赋给num,用来下面结算方法和修改商品数量使用
		        goodsInCartMap.put(goodsId, goodsInCart);
		    
		 
		
		
		
		

//	   //  定义HashMap对象
//	   Map<String,GoodsInCart> goodsInCartMap=new HashMap<String,GoodsInCart>();
//	   System.out.println("请输入要添加的商品编号：");
//	   String goodsId=console.next();
//	   System.out.println("请输入要添加的商品数量：");
//	   int num=console.nextInt();
//	   
//	   Set<Goods> goods=gm.getGoodsSet();
//	   System.out.println("修改完毕！！！！！！！！！！");
//	   
//	   for(Goods goodi:goods){  //遍历Goods集合  找到满足对应编号的商品
//	       if(goodi.getGoodsId().equals(goodsId)){ //商品编号与输入的编号相等
//	   GoodsInCart goodsInCart=new GoodsInCart(goodi,num);
//	   goodsInCartMap.put(goodsId,goodsInCart);}
//	      }
	
	}
	
	//修改购物车中的商品数量：
	public void updateNumInCart() {
		   System.out.println("请输入要修改的商品编号：");
		   String input=console.next();
		   System.out.println("请输入新的商品数量：");
		   int num=console.nextInt();

		   Iterator<GoodsInCart> it=shoppingCart.values().iterator();
		   while(it.hasNext()){
		       GoodsInCart gCart=it.next();
		       if(gCart.getGoods().getGoodsId().equals(input)) {
		           gCart.setNum(num);
		       }
		   }	   	   
//		   if(num == 0) {
//			   //如果num为0，则删除该条商品。
//		   }
//		   console.close();//在程序结束时结束输入流，释放内存。
		   
//		Iterator<GoodsInCart> it=shoppingCart.values().iterator();
//		while(it.hasNext()){
//		GoodsInCart gCart=it.next();// 得到map集合的内容
//		    if(gCart.getGoods().getGoodsId().equals(input)){
//		        gCart.setNum(num);
//		    }
//		}
		   
		   
		   
	}
	//显示购物车中的所有商品：
	public void displayAllInCart() {
		
		 if(goodsInCartMap.isEmpty()) {
	            System.out.println("购物车是空的哟！赶快装满吧！");
	            return;
	        }
	        //显示所有商品其实就是输出goodsInCartMap集合中value的值；
	        //用goodsInCartMap.entrySet()方法得到一个Entry类型的Set集合，
	        //然后用增强型for循环调用getValue()方法输出value的值
	        //value的值是GoodsInCart，并不能直接输出所以要在GoodsInCart类内重写toString方法
	        Set<Entry<String, GoodsInCart>> set = goodsInCartMap.entrySet();
	        for(Entry<String, GoodsInCart> entry:set) {
	        	System.out.println(entry.getValue());}
		
		
		
		
		
//		if (shoppingCart.isEmpty()) {
//			System.out.println("购物车是空的哟，赶快装满吧~");
//		}else {
//			for(Map.Entry<String, GoodsInCart> key : shoppingCart.entrySet()) {
//				System.out.println("商品信息：" + key.getKey() + "，商品价格：" + key.getValue().getGoods().getPrice() + "，商品描述："
//						+ key.getValue().getGoods().getGoodsDesp() + "商品数量：" + key.getValue().getNum());
//			}
//		}

	}
	// 结算

	public void settleAccounts() {
		
		
        //调用goodsInCartMap.keySet()方法，返回的是一个包含所有kye的一个Set集合；
        //定义一个sum来存总价；用增强型for循环遍历set1(也就是包含所有kye的Set集合)
        //goodsInCartMap.get(str)得到的是value的值，也就是GoodsInCart
        //然后在调用getGoods()得到的就是Goods的值了，在调用getPrice()得到的就是商品的价格了
        //在调用goodsInCartMap.get(str)的基础上在调用getNum()方法可以得到商品的数量
    Set<String>   set=goodsInCartMap.keySet();
    //Iterator<String> it=set1.iterator();
    double sum=0;
    for(String str:set) {
        double  n=goodsInCartMap.get(str).getGoods().getPrice();
        double  m=goodsInCartMap.get(str).getNum();
        sum=sum+n*m;
    }
    System.out.println("商品总价为："+sum);

//	double sum = 0;
//
//	Iterator<Entry<String, GoodsInCart>> iterator = shoppingCart.entrySet().iterator();
//
//	while (iterator.hasNext()) {
//
//	Map.Entry<String, GoodsInCart> entry = (Entry<String, GoodsInCart>) iterator.next();
//
//	double num = entry.getValue().getGoods().getPrice() * entry.getValue().getNum();
//
//	sum = sum + num;
//
//	}
//
//	System.out.println("您一共消费了：" + sum + "元");

	shoppingCart.clear();

	}
	
	
	
}
