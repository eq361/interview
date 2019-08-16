package com.sxt.study.interview;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author songj
 * @date 2019/8/14 10:22
 */
public class JavaBaseThreeTest extends InterviewApplicationTests {
    
    @Test
    public void test71(){
        /**
         * 71. 如何避免 SQL 注入？
         *
         * 使用预处理 PreparedStatement
         * 使用正则表达式过滤字符串中的特殊字符
         *
         * 
         */
    
    }
    
    @Test
    public void test72(){
        /**
         * 72. 什么是 XSS 攻击，如何避免？
         * XSS:跨站脚本攻击，攻击者往web页面插入恶意的脚本代码，当用户访问该页面时会执行该脚本
         * 如何避免：对用户输入数据进行过滤
         * 
         */
    
    }

    @Test
    public void test73(){
        /**
         * 73. 什么是 CSRF 攻击，如何避免？
         *
         * 跨站请求伪造，攻击者盗用你的身份，以你的名义发送恶意请求
         *
         * 如何避免：
         * 验证请求来源地址
         * 关键操作添加验证码
         * 在请求地址添加token，并验证
         * 
         */
    
    }
    
    @Test
    public void test74() throws Exception{
        /**
         * 74. throw 和 throws 的区别？
         *
         * throw 抛出一个异常对象
         * throws 方法声明 抛出一个异常类型
         * 
         */
    
    }
    
    @Test
    public void test75(){
        /**
         * 75. final、finally、finalize 有什么区别？
         *
         * final 是修饰符，修饰类，表示类不能被继承，修饰方法，表示方法不能被重写，修饰变量，表示为常量
         * finally 用于异常处理，表示一定会执行的代码
         * finalize 垃圾回收时调用对象的此方法
         * 
         */
    
    }
    
    @Test
    public void test76(){
        /**
         * 76. try-catch-finally 中哪个部分可以省略？
         *
         * try{} catch(Exception e){}
         * try{} finally{}
         * 
         */
    
    }

    @Test
    public void test77(){
        /**
         * 77. try-catch-finally 中，如果 catch 中 return 了，finally 还会执行吗？
         *
         * 会执行
         * 
         */
    
    }
    
    @Test
    public void test78(){
        /**
         * 78. 常见的异常类有哪些？
         *
         * NullPointerException
         * ClassNotFundException
         * IOException
         * IndexOutOfBoundsException
         * NumberFormatException
         * FileNotFoundException
         * NoSuchMethodException
         * 
         */
    
    }

    @Test
    public void test79(){
        /**
         * 79. http 响应码 301 和 302 代表的是什么？有什么区别？
         *
         * 301：永久重定向。  SEO 更加有利
         * 302：暂时重定向。  有被提示为网络拦截的风险
         * 
         */
    
    }
    
    @Test
    public void test80(){
        /**
         * 80. forward 和 redirect 的区别？
         * forward 转发
         * redirect 重定向
         *
         * 地址栏URL： 转发不变，重定向改变
         * 数据共享： 转发能共享Request里数据，重定向不行
         * 转发比重定向（2次请求） 效率高
         *
         * 
         */
    }
    
    @Test
    public void test81(){
        /**
         * 81. 简述 tcp 和 udp的区别？
         *
         * OSI 传输层协议 TCP（传输控制协议）、UDP（用户数据报协议）
         * TCP 会经历3次握手，建立连接，UDP 不会建立连接
         * TCP 可靠数据传输，UDP 不可靠，无法保证
         * TCP 面向字节流，UDP 面向报文
         * TCP 传输慢，UDP 传输快
         *
         * 
         */
    
    }
    
    @Test
    public void test82(){
        /**
         * 82. tcp 为什么要三次握手，两次不行吗？为什么？
         *
         * 服务端：你好，我要建立连接可以吗？
         * 客户端：你好，可以的
         * 服务端：连接建立，发送数据：hello world！
         *
         * 服务端：客户端，我要给你发数据！
         * 服务端：建立连接，发送数据：hello Spring Cloud！。。。
         *
         *
         *
         * 如果采用两次握手，服务端发出确认数据包就会建立连接，但是客户端此时并未响应服务端请求，
         * 服务端会一直等待客户端，这样服务端会白白浪费资源。
         * 若采用三次握手，服务端没有收到客户端的确认，就知道客户端没有要求建立连接，
         * 就不会浪费服务器的资源。
         *
         * 
         */
    
    }
    
    @Test
    public void test83(){
        /**
         * 83. 说一下 tcp 粘包是怎么产生的？
         *
         * 发送端粘包：需要等缓冲区满才发送出去，造成粘包
         * 接收端粘包：接收端不及时接收缓冲区的包，造成多个包接收
         * 
         */
    
    }
    
    @Test
    public void test84(){
        /**
         * 84. OSI 的七层模型都有哪些？
         *
         * 物理层：利用传输介质为数据链路层提供物理连接，实现比特流的透明传输
         * 数据链路层：负责建立和管理节点间的链路
         * 网络层：通过路由选择算法，为报文或分组通过通信子网选择最适当的路径
         * 传输层：向用户提供可靠的端到端的差错和流量控制，保证报文的正确传输
         * 会话层：向两个实体的表示层提供建立和使用连接的方法
         * 表示层：处理用户信息的表示问题，如编码、数据格式转换和加密解密等
         * 应用层：直接向用户提供服务，完成用户希望在网络上完成的各种工作
         * 
         */
    
    }
    
    @Test
    public void test85(){
        /**
         * 85. get 和 post 请求有哪些区别？
         *
         * get 传参有限制，post 没有
         * get 请求会被浏览器主动缓存，post 不会
         * post 传参更安全，get 传参 在URL上
         * 
         */
    
    }

    @Test
    public void test86(){
        /**
         * 86. 如何实现跨域？
         *
         * 使用 jsonp 跨域
         * 服务器端运行跨域 设置 CORS 等于 *
         * 在单个接口使用注解 @CrossOrigin 运行跨域
         * 
         */
    
    }

    @Test
    public void test87(){
        /**
         * 87. 说一下 JSONP 实现原理？
         *
         * JSON with Padding
         * 利用 script 标签的 src 可以访问不同源
         * 加载远程返回的“JS函数” 来执行
         * 
         */
    
    }
    
    @Test
    public void test88(){
        /**
         * 88. 说一下你熟悉的设计模式？
         *
         * 单例模式       系统里创建唯一一个对象，节省系统开销
         * 代理模式       创建代理对象，方法增强
         * 模板方法模式   父类方法抽象功能，子类具体实现
         *
         * 工厂模式（简单工厂、抽象工厂） 解耦代码
         *
         * 策略模式
         * 
         */
    
    }
    
    @Test
    public void test89(){
        /**
         * 89. 简单工厂和抽象工厂有什么区别？
         *
         * 简单工厂：用来生产同一等级结构的任意产品，对于增加新的产品，无能为力
         * 工厂方法：用来生产同一等级结构中的固定产品，支持增加任意产品
         * 抽象工厂：用来生产不同产品族的全部产品，对于增加新的产品，无能为力；支持增加产品族
         *
         * 接口  实现接口的不同子类
         * 简单工厂模式：工厂方法根据 条件 创建不同的子类实例
         * 工厂方法：有一个工厂接口，不同的子工场实现类 创建 对应的 子类对象
         * 抽象工厂： 工厂接口 里有多个生产对象方法
         *
         *
         * 
         */
    
    }
    
    @Test
    public void test90(){
        /**
         * 90. 为什么要使用 Spring？
         *
         * 简化开发，提高开发效率
         * Spring IOC：管理应用 Bean 之间的关系 和 生命周期
         * Spring AOP：声明式事务支持，面向切面编程，更方便解决某一类问题
         * Spring MVC：对web开发的支持,视图组件支持
         * Spring Cache：对缓存的抽象
         * Spring 更方便和其它框架集成，如MyBatis
         *
         *
         *
         * 
         */
    
    }

    @Test
    public void test91(){
        /**
         * 91. 解释一下什么是 aop？
         *
         * 面向切面编程 把功能抽象为一个个的横切关注点，通过运行期动态代理来实现
         * 统一处理日志、异常
         * 
         */
    
    }

    @Test
    public void test92(){
        /**
         * 92. 解释一下什么是 ioc？
         * 控制反转 容器来管理 bean的生命周期 和 bean之间的关系
         * 
         */
    
    }
    
    @Test
    public void test93(){
        /**
         * 93. spring 有哪些主要模块？
         * Spring Core  IOC 和 DI
         * Spring Context
         * Spring Dao 提供了JDBC的抽象层
         * Spring AOP 面向切面编程
         * Spring Web
         * Spring MVC
         * 
         */
    
    }

    @Test
    public void test94(){
        /**
         * 94. spring 常用的注入方式有哪些？
         *
         * 构造器注入
         * setter 注入  applicationContext.xml 配置bean
         *
         * 注解方式注入  开启注解扫描
         * 
         */
    
    }

    @Test
    public void test95(){
        /**
         * 95. spring 中的 bean 是线程安全的吗？
         *
         * Spring 中 bean 默认是单例模式，没有对单例bean 做多线程封装处理
         * 如果bean 是无状态的（dao service），则认为是线程安全的
         * 如果bean 是有状态的（view model 对象），需要考虑线程安全问题（改变bean 的作用域 由 singleton 到 prototype）
         * 有状态 有数据存储功能，无状态 不保存数据
         * 
         */
    
    }
    
    @Test
    public void test96(){
        /**
         * 96. spring 支持几种 bean 的作用域？
         * singleton prototype
         * request session application(全局 session)
         * 
         */
    
    }
    
    @Test
    public void test97(){
        /**
         * 97. spring 自动装配 bean 有哪些方式？
         *
         * byName: 根据 bean 的名称
         * byType: 根据 bean 的类型
         *  @Autowire 默认按类型装配，也可以根据bean名称装配  @Qualifier("beanName")
         * 
         */
    
    }
    
    @Test
    public void test98(){
        /**
         * 98. spring 事务实现方式有哪些？
         *
         * 声明式事务  基于xml 配置、注解@Transactional
         *
         * 编程式事务
         * 
         */
    
    }

    @Test
    public void test99(){
        /**
         * 99. 说一下 spring 的事务隔离？
         * 默认值为 ISOLATION_DEFAULT（使用数据库的设置）
         *
         * ISOLATION READ UNCOMMITTED：未提交读 （会出现幻读、脏读、不可重复读）
         *
         * ISOLATION READ COMMITTED：提交读 一个事务提交后才能被其他事务读取到（会造成幻读、不可重复读），SQL server 的默认级别
         *
         * ISOLATION REPEATABLE READ：可重复读
         * 保证多次读取同一个数据时，其值都和事务开始时候的内容是一致，禁止读取到别的事务未提交的数据（会造成幻读），MySQL 的默认级别
         * 
         * ISOLATION_SERIALIZABLE：序列化
         * 
         */
    
    }
    
    @Test
    public void test100(){
        /**
         * 100. 说一下 spring mvc 运行流程？
         *
         * 1.先将请求 发送给 DispatcherServlet
         * 2.DispatcherServlet 查询 一个或多个 HandlerMapping，找到处理请求 的 controller 方法
         * 3.DispatcherServlet 将请求给 对应 controller 方法处理
         * 4.controller 进行业务逻辑 处理后，会返回一个ModelAndView
         * 5.DispatcherServlet 查询一个或多个视图解析器，找到 ModelAndView 指定的视图对象
         * 6.视图对象 渲染后 返回给客户端
         * 
         */
    
    }

}