package task7_2;

/**
 * @author lmyst
 *
 */
/*
* ʨ�ӣ�Lion��
* �̳���Animalʵ��IACT
* �������ԣ���ɫ��color�����Ա�sex��
*/
public class Lion extends Animal implements IACT {

	/* (non-Javadoc)
	 * @see task7_2.IACT#skill()
	 */
	// �������ԣ���ɫ��color�����Ա�sex��
	private String color;
	private String sex;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// Lion�޲ι�����вι���
	public Lion() {

	}

	public Lion(String name, int age, String color, String sex) { // ���֣�name��������(age)����ɫ��color�����Ա�sex��
	this.setName("Lion");
	this.setAge(2);
	this.setColor("��ɫ");
	this.setSex("��");
	}
	
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���ܣ��ó����Ȧ";
	}

	/* (non-Javadoc)
	 * @see task7_2.IACT#act()
	 */
	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�" + this.getName() + "\n����:" + this.getAge() + "��" + "\n�Ա�" + this.getSex() + "\nëɫ��"
		 + this.getColor() + "\n���ܣ�" + this.skill() + "\n���ã�" + this.love();
	}

	/* (non-Javadoc)
	 * @see task7_2.Animal#love()
	 */
	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "���ã�ϲ���Ը��ָ������⡣";
	}

}
