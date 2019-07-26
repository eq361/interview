package com.sxt.study.interview;

import org.junit.Test;

/**
 * @author songj
 * @date 2019/7/26 16:08
 */
public class JavaSETest extends InterviewApplicationTests {

    @Test
    public void test1() {
        /**
         * JDK:Java Development Kit
         * JRE:Java Runtime Environment
         *
         * JDK 包含 JRE
         *
         */
    }

    @Test
    public void test2() {
        /**
         * == 与 equals
         *
         * == 基本数据类型比较值，引用类型 比较地址值
         * equals 引用类型 如果重写了，比较内容，否则 比较地址值
         */
    }

    @Test
    public void test3() {
        /**
         * 两个对象的 hashCode() 相同，则 equals() 不一定为 true
         *
         */
    }
    
    @Test
    public void test4(){
        /**
         * final 在 Java 中有什么作用
         * 1.修饰类 表示类不可继承
         * 2.修饰方法 表示方法不可重写
         * 3.修饰变量 表示属性是常量 常量必须被初始化，不可更改
         */
        final String a = "常量";
        // a = "大哥";
    }

    @Test
    public void test5(){
        /**
         * Math. round(-1. 5)
         *
         * + 1/2 向下取整
         * 
         */
    
    }
    @Test
    public void test6(){
        /**
         * String 是引用类型
         * 八大基本数据类型
         * byte、short、 int、 long
         * float、double
         * boolean、char
         * 
         */
    
    }

    @Test
    public void test7(){
        /**
         * String/StringBuffer/StringBuilder
         * String:不可变字符序列
         * StringBuffer:可变字符序列，线程安全
         * StringBuilder:可变字符序列，线程不安全，性能高，单线程下使用
         * 
         */
    
    }
    @Test
    public void test8(){
        /**
         * String str="i"与 String str=new String("i") 不一样
         * 内存分配方式不一样
         * 前者 分配在字符串常量池
         * 后者 分配在堆内存中
         * 
         */
    
    }
    @Test
    public void test9(){
        /**
         * 字符串反转
         * 使用 StringBuilder 或者 stringBuffer 的 reverse() 方法。
         * 
         */
        String str = "abc=123";
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse.toString());

    }
    @Test
    public void test10(){
        /**
         * String 常用方法
         * indexOf() 返回指定字符的索引
         * charAt() 返回指定索引处的字符
         * trim() 去除字符串两端空白
         * split() 分割字符串
         * getBytes() 返回字符串的byte类型数组
         * length() 返回字符串长度
         * toUpperCase() 把字符串转换成大写
         * toLowerCase() 把字符串转换成小写
         * equals() 字符串比较
         * substring() 截取字符串
         * replace() 字符串替换
         * 
         */
        String str = "I Love TangHaiQin!";
        System.out.println(str.substring(2,6).length());
    
    }
}
