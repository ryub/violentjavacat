package task7_2;

/**
 * @author lmyst
 *
 */

/*
* 属性：昵称（name）、年龄（age）
* 抽象方法：描述喜好（love）
*/
public abstract class Animal { //因为这个类有一个love的抽象方法，所以类要用abstract
//	属性：昵称（name）、年龄（age）
	
private String name;
private int age;
// 无参构造方法
public Animal() {

}

//有参构造方法
public Animal(String name,int age) {
this.name=name;
this.age=age;
}
//get/set
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
//抽象方法：描述喜好（love）
public abstract String love();
}

