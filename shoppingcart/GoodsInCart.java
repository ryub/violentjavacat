package shoppingcart;

public class GoodsInCart{
	//商品信息和数量
	private Goods goods;
	private int num;
	
	//无参构造方法
	public GoodsInCart() {

	}
	//有参构造方法
	public GoodsInCart(Goods goods, int num) {
		this.goods = goods;
		this.num = num;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	//toString方法
	@Override
	public String toString() {
		
		return "商品名称："+goods.getGoodsName()+",商品价格："+goods.getPrice()+",商品描述："+goods.getGoodsDesp()
		  +",数量："+this.getNum();
	}
	
	
}
