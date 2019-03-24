package task7_2;

/**
 * @author lmyst
 *
 */
/*
* 小丑（Clown）
* 实现IACT
* 属性：名字（name）、艺龄（years）
* 新增方法：着装特点（dress）
*/
public class Clown implements IACT {

	/* (non-Javadoc)
	 * @see task7_2.IACT#skill()
	 */
//	属性：名字（name）、艺龄（years）
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

	
	//小丑（Clown）无参构造和有参构造
	public Clown() {

	}
	public Clown(String name,int years) {
		this.setName("Zero");
		this.setYears(20);
		}
	//新增方法：着装特点（dress）
	public String dress() {

	return "身穿五颜六色的服装，头戴彩色帽子，鼻子红红的，脸上画着夸张的彩妆。";
	}
	
	
	




	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return  "踩高跷，进行高难度魔术表演";
	}

	/* (non-Javadoc)
	 * @see task7_2.IACT#act()
	 */
	@Override
	public String act() {
		// TODO Auto-generated method stub
		return "表演者"+this.getName()+"\n艺龄"+this.getYears()+"\n着装："+this.dress()+"\n技能："+this.skill();
	}

}
