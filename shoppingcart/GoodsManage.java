package shoppingcart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class GoodsManage{
	//�����Ʒ������
	private Set<Goods> goodsSet = new HashSet<Goods>();
	Map<String, Goods> goodsMap = new HashMap<String, Goods>();
	//�޲ι��췽��
	public GoodsManage() {

	}
	//�вι��췽��
	public GoodsManage(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}
	//get/set
	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}
	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}
	
	//��Ʒ��Ϣ���룺
	public void importGoods() {
		Goods goods1 = new Goods("goods001", "ˮ��", 56, "�����ˮ��");
		//goodsMap.put("goods001", goods1);
		Goods goods2 = new Goods("goods002", "��ˮ��", 299, "���������ܵ���ˮ��");
		//goodsMap.put("goods002", goods2);
		Goods goods3 = new Goods("goods003", "�ʼǱ�����", 4999, "15��ʼǱ�����");
		//goodsMap.put("goods003", goods3);
		Goods goods4 = new Goods("goods004", "�ֻ�", 2300, "android�ֻ�");
		//goodsMap.put("goods004", goods4);
		goodsSet = new HashSet<Goods>();
		goodsSet.add(goods1);
		goodsSet.add(goods2);
		goodsSet.add(goods3);
		goodsSet.add(goods4);

		System.out.println("����ɹ���");
		
	}
	//��ʾ������Ʒ��Ϣ��
	public void displayAllGoods() {
		System.out.println("������Ʒ��ϢΪ��");
		Iterator<Goods> it = goodsSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator<Goods> itGoods = goodsMap.values().iterator();
		while (itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
		
		
	}
	
		
		
	
	

}
