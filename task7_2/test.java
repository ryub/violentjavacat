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
boolean flag = true;// ����һ���жϣ������������Ӧ������Ļ�
IACT str = null;
Scanner sc = new Scanner(System.in);
while (flag) {
show();// ���õ�ǰ���show()����
int input = sc.nextInt();
switch (input) {
case 1:
str = new Bear("Bill", 1);
System.out.println(str.act());
break;
case 2:
str = new Lion("Lain", 2, "��ɫ", "��");
System.out.println(str.act());
break;
case 3:
str = new Monkey("Tom", 1, "��˿��");
System.out.println(str.act());
break;
case 4:
str = new Parrot("Rose", 1, "ĵ������");
System.out.println(str.act());
break;
case 5:
str = new Clown("Zero", 20);
System.out.println(str.act());
break;
default:
System.out.println("��������ȷ�����飡");
continue;
}
System.out.println("********** �Ƿ�����ۿ���0/1��");
int input2 = sc.nextInt();
switch (input2) {
case 1:
flag = true;
break;
case 0:
flag = false;
System.out.println("********** ��ӭ�´ιۿ�");
break;
}
}
sc.close();//�ڳ������ʱ�������������ͷ��ڴ档
}

void show() {
System.out.println("***********��ӭ����̫����Ϸ��***********");
System.out.println("*********** ��ѡ������� ***********");
System.out.println("*********** 1������ ***********");
System.out.println("*********** 2��ʨ�� ***********");
System.out.println("*********** 3������ ***********");
System.out.println("*********** 4������ ***********");
System.out.println("*********** 5��С�� ***********");
}


}