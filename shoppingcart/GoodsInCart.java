package shoppingcart;

public class GoodsInCart{
	//��Ʒ��Ϣ������
	private Goods goods;
	private int num;
	
	//�޲ι��췽��
	public GoodsInCart() {

	}
	//�вι��췽��
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
	
	//toString����
	@Override
	public String toString() {
		
		return "��Ʒ���ƣ�"+goods.getGoodsName()+",��Ʒ�۸�"+goods.getPrice()+",��Ʒ������"+goods.getGoodsDesp()
		  +",������"+this.getNum();
	}
	
	
}
