package com.example.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class mainDemo {


    
    /**
     * age
     */
    private int age;

    
    /**
     * name
     */
    private String name;


    public static void main(String[] args) {
        
        String astr = "hello";

        System.out.println(astr);

        System.out.println("a = " + astr);

        System.out.println("----------------------------------------------------------------");
        //String.format(a, %s%);
        //  a.return  -->   return a;

        formatDemo();


        List<String> a = new ArrayList();
        f1(a);


    }

    private static void f1(List<String> a) {

        String name = "zhangsan";
        int age = 24;


        String x =  "name:" + name + "age:" + age;
        System.out.println(x);


    }


    //String.format()字符串常规类型格式化的两种重载方式

    /**
     * %s	字符串类型	“喜欢请收藏”
     * %c	字符类型	‘m’
     * %b	布尔类型	true
     * %d	整数类型（十进制）	88
     * %x	整数类型（十六进制）	FF
     * %o	整数类型（八进制）	77
     * %f	浮点类型	8.888
     * %a	十六进制浮点类型	FF.35AE
     * %e	指数类型	9.38e+5
     * %g	通用浮点类型（f和e类型中较短的）	不举例(基本用不到)
     * %h	散列码	不举例(基本用不到)
     * %%	百分比类型	％(%特殊字符%%才能显示%)
     * %n	换行符	不举例(基本用不到)
     * %tx	日期与时间类型（x代表不同的日期与时间转换符)	不举例(基本用不到)
     */
    public static void formatDemo(){
        String str=null;
        str=String.format("Hi,%s", "小超");
        System.out.println(str);
        str=String.format("Hi,%s %s %s", "小超","是个","大帅哥");
        System.out.println(str);
        System.out.printf("字母c的大写是：%c %n", 'C');
        //System.out.printf("布尔结果是：%b %n", "小超".equal("帅哥"));
        System.out.printf("100的一半是：%d %n", 100/2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'A');




        System.out.println("----------------------------------------------------------------");


        /**
         * riqi zhuanhuanfu
         * c	包括全部日期和时间信息	星期六 十月 27 14:21:20 CST 2007
         * F	“年-月-日”格式	2007-10-27
         * D	“月/日/年”格式	10/27/07
         * r	“HH:MM:SS PM”格式（12时制）	02:25:51 下午
         * T	“HH:MM:SS”格式（24时制）	14:28:16
         * R	“HH:MM”格式（24时制）	14:28
         */
        Date date=new Date();
        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mainDemo mainDemo = (mainDemo) o;
        return age == mainDemo.age &&
                Objects.equals(name, mainDemo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "mainDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
