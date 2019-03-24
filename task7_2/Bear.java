package task7_2;

public class Bear extends Animal implements IACT {

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "技能：挽着花篮，打着雨伞，自立走秀";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者："+this.getName()+"\n年龄："+this.getAge()+"\n技能："+this.skill();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "喜欢卖萌";
	}
	
	
	//Bear的有参与无参构造
	public Bear() {
		
	}
	public Bear(String name,int age) {
		//super(name,age);也行
		this.setName(name);
		this.setAge(age);
		
	}
}