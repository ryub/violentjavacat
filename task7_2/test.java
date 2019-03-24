package task7_2;
import java.util.Scanner;

import task7_2.Bear;
import task7_2.Clown;
import task7_2.IACT;
import task7_2.Lion;
import task7_2.Monkey;
import task7_2.Parrot;

public class test {

public static void main(String[] args) {
task one = new task();
one.menu();
}
}
class task {
public void menu() {
boolean flag = true;// 进行一个判断，如果有输入相应的数组的话
IACT str = null;
Scanner sc = new Scanner(System.in);
while (flag) {
show();// 调用当前类的show()方法
int input = sc.nextInt();
switch (input) {
case 1:
str = new Bear("Bill", 1);
System.out.println(str.act());
break;
case 2:
str = new Lion("Lain", 2, "金色", "公");
System.out.println(str.act());
break;
case 3:
str = new Monkey("Tom", 1, "金丝猴");
System.out.println(str.act());
break;
case 4:
str = new Parrot("Rose", 1, "牡丹鹦鹉");
System.out.println(str.act());
break;
case 5:
str = new Clown("Zero", 20);
System.out.println(str.act());
break;
default:
System.out.println("请输入正确的数组！");
continue;
}
System.out.println("********** 是否继续观看（0/1）");
int input2 = sc.nextInt();
switch (input2) {
case 1:
flag = true;
break;
case 0:
flag = false;
System.out.println("********** 欢迎下次观看");
break;
}
}
sc.close();//在程序结束时结束输入流，释放内存。
}

void show() {
System.out.println("***********欢迎来到太阳马戏团***********");
System.out.println("*********** 请选择表演者 ***********");
System.out.println("*********** 1、棕熊 ***********");
System.out.println("*********** 2、狮子 ***********");
System.out.println("*********** 3、猴子 ***********");
System.out.println("*********** 4、鹦鹉 ***********");
System.out.println("*********** 5、小丑 ***********");
}


}