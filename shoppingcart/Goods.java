package shoppingcart;
public class Goods {
	//��Ʒ��ţ���Ʒ���ƣ� ��Ʒ�۸���Ʒ����
	public String goodsId;
	public String goodsName;
	public double price;
	public String goodsDesp;
	
	//�޲ι��췽��
	public Goods() {

	}
	//�вι��췽��
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
	
	
	
	//toString����
	@Override
	public String toString() {
		return "[��Ʒ���=" + goodsId + ", ��Ʒ����=" + goodsName + ", ��Ʒ�۸�=" + price + ", ��Ʒ����="
				+ goodsDesp + "]";
	}
	
	//hashCode()��equals()����
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
		//�ж϶����Ƿ���ȣ�����򷵻�true�����ü����Ƚ�������
		if(this==obj)
			return true;
		//�ж�obj�Ƿ���Goods��Ķ���
		if(obj.getClass()==Goods.class){
			Goods goods=(Goods)obj;
			return goods.getGoodsId().equals(goodsId)&&(goods.getGoodsName().equals(goodsName))&&(goods.getPrice() == price)&&(goods.getGoodsDesp().equals(goodsDesp));
		}
		return false;
	}
	

}
