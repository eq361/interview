package com.sxt.study.interview.sxt;

import com.sxt.study.interview.InterviewApplicationTests;
import com.sxt.study.interview.util.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author songjun
 * @date 2019/10/12.
 */
public class AJavaBaseTest extends InterviewApplicationTests {

    @Test
    public void test1() {
        /**
         * 1.Java跨平台原理
         * java文件 编译成 class文件，不同平台上的JVM 解释执行 class文件
         */
    }

    @Test
    public void test2() {
        /**
         * 2.Java的安全性
         * ①取消了强大而又危险的指针，用引用来代替
         * ②垃圾自动回收机制
         * ③异常处理机制
         * ④强类型转换
         * ⑤java在字节码的传输过程中使用了公开密钥加密机制
         * ⑥运行时环境四级安全性保障机制：字节码校验器、类装载器、运行时内存布局、文件访问限制
         */
    }

    @Test
    public void test3() {
        /**
         * 3.Java三大版本
         * JavaSE/JavaEE/JavaME
         */
    }

    @Test
    public void test4() {
        /**
         * 4.什么是JVM？什么是JDK？ 什么是JRE？
         * Java Virtual Machine  java虚拟机
         * Java Development Kit  java开发工具包
         * Java Runtime Environment java运行时环境
         */
    }

    @Test
    public void test5() {
        /**
         * 5.冒泡排序
         */
        int[] array = {-4, 21, 27, 34, -90};
        ArrayUtils.sortByBubble2(array);
        System.out.println(Arrays.toString(array));
    }
}
