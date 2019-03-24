package task7_2;

/**
 * @author lmyst
 *
 */
/*
* 狮子（Lion）
* 继承自Animal实现IACT
* 新增属性：颜色（color）、性别（sex）
*/
public class Lion extends Animal implements IACT {

	/* (non-Javadoc)
	 * @see task7_2.IACT#skill()
	 */
	// 新增属性：颜色（color）、性别（sex）
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
	
	// Lion无参构造和有参构造
	public Lion() {

	}

	public Lion(String name, int age, String color, String sex) { // 名字（name），年龄(age)，颜色（color）、性别（sex）
	this.setName("Lion");
	this.setAge(2);
	this.setColor("金色");
	this.setSex("公");
	}
	
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "技能：擅长钻火圈";
	}

	/* (non-Javadoc)
	 * @see task7_2.IACT#act()
	 */
	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者：" + this.getName() + "\n年龄:" + this.getAge() + "岁" + "\n性别：" + this.getSex() + "\n毛色："
		 + this.getColor() + "\n技能：" + this.skill() + "\n爱好：" + this.love();
	}

	/* (non-Javadoc)
	 * @see task7_2.Animal#love()
	 */
	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "爱好：喜欢吃各种各样的肉。";
	}

}
