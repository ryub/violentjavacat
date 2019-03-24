package task7_2;
/*
* 猴子（Monkey）
* 继承自Animal实现IACT
* 新增属性：品种（Type）
*/
public class Monkey extends Animal implements IACT {
	// 新增属性：品种（Type）
	private String type;
	//get/set
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	// Monkey无参构造和有参构造
	public Monkey() {

	}

	public Monkey(String name, int age, String type) {
	this.setName("Toni");
	this.setAge(1);
	this.setType("金丝猴");
	}

	

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return  "技能：骑独轮车过独木桥";
	}

	

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁" + "\n品种：" + this.getType() + "\n技能："
		+ this.skill() + "\n爱好：" + this.love();
	}

	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "爱好：喜欢模仿人的动作表情";
	}

}
