# violentjavacat
My Java practice project
本项目是马戏团节目管理系统，运用Java基础语法、面向对象的知识，完成。
详细设计如下：
1.抽象父类：
动物（Animal）
属性：昵称（name）、年龄（age）
抽象方法：描述喜好（love）
2. 接口
表演（IACT）
抽象方法：描述技能（skill）、描述表演（act）
说明： 每个表演者的表演信息是通过调用act()方法输出的              
3. 实现类
棕熊（Bear）
继承自Animal实现IACT
狮子（Lion）
继承自Animal实现IACT
新增属性：颜色（color）、性别（sex）
猴子（Monkey）
继承自Animal实现IACT
新增属性：品种（Type）
鹦鹉（Parrot）
继承自Animal实现IACT
新增属性：品种（type）
小丑（Clown）
实现IACT
属性：名字（name）、艺龄（years）
新增方法：着装特点（dress）
