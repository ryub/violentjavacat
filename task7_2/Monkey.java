package task7_2;
/*
* ���ӣ�Monkey��
* �̳���Animalʵ��IACT
* �������ԣ�Ʒ�֣�Type��
*/
public class Monkey extends Animal implements IACT {
	// �������ԣ�Ʒ�֣�Type��
	private String type;
	//get/set
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	// Monkey�޲ι�����вι���
	public Monkey() {

	}

	public Monkey(String name, int age, String type) {
	this.setName("Toni");
	this.setAge(1);
	this.setType("��˿��");
	}

	

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return  "���ܣ�����ֳ�����ľ��";
	}

	

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�" + this.getName() + "\n���䣺" + this.getAge() + "��" + "\nƷ�֣�" + this.getType() + "\n���ܣ�"
		+ this.skill() + "\n���ã�" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "���ã�ϲ��ģ���˵Ķ�������";
	}

}
