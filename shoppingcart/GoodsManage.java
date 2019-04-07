package shoppingcart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class GoodsManage{
	//存放商品的容器
	private Set<Goods> goodsSet = new HashSet<Goods>();
	Map<String, Goods> goodsMap = new HashMap<String, Goods>();
	//无参构造方法
	public GoodsManage() {

	}
	//有参构造方法
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
	
	//商品信息导入：
	public void importGoods() {
		Goods goods1 = new Goods("goods001", "水杯", 56, "不锈钢水杯");
		//goodsMap.put("goods001", goods1);
		Goods goods2 = new Goods("goods002", "饮水机", 299, "带净化功能的饮水机");
		//goodsMap.put("goods002", goods2);
		Goods goods3 = new Goods("goods003", "笔记本电脑", 4999, "15寸笔记本电脑");
		//goodsMap.put("goods003", goods3);
		Goods goods4 = new Goods("goods004", "手机", 2300, "android手机");
		//goodsMap.put("goods004", goods4);
		goodsSet = new HashSet<Goods>();
		goodsSet.add(goods1);
		goodsSet.add(goods2);
		goodsSet.add(goods3);
		goodsSet.add(goods4);

		System.out.println("导入成功！");
		
	}
	//显示所有商品信息：
	public void displayAllGoods() {
		System.out.println("所有商品信息为：");
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
