package task7_2;
/*
* ���ģ�Parrot��
* �̳���Animalʵ��IACT
* �������ԣ�Ʒ�֣�type��
*/
public class Parrot extends Animal implements IACT {
	// �������ԣ�Ʒ�֣�Type��
	private String type;
	//get/set
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	// Parrot�޲ι�����вι���
	
	// ���ģ�Parrot���޲ι�����вι���
	public Parrot() {

	}

	public Parrot(String name, int age, String type) {
	this.setName("Rose");
	this.setAge(1);
	this.setType("ĵ������");
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���ܣ��ó�ģ��";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�" + this.getName() + "\n���䣺" + this.getAge() + "��" + "\nƷ��" + this.getType() + "\n���ܣ�"
		+ this.skill() + "\n���ã�" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "���ã�ϲ����������ӡ�";
	}

}
