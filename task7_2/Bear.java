package task7_2;

public class Bear extends Animal implements IACT {

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "���ܣ����Ż�����������ɡ����������";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "�����ߣ�"+this.getName()+"\n���䣺"+this.getAge()+"\n���ܣ�"+this.skill();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "ϲ������";
	}
	
	
	//Bear���в����޲ι���
	public Bear() {
		
	}
	public Bear(String name,int age) {
		//super(name,age);Ҳ��
		this.setName(name);
		this.setAge(age);
		
	}
}