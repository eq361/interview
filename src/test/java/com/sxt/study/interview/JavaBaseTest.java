package com.sxt.study.interview;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author songj
 * @date 2019/8/5 9:02
 */
public class JavaBaseTest extends InterviewApplicationTests {

    @Test
    public void test1() {
        /**
         * 1.JDK 和 JRE 有什么区别？
         * JDK：Java Development Kit， java开发工具包，提供了java的开发环境和运行环境。
         * JRE：Java Runtime Environment，java运行时环境，提供了java运行环境。
         * JDK 包含 JRE
         *
         */

    }

    @Test
    public void test2() {
        /**
         * 2. == 和 equals() 的区别是什么？
         * `==` 对于基本数据类型，比较值是否相等，引用类型，比较地址值是否相同
         * equals()方法 用于引用类型，如果重写了，比较内容是否相同，否则比较引用地址值
         *
         * IntegerCache -128 —— 127
         */
        Integer a = 344;
        Integer b = 344;
        // false
        System.out.println(a == b);
        Assert.assertEquals(a, b);
    }
    
    @Test
    public void test3(){
        /**
         * 3. 两个对象的 hashCode() 相同，则 equals() 也一定为 true，对吗？
         * 不对 ，"通话" "重地"
         * 
         */
    
    }
    @Test
    public void test4(){
        /**
         * 4. final 在 Java 中有什么作用？
         *
         * final 修饰类 表示类不可继承
         * final 修饰方法 表示方法不可重写
         * final 修饰变量 表示该变量为常量，常量必须初始化，初始化后就不能更改
         * 
         */
    
    }
    
    @Test
    public void test5(){
        /**
         * 5. Java 中的 Math. round(-1. 5) 等于多少？
         *
         * + 0.5 向下取整
         *
         * -1
         * 
         */
    
    }
    
    @Test
    public void test6(){
        /**
         * 6. String 属于基础的数据类型吗？
         * 
         * 八大基本数据类型：byte/short/int/long float/double boolean char
         * String 是引用类型
         * 
         */
    
    }
    
    @Test
    public void test7(){
        /**
         * 7. Java 中操作字符串都有哪些类？它们之间有什么区别？
         *
         * String/StringBuffer/StringBuilder
         *
         * String:不可变字符序列
         * StringBuffer/StringBuilder: 可变字符序列
         *
         * StringBuffer：线程安全    可全局变量使用
         * StringBuilder：非线程安全，性能高  局部变量运用
         * 
         */
    
    }
    
    @Test
    public void test8(){
        /**
         * 8. String str="i"与 String str=new String("i")一样吗？
         *
         * 不一样，前者 声明在常量池，后者在 堆内存中，有2个对象
         * 
         */
    
    }
    
    @Test
    public void test9(){
        /**
         * 9. 如何将字符串反转？
         *
         * 用 reverse() 方法
         * StringBuilder str = new StringBuilder("abc");
         * str.reverse();
         *
         * 用 数组
         * 
         */
        StringBuilder str = new StringBuilder("abc");
        str.reverse();
        System.out.println(str.toString());
    
    }

    @Test
    public void test10(){
        /**
         * 10. String 类的常用方法都有那些？
         *
         * length()/indexOf()/charAt()/trim()/split()
         * /equals()/substring()/getBytes()/toLowerCase()/toUpperCase()
         * 
         */
    
    }
    
    @Test
    public void test11(){
        /**
         * 11. 抽象类必须要有抽象方法吗？
         *
         * 不必，有抽象方法的类 一定是抽象类
         * 
         */
    
    }

    @Test
    public void test12(){
        /**
         * 12. 普通类和抽象类有哪些区别？
         *
         * 抽象类不能实例化，   抽象类 可以有抽象方法，普通类没有
         * 
         */
    
    }
    
    @Test
    public void test13(){
        /**
         * 13. 抽象类能使用 final 修饰吗？
         *
         * 不能，抽象类需要被继承
         * 
         */
    
    }
    
    @Test
    public void test14(){
        /**
         * 14. 接口和抽象类有什么区别？
         * 和JDK版本有关
         *
         * 抽象类有构造器，接口没有构造器
         * 抽象类用来继承，接口用来实现
         * 一个类只能继承一个抽象类，一个类可以实现多个接口，类单继承，接口可多实现
         * 接口中方法一般是public 修饰， jdk8 接口中有默认方法，静态方法
         *
         * 
         */
    
    }
    
    @Test
    public void test15(){
        /**
         * 15. Java 中 IO 流分为几种？
         *
         * 字符流、字节流
         *
         * 输入流、输出流
         *
         * 包装流、节点流
         * 
         */
    
    }
    
    @Test
    public void test16(){
        /**
         * 16. BIO、NIO、AIO 有什么区别？
         *
         * BIO：同步阻塞式 IO，使用简单方便，并发处理能力低
         * NIO：同步非阻塞 IO，使用 通道通讯
         * AIO：实现了异步非堵塞 IO ，异步 IO 的操作基于事件和回调机制
         * 
         */
    
    }

    @Test
    public void test17(){
        /**
         * 17. Files的常用方法都有哪些？
         * 文件工具类
         * exists()/createFile()/createDirectory()/delete()size()
         * /read()/write()
         * 
         */
        //Files.exists();
    
    }
    
    @Test
    public void test18(){
        /**
         * 18. Java 容器都有哪些？
         *
         * Collection/Map 接口
         *
         * Collection：List(有序可重复) 与 Set(无序不可重复)
         *
         * List：ArrayList（数组）/LinkedList（链表）/Vector/Stack
         * Set：HashSet/LinkedHashSet/TreeSet
         *
         * Map：HashMap（数组+链表+红黑树）/LinkedHashMap/TreeMap/ConcurrentHashMap/Hashtable（key不为null）
         *
         * 
         */
    
    }
    
    @Test
    public void test19(){
        /**
         * 19. Collection 和 Collections 有什么区别？
         *
         * Collection 是接口，Collections 操作集合的工具类
         * 
         */
    
    }
    
    @Test
    public void test20(){
        /**
         * 20. List、Set、Map 之间的区别是什么？
         *
         * List/Set、Map  前者存储的是一个个值 Map存储的是键值对
         *
         * List 有序可重复  Set 无序不可重复 重写 hashCode()/equals() 方法
         * 
         */
    
    }

    @Test
    public void test21(){
        /**
         * 21. HashMap 和 Hashtable 有什么区别？
         *
         * HashMap 的 key 可为 null,Hashtable 的 key、value 不能为 null
         * HashMap 非线程安全，Hashtable 线程安全，性能不高，不推荐使用
         */
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("AA",null);
        System.out.println(hashtable.get("AA"));
    
    }

    @Test
    public void test22(){
        /**
         * 22. 如何决定使用 HashMap 还是 TreeMap？
         *
         * 对于在 Map 中插入、删除、定位一个元素这类操作，HashMap 是最好的选择，因为相对而言 HashMap 的插入会更快，
         * 但如果你要对一个 key 集合进行有序的遍历，那 TreeMap 是更好的选择。
         * 
         */
    
    }
    
    @Test
    public void test23(){
        /**
         * 23. 说一下 HashMap 的实现原理？
         *
         * HashMap 是基于hash算法实现的，通过 put(key,value)存储，get(key)来获取值。
         * 当传入key，HashMap 会计算出key的hash值，根据hash值将value 保存在 bucket里，
         * 如果有hash值相同称之为hash冲突，用链表和红黑树 存储相同key的value。
         * 冲突少使用链表否则使用红黑树。
         *
         *
         * The load factor used when none specified in constructor.
         * static final float DEFAULT_LOAD_FACTOR = 0.75f;
         *
         * DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
         *
         * 存储超过3/4 就会扩容
         * 
         */
        HashMap<String,Integer> map = new HashMap<>();
        map.put("AA",22);

    
    }

    @Test
    public void test24(){
        /**
         * 24. 说一下 HashSet 的实现原理？
         *
         * 基于HashMap 实现，value 为 null 
         * 
         */
    
    }
    
    @Test
    public void test25(){
        /**
         * 25. ArrayList 和 LinkedList 的区别是什么？
         * 数据结构：前者 动态数组 后者 双向链表
         * 访问效率：ArrayList 高于 LinkedList（需要移动指针从前往后依次查找）
         * 非首尾增加和删除效率：LinkedList 高于 ArrayList (操作影响其它数据下标)
         *
         * 推荐使用
         * 频繁读取：ArrayList
         * 频繁增删：LinkedList
         */
    
    }
    
    @Test
    public void test26(){
        /**
         * 26. 如何实现数组和 List 之间的转换？
         *
         * 数组-> List   Arrays.asList(array)
         * list-> 数组   list.toArray()
         */
    
    }

    @Test
    public void test27(){
        /**
         * 27. ArrayList 和 Vector 的区别是什么？
         *
         * ArrayList 非线程安全， Vector 线程安全
         * ArrayList 性能 高于 Vector
         * Vector 扩容每次会增加 1 倍，而 ArrayList 只会增加 50%
         * 
         */
    
    }
    
    @Test
    public void test28(){
        /**
         * 28. Array 和 ArrayList 有何区别？
         *
         * 数组可以存储基本数据类型和对象，List 只能存对象
         * 数组大小固定，ArrayList 可以扩容
         * 数组内置方法没有集合多
         */
    
    }
    
    @Test
    public void test29(){
        /**
         * 29. 在 Queue 中 poll()和 remove()有什么区别？
         *
         * 相同点：都是返回第一个元素，并在队列中删除返回的对象
         * 不同点：如果没有元素，poll 返回 null，remove 会抛出异常
         * 
         */

        Queue<String> queue = new LinkedList<>();
        queue.offer("AA");
        System.out.println(queue.remove());
        System.out.println(queue.poll());

    
    }
    
    @Test
    public void test30(){
        /**
         * 30. 哪些集合类是线程安全的？
         *
         * Vector/Hashtable/Stack  JUC:ConcurrentHashMap
         * 
         */
    
    }
}
