package task7_2;

/**
 * @author lmyst
 *
 */

/*
* ���ԣ��ǳƣ�name�������䣨age��
* ���󷽷�������ϲ�ã�love��
*/
public abstract class Animal { //��Ϊ�������һ��love�ĳ��󷽷���������Ҫ��abstract
//	���ԣ��ǳƣ�name�������䣨age��
	
private String name;
private int age;
// �޲ι��췽��
public Animal() {

}

//�вι��췽��
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
//���󷽷�������ϲ�ã�love��
public abstract String love();
}

