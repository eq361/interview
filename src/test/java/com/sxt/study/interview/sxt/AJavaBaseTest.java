package com.sxt.study.interview.sxt;

import com.sxt.study.interview.InterviewApplicationTests;
import com.sxt.study.interview.util.ArrayUtils;
import com.sxt.study.interview.util.StringUtils;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;

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

    @Test
    public void test6() {

        Double d = 1.0;

        System.out.println(Math.random() / Math.random());

        System.out.println(StringUtils.reverse("abcd"));

    }

    @Test
    public void test7() {
        String str = "你好hello！";
        try {
            System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test8() {
        LocalDateTime localDateTime = LocalDateTime.of(2019, 2, 25, 23, 59, 59);
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getYear());
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void test9() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        System.out.println(calendar.getTime());

    }

    @Test
    public void test10() {
        String str = "a1s2d3f4h5j6k7";
        // 将字符串中的数字全部替换为0
        System.out.println(StringUtils.replaceAll(str, "\\d", "0"));

    }

    @Test
    public void test11() {
        System.out.println(StringUtils.isAnagram("hello", "lleohe"));

        String str = "a" + "b" + "c" + "d";
        System.out.println(str == "abcd");

    }
}
