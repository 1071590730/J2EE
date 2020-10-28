package com.wangjianbiao.www;

/**
 * @create: 2020/10/28 18:29
 * @author: WangJianbiao
 */
public class Demo1 {
    public static void main(String[] args){
        System.out.println(9.9/3.3f);
    }
    //枚举
    enum Color
    {
        RED, GREEN, BLUE;
    }
    /*
    Java 枚举(enum)
    Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
    Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
     */
}

/*
自动类型转换
    整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。
    转换从低级到高级。
    低  ------------------------------------>  高
    byte,short,char—> int —> long—> float —> double

java面试题之int和Integer的区别
    int和Integer的区别
    1、Integer是int的包装类，int则是java的一种基本数据类型
    2、Integer变量必须实例化后才能使用，而int变量不需要
    3、Integer实际是对象的引用，当new一个Integer时，实际上是生成一个指针指向此对象；而int则是直接存储数据值
    4、Integer的默认值是null，int的默认值是0
        Java中Integer类的实例化，及装箱，拆箱概念：
            1、Integer的常用构造方法有这两个：
            public Integer(int value);
            public Integer(String value);
            2、Integer的实例化有4种方式：
            （1）Integer a = new Integer(100);
            （2）Integer b = new Integer(“200”);
            （3）Integer c = 300;
            （4）Integer d = Integer.valueOf(400);
            装箱：基本数据类型 ----> 对应包装类类型，这个过程叫装箱。
            拆箱：包装类类型 ----> 对应基本数据类型，这个过程叫拆箱。

抽象类和接口的区别
    含有abstract修饰符的class即为抽象类，abstract 类不能创建实例对象。含有abstract方法的类必须定
义为abstract class，abstract class类中的方法不必是抽象的。abstract class类中定义抽象方法必须在具
体(Concrete)子类中实现，所以，不能有抽象构造方法或抽象静态方法。如果子类没有实现抽象父类中的所有抽象方法，
那么子类也必须定义为abstract类型。
接口（interface）可以说成是抽象类的一种特例，接口中的所有方法都必须是抽象的。接口中的方法定义默认
为public abstract类型，接口中的成员变量类型默认为public static final。
    下面比较一下两者的语法区别：
        1.抽象类可以有构造方法，接口中不能有构造方法。
        2.抽象类中可以有普通成员变量，接口中没有普通成员变量
        3.抽象类中可以包含非抽象的普通方法，接口中的所有方法必须都是抽象的，不能有非抽象的普通方法。
        4. 抽象类中的抽象方法的访问类型可以是public，protected和（默认类型,虽然
        eclipse下不报错，但应该也不行），但接口中的抽象方法只能是public类型的，并且默认即为public abstract类型。
        5. 抽象类中可以包含静态方法，接口中不能包含静态方法
        6. 抽象类和接口中都可以包含静态成员变量，抽象类中的静态成员变量的访问类型可以任意，但接口中定义的变量只
        能是public static final类型，并且默认即为public static final类型。
        7. 一个类可以实现多个接口，但只能继承一个抽象类。
 */