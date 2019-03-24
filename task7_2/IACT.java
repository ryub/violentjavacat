package task7_2;

/**
 * @author lmyst
 *
 */
/*
* 表演（IACT）
* 抽象方法：描述技能（skill）、描述表演（act）
* 说明： 每个表演者的表演信息是通过调用act()方法输出的 
*/
public interface IACT {
	public abstract String skill();
	public abstract String act();
}
