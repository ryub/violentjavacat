package task7_2;

/**
 * @author lmyst
 *
 */
/*
* С��Clown��
* ʵ��IACT
* ���ԣ����֣�name�������䣨years��
* ������������װ�ص㣨dress��
*/
public class Clown implements IACT {

	/* (non-Javadoc)
	 * @see task7_2.IACT#skill()
	 */
//	���ԣ����֣�name�������䣨years��
	private String name;
	private int years;
	//set/get
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getYears() {
		return years;
	}




	public void setYears(int years) {
		this.years = years;
	}

	
	//С��Clown���޲ι�����вι���
	public Clown() {

	}
	public Clown(String name,int years) {
		this.setName("Zero");
		this.setYears(20);
		}
	//������������װ�ص㣨dress��
	public String dress() {

	return "��������ɫ�ķ�װ��ͷ����ɫñ�ӣ����Ӻ��ģ����ϻ��ſ��ŵĲ�ױ��";
	}
	
	
	




	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return  "�ȸ��Σ����и��Ѷ�ħ������";
	}

	/* (non-Javadoc)
	 * @see task7_2.IACT#act()
	 */
	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "������"+this.getName()+"\n����"+this.getYears()+"\n��װ��"+this.dress()+"\n���ܣ�"+this.skill();
	}

}
