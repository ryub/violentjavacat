package shoppingcart;
public class Goods {
	//商品编号，商品名称， 商品价格，商品描述
	public String goodsId;
	public String goodsName;
	public double price;
	public String goodsDesp;
	
	//无参构造方法
	public Goods() {

	}
	//有参构造方法
	public Goods(String goodsId,String goodsName,double price,String goodsDesp) {
		this.goodsId=goodsId;
		this.goodsName=goodsName;
		this.price=price;
		this.goodsDesp=goodsDesp;
		}
	//set/get
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGoodsDesp() {
		return goodsDesp;
	}
	public void setGoodsDesp(String goodsDesp) {
		this.goodsDesp = goodsDesp;
	}
	
	
	
	//toString方法
	@Override
	public String toString() {
		return "[商品编号=" + goodsId + ", 商品名称=" + goodsName + ", 商品价格=" + price + ", 商品描述="
				+ goodsDesp + "]";
	}
	
	//hashCode()和equals()方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goodsDesp == null) ? 0 : goodsDesp.hashCode());
		result = prime * result + ((goodsId == null) ? 0 : goodsId.hashCode());
		result = prime * result + ((goodsName == null) ? 0 : goodsName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//判断对象是否相等，相等则返回true，不用继续比较属性了
		if(this==obj)
			return true;
		//判断obj是否是Goods类的对象
		if(obj.getClass()==Goods.class){
			Goods goods=(Goods)obj;
			return goods.getGoodsId().equals(goodsId)&&(goods.getGoodsName().equals(goodsName))&&(goods.getPrice() == price)&&(goods.getGoodsDesp().equals(goodsDesp));
		}
		return false;
	}
	

}
