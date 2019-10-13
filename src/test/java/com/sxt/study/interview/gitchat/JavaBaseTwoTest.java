package com.sxt.study.interview.gitchat;

import com.sxt.study.interview.InterviewApplicationTests;
import org.junit.Test;

/**
 * @author songj
 * @date 2019/8/12 10:29
 */
public class JavaBaseTwoTest extends InterviewApplicationTests {
    @Test
    public void test51() {
        /**
         * 51. ThreadLocal 是什么？有哪些使用场景？
         *
         * 为每个使用ThreadLocal绑定变量的线程 提供一个独立的副本
         * 每一个线程都可以独立改变自己的副本，而不会影响其它线程所对应的副本
         *
         * 经典使用场景：数据库连接 和 session管理
         *
         */

    }
    
    @Test
    public void test52(){
        /**
         * 52. 说一下 synchronized 底层实现原理？
         *
         * synchronized 是由一对 monitor enter/monitor exit 指令实现的，monitor对象是同步的基本单元。
         * java6之前 依靠操作系统内部的互斥锁，性能低
         * java6重新设计，提供了3种实现，偏向锁，轻量级锁，重量级锁，大大改进了其性能
         * 
         */
    
    }

    @Test
    public void test53(){
        /**
         * 53. synchronized 和 volatile 的区别是什么？
         *
         * volatile 修饰变量，synchronized 修饰 代码块，方法
         * volatile 仅能实现变量的修改可见性，不能保证原子性，synchronized 能实现变量的修改可见性和操作原子性
         * volatile 不会造成线程阻塞，synchronized 可能造成线程阻塞
         * 
         */
    
    }
    
    @Test
    public void test54(){
        /**
         * 54. synchronized 和 Lock 有什么区别？
         *
         * synchronized 修饰 代码块，方法；lock 只能给代码块加锁
         * synchronized 不需要手动获取、释放锁，lock 需要手动获取和释放锁
         * 通lock可以知道有没有成功获取锁，synchronized 不行
         * 
         */
    
    }
    
    @Test
    public void test55(){
        /**
         * 55. synchronized 和 ReentrantLock 区别是什么？
         *
         * ReentrantLock 是Lock 的实现
         * synchronized 修饰代码块、方法；ReentrantLock 只能给代码块加锁
         * synchronized 不需要手动获取释放锁，ReentrantLock 需要手动获取释放
         * 
         * 
         */
    
    }
    
    @Test
    public void test56(){
        /**
         * 56. 说一下 atomic 的原理？
         * 利用CAS 和 volatile、native方法来保证原子操作，执行效率大大提高
         * 
         */
    
    }

    @Test
    public void test57(){
        /**
         * 57. 什么是反射？
         *
         * 在运行状态中，对于任一个类，都能知道这个类的属性和方法，对于任一个对象，都能调用它的方法和属性。
         * 这种动态获取信息和动态调用的方法的功能称为java语言的反射机制
         * 
         */
    
    }
    
    @Test
    public void test58(){
        /**
         * 58. 什么是 Java 序列化？什么情况下需要序列化？
         * java序列化 是保持各种对象在内存中的状态，并且可以从内存中再读出来
         *
         * 把内存中的对象保存到文件中
         * socket RMI 网络传输
         *
         * 
         */
    
    }

    @Test
    public void test59(){
        /**
         * 59. 动态代理是什么？有哪些应用？
         *
         * 运行时动态生成代理类
         * Spring AOP、Hibernate数据查询、mybatis mapper接口，java注解对象获取
         * 
         */
    
    }
    
    @Test
    public void test60(){
        /**
         * 60. 怎么实现动态代理？
         *
         * JDK 原生动态代理和 cglib 动态代理
         *
         * JDK 基于接口 实现
         * cglib 基于继承当前类的子类 实现
         * 
         */
    
    }
    
    @Test
    public void test61(){
        /**
         * 61. 为什么要使用克隆？
         * 克隆的对象可能包含一些已经修改过的属性，而new出来的对象的属性值还是初始化的值
         * 需要一个新的对象来保存当前对象的状态就要用克隆
         * 
         */
    
    }
    
    @Test
    public void test62(){
        /**
         * 62. 如何实现对象克隆？
         *
         * 实现 Cloneable 接口 重写 clone() 方法
         * 实现 Serializable 接口，通过对象的序列化和反序列化实现克隆，可实现真正的深度克隆
         * 
         */
    
    }

    @Test
    public void test63(){
        /**
         * 63. 深拷贝和浅拷贝区别是什么？
         *
         * 浅克隆：当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制。
         * 深克隆：除了对象本身被复制外，对象所包含的所有成员变量也将复制
         * 
         */
    
    }

    @Test
    public void test64(){
        /**
         * 64. JSP 和 servlet 有什么区别？
         *
         * JSP 本质上也是 servlet,
         * JSP 侧重于视图，servlet偏向于控制逻辑
         * JSP 可以是java代码和HTML的混合，servlet只能写java代码
         */
    
    }
    
    @Test
    public void test65(){
        /**
         * 65. JSP 有哪些内置对象？作用分别是什么？
         *
         * request: 封装客户端的请求
         * response:封装服务器对客户端的响应
         * pageContext: 通过该对象可以获取其它对象
         * session: 封装用户会话的对象
         * application: 封装服务器运行环境的对象
         * out: 输出服务器响应的输出流对象
         * config: web应用的配置对象
         * page: JSP页面本身
         * exception: 封装页面抛出的异常对象
         *
         * 
         */
    
    }
    
    @Test
    public void test66(){
        /**
         * 66. 说一下 JSP 的 4 种作用域？
         * page： 本页面
         * request：本次请求
         * session：本次会话
         * application：web应用全局作用域
         * 
         */
    
    }

    @Test
    public void test67(){
        /**
         * 67. session 和 cookie 有什么区别？
         * 存储位置不同，session在服务端，cookie在客户端
         * 安全性不同，cookie安全性一般，可以被伪造和修改
         * 容量和个数限制，cookie有容量限制，每个站点下cookie个数有限
         * 存储的多样性：session可以存在Redis、数据库、应用程序中，cookie只能在浏览器客户端
         * 
         */
    
    }

    @Test
    public void test68(){
        /**
         * 68. 说一下 session 的工作原理？
         *
         * 客户端登录完成后，服务端会创建对应的session，
         * session 创建完成后，会将sessionID返回给客户端，客户端再存储到浏览器中
         * 浏览器再次访问，会携带sessionID，服务器拿到sessionID，找到与之对应的session
         * 
         */
    
    }
    
    @Test
    public void test69(){
        /**
         * 69. 如果客户端禁止 cookie 能实现 session 还能用吗？
         * 可以URL中带sessionID
         * 
         */
    
    }
    
    @Test
    public void test70(){
        /**
         * 70. spring mvc 和 struts 的区别是什么？
         *
         * 拦截级别：Struts2 是类级别的拦截，SpringMVC是方法级别的拦截
         * 拦截机制：Struts2 是 interceptor机制 (filter)，SpringMVC 是 aop 方式（servlet）
         * 对ajax支持：SpringMVC @ResponseBody 实现，Struts2 需要插件或自己实现
         * 数据独立性：SpringMVC 方法之间基本独立，方法之间不共享变量，Struts2 action 是共享变量的
         * 
         */
    
    }
}
