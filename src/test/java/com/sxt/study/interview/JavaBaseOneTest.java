package com.sxt.study.interview;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author songj
 * @date 2019/8/5 9:02
 */
public class JavaBaseOneTest extends InterviewApplicationTests {

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

    @Test
    public void test31(){
        /**
         * 31. 迭代器 Iterator 是什么？
         *
         * 遍历Collection集合的接口，允许在迭代时移除元素
         * 
         */
    
    }

    @Test
    public void test32(){
        /**
         * 32. Iterator 怎么使用？有什么特点？
         *
         * 使用更加安全，集合遍历时元素新增，会抛出异常 ConcurrentModificationException
         * 
         */

        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("Tom");
        list.add("Jack");
        list.add("Lucy");

        list.forEach(x-> System.out.println(x));
        System.out.println("---------------------");

        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            System.out.println(val);
            iterator.remove();
            list.add("M");

        }

        System.out.println("---------------------");
        list.forEach(x-> System.out.println(x));

    }
    
    @Test
    public void test33(){
        /**
         * 33. Iterator 和 ListIterator 有什么区别？
         *
         * Iterator 可以遍历 List和Set，ListIterator 只能遍历 List
         * Iterator 单向遍历，ListIterator 可以双向遍历
         * ListIterator 从 Iterator 接口继承
         * 
         */
    
    }

    @Test
    public void test34(){
        /**
         * 34. 怎么确保一个集合不能被修改？
         *
         * 可以使用 Collections. unmodifiableCollection(Collection c) 方法来创建一个只读集合，
         * 这样改变集合的任何操作都会抛出 Java. lang. UnsupportedOperationException 异常。
         * 
         */
    
    }
    
    @Test
    public void test35(){
        /**
         * 35. 并行和并发有什么区别？
         *
         * 并行：多个处理器或多核处理器同时处理多个任务。
         * 并发：多个任务在同一个CPU 核上，按细分的时间片轮流交替执行，从逻辑上看任务是同时执行
         * 
         */
    
    }
    
    @Test
    public void test36(){
        /**
         * 36. 线程和进程的区别？
         *
         * 一个程序运行至少有一个进程（分配系统资源的单位）
         *
         * 一个进程可以有多个线程
         *
         */
    
    }
    
    @Test
    public void test37(){
        /**
         * 37. 守护线程是什么？
         *
         * 运行在后台的一种特殊进程，如 垃圾回收线程
         * 它独立于控制终端并且周期性执行某种任务
         * 
         */
    
    }
    
    @Test
    public void test38(){
        /**
         * 38. 创建线程有哪几种方式？
         *
         * 继承 Thread 类 重写run方法
         *
         * 实现 Runnable 接口
         *
         * 实现 Callable 接口，有返回值
         *
         * 线程池创建
         * 
         */
    
    }
    
    @Test
    public void test39(){
        /**
         * 39. 说一下 runnable 和 callable 有什么区别？
         *
         * 前者没有返回值，后者有返回值
         *
         * 
         */
    
    }

    @Test
    public void test40(){
        /**
         * 40. 线程有哪些状态？
         *
         * NEW 新建
         * 就绪
         * 运行
         * 阻塞
         * 死亡
         *
         */
    
    }
    
    @Test
    public void test41(){
        /**
         * 41. sleep() 和 wait() 有什么区别？
         *
         * 定义的类不同： Thread.sleep() 、wait() 在Object 类定义
         *
         * sleep()不释放锁，wait() 释放锁
         *
         * sleep() 到时间自动恢复，wait() 需要 notify、notifyAll 唤醒
         * 
         */
    
    }
    
    @Test
    public void test42(){
        /**
         * 42. notify()和 notifyAll()有什么区别？
         *
         * notifyAll 唤醒所有线程，notify 唤醒一个线程
         * notifyAll 调用后，会将所有线程从等待池移到锁池，然后参与锁的竞争，获取锁后的线程继续执行，
         * 没有获取的等待释放后再次参与竞争
         * 
         */
    
    }
    
    @Test
    public void test43(){
        /**
         * 43. 线程的 run() 和 start() 有什么区别？
         *
         * start() 用于启动线程，run() 线程执行代码
         * start() 只能调用一次
         * 
         */
    
    }
    
    @Test
    public void test44(){
        /**
         * 44. 创建线程池有哪几种方式？
         *
         * ThreadPoolExecutor()
         * newSingleThreadExecutor()：它的特点在于工作线程数目被限制为 1
         * newCachedThreadPool()：它是一种用来处理大量短时间工作任务的线程池
         * newFixedThreadPool(int nThreads)：重用指定数目的线程
         *
         * newSingleThreadScheduledExecutor()：创建单线程池，可以进行定时或周期性的任务调度
         * newScheduledThreadPool(int corePoolSize)：创建指定数目线程，可以进行定时或周期性的任务调度
         * newWorkStealingPool(int parallelism)
         *
         * ThreadPoolExecutor()：是最原始的线程池创建
         * 
         */
        ExecutorService executorService = Executors.newFixedThreadPool(5);

    }

    @Test
    public void test45(){
        /**
         * 45. 线程池都有哪些状态？
         * RUNNING  接受新的任务，处理等待队列中的任务
         * SHUTDOWN 不接受新的任务提交，但是会继续处理等待队列中的任务
         * STOP   中断运行，不接受新的任务提交，不会继续处理等待队列中的任务
         * TIDYING：所有的任务都销毁了，workCount 为 0，线程池的状态在转换为 TIDYING 状态时，会执行钩子方法 terminated()。
         * TERMINATED：terminated()方法结束后，线程池的状态就会变成这个
         * 
         */
    
    }
    
    @Test
    public void test46(){
        /**
         * 46. 线程池中 submit() 和 execute() 方法有什么区别？
         *
         * execute() 只能执行 Runnable 型任务
         * submit() 执行Runnable/Callable 型任务
         * 
         */
    
    }

    @Test
    public void test47(){
        /**
         * 47. 在 Java 程序中怎么保证多线程的运行安全？
         *
         * 1.使用安全类 线程安全的类
         * 2.使用 synchronized 修饰代码块 和 方法
         * 3.使用 手动锁 Lock
         *
         * 
         */
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("获得锁。。。");

        } catch (Exception e) {

        } finally {
            System.out.println("释放锁。。。");
            lock.unlock();
        }
    }
    
    @Test
    public void test48(){
        /**
         * 48. 多线程中 synchronized 锁升级的原理是什么？
         *
         * synchronized 锁升级原理：在锁对象的对象头里面有一个 threadid 字段，在第一次访问的时候 threadid 为空，
         * jvm 让其持有偏向锁，并将 threadid 设置为其线程 id，
         * 再次进入的时候会先判断 threadid 是否与其线程 id 一致，
         * 如果一致则可以直接使用此对象，如果不一致，则升级偏向锁为轻量级锁，
         * 通过自旋循环一定次数来获取锁，执行一定次数之后，如果还没有正常获取到要使用的对象，
         * 此时就会把锁从轻量级升级为重量级锁，此过程就构成了 synchronized 锁的升级。
         * 锁的升级的目的：锁升级是为了减低了锁带来的性能消耗。
         * 在 Java 6 之后优化 synchronized 的实现方式，
         * 使用了偏向锁升级为轻量级锁再升级到重量级锁的方式，从而减低了锁带来的性能消耗。
         * 
         */
    
    }
    
    @Test
    public void test49(){
        /**
         * 49. 什么是死锁？
         *
         * 两个线程持有对方需要的锁资源都在等待对方先释放，发生阻塞从而导致死锁
         * 
         */
    
    }
    @Test
    public void test50(){
        /**
         * 50. 怎么防止死锁？
         * 1.使用并发的JUC安全类
         * 2.减少同步代码块的使用
         * 3.尽量使用 tryLock(long timeout, TimeUnit unit),设置超时时间
         * 4.降低锁的使用粒度，不要多个功能使用通一把锁
         * 
         */
    
    }
}
