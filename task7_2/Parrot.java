package task7_2;
/*
* 鹦鹉（Parrot）
* 继承自Animal实现IACT
* 新增属性：品种（type）
*/
public class Parrot extends Animal implements IACT {
	// 新增属性：品种（Type）
	private String type;
	//get/set
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	// Parrot无参构造和有参构造
	
	// 鹦鹉（Parrot）无参构造和有参构造
	public Parrot() {

	}

	public Parrot(String name, int age, String type) {
	this.setName("Rose");
	this.setAge(1);
	this.setType("牡丹鹦鹉");
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "技能：擅长模仿";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁" + "\n品种" + this.getType() + "\n技能："
		+ this.skill() + "\n爱好：" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "爱好：喜欢坚果和松子。";
	}

}
