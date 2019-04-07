package shoppingcart;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ShoppingCart{
	//���ﳵ
	public Map<String, GoodsInCart> shoppingCart = new HashMap<String, GoodsInCart>();
	Scanner console=new Scanner(System.in);
	public Map<String,GoodsInCart> goodsInCartMap=new HashMap<String,GoodsInCart>();
	//�޲ι��췽��
	public ShoppingCart() {

	}
	//�вι��췽��
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
	
	
	//����
	//�����Ʒ�����ﳵ��
	public void addGoodsToCart(GoodsManage gm) {
		
		
		 //gm.getGoodsSet()���÷��ص���goodsSet��Ҳ����һ�����Goods��Set���ϣ�
		//Ȼ���ڵ���isEmpty()�������ص���һ��boolean��ֵ���жϼ����Ƿ�Ϊ�գ����Ϊ��return,�����ó���
		        if (gm.getGoodsSet().isEmpty()) {
		            System.out.println("��û����Ʒ���ǵõ�����Ʒ��ϢӴ��");
		            return;
		        }
		        System.out.println("������Ҫ�����Ʒ�ı��");
		        String goodsId =null;
		        //gm.getGoodsSet()���÷��ص���goodsSet��Ҳ����һ�����Goods��Set���ϣ�
		        //��Ϊ�Ǵ��Goods�ļ��� ���Է�����Goods��Ȼ���õ������������ϡ�
		        Iterator<Goods> it = gm.getGoodsSet().iterator();
		        //����һ��Goods���͵�g,���Ҹ�ֵΪ�գ���������õ�������������ֵ��
		        //����һ��boolean���͵ı������Ҹ�ֵΪtrue,��������ѭ����
		        Goods goods = null;
		        boolean flag = true;
		        //�ѱ���������ֵ��ŵ�goods�У�Ȼ�����getGoodsId()�����õ�goodsId��ֵ��
		        //Ȼ��ͼ��������ֵ��goodsId���Ƚϣ���������˵����ı������ȷ�ģ���flag��ֵΪfalse;
		        //Ȼ��break,������ǰѭ������ѭ��������ΪflagֵΪfalse�ˣ�������ѭ��Ҳ������
		        //����ͼ��������ֵ��goodsId���Ƚ�Ϊ����ȣ�˵������ı�Ų���ȷ��
		        //��Ϊflag��ֵΪtrue����ִ�еڶ���if���,Ȼ��ִ��continue���������ǰѭ��������һ��ѭ����
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
		                System.out.println("�������Ʒ��Ų���ȷ�����������룺");console.next();continue;
		            }
		        }
		        System.out.println("������Ҫ�����Ʒ������");
		        int num = console.nextInt();
		        //����������ȵ�����£�˵������ı���ǶԵģ�����Ӧ��g,���Ǹñ����Ʒ����Ϣ
		        //��g��n���������Ʒ��������GoodsInCart�Ĺ��췽������ȥ��
		        //Ȼ��ѱ�ţ�str����Ϊkeyֵ��GoodsInCart��Ϊvalueֵ��ӵ�map������
		        GoodsInCart goodsInCart = new GoodsInCart(goods, num);
		        goodsInCart.setNum(num);//n��ֵ���ǹ�����Ʒ�������������ֵ����num,����������㷽�����޸���Ʒ����ʹ��
		        goodsInCartMap.put(goodsId, goodsInCart);
		    
		 
		
		
		
		

//	   //  ����HashMap����
//	   Map<String,GoodsInCart> goodsInCartMap=new HashMap<String,GoodsInCart>();
//	   System.out.println("������Ҫ��ӵ���Ʒ��ţ�");
//	   String goodsId=console.next();
//	   System.out.println("������Ҫ��ӵ���Ʒ������");
//	   int num=console.nextInt();
//	   
//	   Set<Goods> goods=gm.getGoodsSet();
//	   System.out.println("�޸���ϣ�������������������");
//	   
//	   for(Goods goodi:goods){  //����Goods����  �ҵ������Ӧ��ŵ���Ʒ
//	       if(goodi.getGoodsId().equals(goodsId)){ //��Ʒ���������ı�����
//	   GoodsInCart goodsInCart=new GoodsInCart(goodi,num);
//	   goodsInCartMap.put(goodsId,goodsInCart);}
//	      }
	
	}
	
	//�޸Ĺ��ﳵ�е���Ʒ������
	public void updateNumInCart() {
		   System.out.println("������Ҫ�޸ĵ���Ʒ��ţ�");
		   String input=console.next();
		   System.out.println("�������µ���Ʒ������");
		   int num=console.nextInt();

		   Iterator<GoodsInCart> it=shoppingCart.values().iterator();
		   while(it.hasNext()){
		       GoodsInCart gCart=it.next();
		       if(gCart.getGoods().getGoodsId().equals(input)) {
		           gCart.setNum(num);
		       }
		   }	   	   
//		   if(num == 0) {
//			   //���numΪ0����ɾ��������Ʒ��
//		   }
//		   console.close();//�ڳ������ʱ�������������ͷ��ڴ档
		   
//		Iterator<GoodsInCart> it=shoppingCart.values().iterator();
//		while(it.hasNext()){
//		GoodsInCart gCart=it.next();// �õ�map���ϵ�����
//		    if(gCart.getGoods().getGoodsId().equals(input)){
//		        gCart.setNum(num);
//		    }
//		}
		   
		   
		   
	}
	//��ʾ���ﳵ�е�������Ʒ��
	public void displayAllInCart() {
		
		 if(goodsInCartMap.isEmpty()) {
	            System.out.println("���ﳵ�ǿյ�Ӵ���Ͽ�װ���ɣ�");
	            return;
	        }
	        //��ʾ������Ʒ��ʵ�������goodsInCartMap������value��ֵ��
	        //��goodsInCartMap.entrySet()�����õ�һ��Entry���͵�Set���ϣ�
	        //Ȼ������ǿ��forѭ������getValue()�������value��ֵ
	        //value��ֵ��GoodsInCart��������ֱ���������Ҫ��GoodsInCart������дtoString����
	        Set<Entry<String, GoodsInCart>> set = goodsInCartMap.entrySet();
	        for(Entry<String, GoodsInCart> entry:set) {
	        	System.out.println(entry.getValue());}
		
		
		
		
		
//		if (shoppingCart.isEmpty()) {
//			System.out.println("���ﳵ�ǿյ�Ӵ���Ͽ�װ����~");
//		}else {
//			for(Map.Entry<String, GoodsInCart> key : shoppingCart.entrySet()) {
//				System.out.println("��Ʒ��Ϣ��" + key.getKey() + "����Ʒ�۸�" + key.getValue().getGoods().getPrice() + "����Ʒ������"
//						+ key.getValue().getGoods().getGoodsDesp() + "��Ʒ������" + key.getValue().getNum());
//			}
//		}

	}
	// ����

	public void settleAccounts() {
		
		
        //����goodsInCartMap.keySet()���������ص���һ����������kye��һ��Set���ϣ�
        //����һ��sum�����ܼۣ�����ǿ��forѭ������set1(Ҳ���ǰ�������kye��Set����)
        //goodsInCartMap.get(str)�õ�����value��ֵ��Ҳ����GoodsInCart
        //Ȼ���ڵ���getGoods()�õ��ľ���Goods��ֵ�ˣ��ڵ���getPrice()�õ��ľ�����Ʒ�ļ۸���
        //�ڵ���goodsInCartMap.get(str)�Ļ������ڵ���getNum()�������Եõ���Ʒ������
    Set<String>   set=goodsInCartMap.keySet();
    //Iterator<String> it=set1.iterator();
    double sum=0;
    for(String str:set) {
        double  n=goodsInCartMap.get(str).getGoods().getPrice();
        double  m=goodsInCartMap.get(str).getNum();
        sum=sum+n*m;
    }
    System.out.println("��Ʒ�ܼ�Ϊ��"+sum);

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
//	System.out.println("��һ�������ˣ�" + sum + "Ԫ");

	shoppingCart.clear();

	}
	
	
	
}
