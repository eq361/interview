package com.sxt.study.interview;

import org.junit.Test;

/**
 * @author songj
 * @date 2019/8/19 9:27
 */
public class JavaBaseFourTest extends InterviewApplicationTests {
    
    @Test
    public void test101(){
        /**
         * 101. spring mvc 有哪些组件？
         *
         * 前端控制器 DispatcherServlet
         * 映射控制器 HandlerMapping
         * 处理器    Controller
         * 模型和视图 ModelAndView
         * 视图解析器 ViewResolver
         * 
         */
    
    }
    
    @Test
    public void test102(){
        /**
         * 102. @RequestMapping 的作用是什么？
         * 将http请求映射在相应的类方法上
         * 
         */
    
    }

    @Test
    public void test103(){
        /**
         * 103. @Autowired 的作用是什么？
         * 对类成员变量、构造器、方法进行标注，完成自动装配
         * 可以消除 set/get 方法
         * 
         */
    
    }

    @Test
    public void test104(){
        /**
         * 104. 什么是 spring boot？
         * 通过  约定优于配置 的思想，对 Spring 进行再封装的 一个新框架
         * 用来简化 Spring应用 的初始搭建和开发过程的
         * 
         */
    
    }
    
    @Test
    public void test105(){
        /**
         * 105. 为什么要用 spring boot？
         *
         * 配置简单 无xml配置
         * 有内嵌容器 独立运行
         * 提供应用监控
         * 易上手，提高开发效率
         *
         */
    }

    @Test
    public void test106(){
        /**
         * 106. spring boot 核心配置文件是什么？
         *
         * application.properties/application.yml  自动化配置
         * bootstrap(.yml or .properties) 由父 ApplicationContext 加载的，
         * 比 application 优先加载，且 bootstrap 里面的属性不能被覆盖
         * 
         */
    
    }
    
    @Test
    public void test107(){
        /**
         * 107. spring boot 配置文件有哪几种类型？它们有什么区别？
         *
         * .properties 和 .yml  语法风格不同
         * @PropertySource 注解导入配置文件 .yml 不支持
         * 
         */
    
    }

    @Test
    public void test108(){
        /**
         * 108. spring boot 有哪些方式可以实现热部署？
         *
         * 使用 devtools 启动热部署，添加 devtools 库，
         * 在配置文件中把 spring. devtools. restart. enabled 设置为 true；
         * 使用 Intellij Idea 编辑器，勾上自动编译或手动重新编译
         * 
         */
    
    }
    
    @Test
    public void test109(){
        /**
         * 109. jpa 和 hibernate 有什么区别？
         * jpa Java Persistence API Java 持久化 接口规范
         * Hibernate 属于 JPA 规范的 实现
         * 
         */
    
    }
    
    @Test
    public void test110(){
        /**
         * 110. 什么是 spring cloud？
         *
         * 微服务架构一系列框架的有序集合
         * 利用SpringBoot开发的便利性简化了分布式系统基础设施的开发
         * 如 服务发现注册、负载均衡、配置中心、断路器、数据监控、消息总线
         * 
         */
    
    }
    
    @Test
    public void test111(){
        /**
         * 111. spring cloud 断路器的作用是什么？
         *
         * 当某个服务单元发生故障时，通过断路器的故障监控，向调用方返回一个错误响应，而不用长时间等待。
         * 这样就不会使得线程因调用故障服务被长时间占用而不释放，避免了故障在分布式系统中的蔓延。
         * 
         */
    
    }
    
    @Test
    public void test112(){
        /**
         * 112. spring cloud 的核心组件有哪些？
         *
         * Eureka: 服务治理   服务的注册与发现 服务监控
         * Ribbon: 客户端负载均衡 从一个服务的多台机器中选一台
         * Feign:  基于动态代理机制，根据注解和选择的机器，拼接请求URL地址，发起请求
         * Hystrix: 提供线程池，不同的服务走不同的线程池，实现了不同服务调用的隔离，避免了服务雪崩的问题
         * Zuul: 网关管理，由 Zuul 网关 将请求 转发给对应的服务
         * 
         */
    
    }

    @Test
    public void test113(){
        /**
         * 113. 为什么要使用 hibernate？
         *
         * Hibernate 是对 JDBC 的封装，简化了数据访问层的重复代码
         * Hibernate 是一个优秀的 ORM 框架，很大程度上简化了DAO的编码
         * 进行数据库移植方便，不用写SQL
         *
         * 
         */
    
    }
    
    @Test
    public void test114(){
        /**
         * 114. 什么是 ORM 框架？
         *
         * 数据持久层框架，对象关系映射  表-类  记录-对象
         * 优点：简化开发，开发更对象化，提高开发效率
         * 
         */
    
    }
    
    @Test
    public void test115(){
        /**
         * 115. hibernate 中如何在控制台查看打印的 SQL 语句？
         *
         *  配置文件里 hibernate.show_sql 设置为 true
         *  开发开启，生产关闭，开启后降低程序运行效率
         * 
         */
    
    }
    
    @Test
    public void test116(){
        /**
         * 116. hibernate 有几种查询方式？
         *
         * 支持hql语句、原生SQL、条件查询 Criteria
         * 
         */
    
    }

    @Test
    public void test117(){
        /**
         * 117. hibernate 实体类可以被定义为 final 吗？
         *
         * 定义为final 不能使用 hibernate 代理模式下的延迟关联
         * 不建议定义为final
         * 
         */
    
    }
    
    @Test
    public void test118(){
        /**
         * 118. 在 hibernate 中使用 Integer 和 int 做映射有什么区别？
         *
         * Integer 默认值为 null；int 默认值为 0，不能为null
         *
         * 
         */
    
    }
    
    @Test
    public void test119(){
        /**
         * 119. hibernate 是如何工作的？
         *
         * 读取并解析配置映射文件，创建 sessionFactory 对象
         * 创建 session 对象
         * 创建事务
         * 进行持久化操作
         * 提交事务
         * 关闭 session
         * 关闭 sessionFactory
         * 
         */
    
    }

    @Test
    public void test120(){
        /**
         * 120. get()和 load()的区别？
         *
         * 数据查询时，没 OID 的对象，get返回null,load 返回一个代理对象
         *
         * load 支持延迟加载，使用非主属性时 才发SQL 查数据库
         * get 不支持延迟加载
         * 
         */
    
    }

    @Test
    public void test121(){
        /**
         * 121. 说一下 hibernate 的缓存机制？
         *
         * 一级缓存：session缓存，只在session范围内有效，Hibernate自身维护，
         * clear()清除一级缓存中的所有缓存，flush()刷出缓存，evict(object)清除 object 的缓存
         * 二级缓存：应用级别的缓存，在所有session中都有效，支持配置第三方缓存，如：EhCache
         * 
         */
    
    }

    @Test
    public void test122(){
        /**
         * 122. hibernate 对象有哪些状态？
         *
         * 临时/瞬时状态：直接new出来的对象，该对象还没有被持久化，不受session管理
         * 持久化状态：当调用 Session 的 save/saveOrUpdate/get/load/list 等方法的时候，对象就是持久化状态
         * 游离状态：session关闭之后，对象就是游离状态
         * 
         */
    
    }
    
    @Test
    public void test123(){
        /**
         * 123. 在 hibernate 中 getCurrentSession 和 openSession 的区别是什么？
         * 前者会绑定当前线程，后者不会
         * 前者事务由Spring管理，不需要手动关闭；后者需要手动开启和提交事务
         * 
         */
    
    }

    @Test
    public void test124(){
        /**
         * 124. hibernate 实体类必须要有无参构造函数吗？为什么？
         *
         * 必须有无参构造器，需要用到反射 创建对象
         * 
         */
    
    }
    
    @Test
    public void test125(){
        /**
         * 125. MyBatis 中 #{}和 ${}的区别是什么？
         *
         * #{} 会预编译处理，防止SQL注入；${} 字符串替换，不会预编译处理，有SQL注入风险  order by ${}
         *
         * 在使用 #{}时，MyBatis 会将 SQL 中的 #{}替换成“?”，配合 PreparedStatement 的 set 方法赋值
         *
         * 
         */
    
    }
    
    @Test
    public void test126(){
        /**
         * 126. MyBatis 有几种分页方式？
         *
         * 逻辑分页、物理分页
         *
         * 逻辑分页：使用 MyBatis自带的 RowBounds进行分页，一次性查询很多数据，然后再在数据中检索
         *
         * 物理分页：手动写SQL分页 or 使用分页插件 PageHelper ，去数据库中查询指定条数的数据
         *
         * 
         */
    
    }

    @Test
    public void test127(){
        /**
         * 127. RowBounds 是一次性查询全部结果吗？为什么？
         *
         * 不是，mybatis是对JDBC的封装，JDBC有一个fetch size 的设置，JDBC 执行 next() 会再次获取数据
         * 可防止数据量过大导致内存溢出
         * 
         */
    
    }
    
    @Test
    public void test128(){
        /**
         * 128. MyBatis 逻辑分页和物理分页的区别是什么？
         *
         * 逻辑分页：使用 MyBatis自带的 RowBounds进行分页，一次性查询很多数据，然后再在数据中检索，
         * 消耗内存，有内存溢出风险，对数据库压力大
         *
         * 物理分页：手动写SQL分页 or 使用分页插件 PageHelper ，去数据库中查询指定条数的数据，对数据库压力较小
         * 
         */
    
    }
    
    @Test
    public void test129(){
        /**
         * 129. MyBatis 是否支持延迟加载？延迟加载的原理是什么？
         *
         * MyBatis 支持延迟加载，设置 lazyLoadingEnabled=true 即可
         *
         * 调用的时候触发加载，不在初始化的时候加载信息
         * 
         */
    
    }
    
    @Test
    public void test130(){
        /**
         * 130. 说一下 MyBatis 的一级缓存和二级缓存？
         *
         * 一级缓存：基于 PerpetualCache 的 HashMap 本地缓存，生命周期 和 SQLSession 一致,默认开启的
         *
         * 二级缓存：基于 PerpetualCache 的 HashMap 本地缓存，存储作用域为 mapper，多个SQLSession 可共享数据
         * 可自定义存储源，如Ehcache，需要手动开启，保存的对象 类要实现Serializable
         *
         * 开启二级缓存查询流程   二级缓存-一级缓存-数据库
         *
         * 缓存更新机制：当某一个作用域(一级缓存 Session/二级缓存 Mapper)进行了C/U/D 操作后，
         * 默认该作用域下所有 select 中的缓存将被 clear
         * 
         */
    
    }

    @Test
    public void test131(){
        /**
         * 131. MyBatis 和 hibernate 的区别有哪些？
         *
         * Hibernate 不用写SQL语句，MyBatis 要写SQL语句
         * MyBatis 比 Hibernate 灵活，可移植性没有 Hibernate 强，MyBatis 入门门槛要比 Hibernate 低
         *
         * Hibernate 有更好的二级缓存
         * 
         */
    
    }
    
    @Test
    public void test132(){
        /**
         * 132. MyBatis 有哪些执行器（Executor）？
         *
         * SimpleExecutor：每执行一次 数据库操作 就开启一个 Statement 对象，用完立刻关闭Statement对象
         *
         * ReuseExecutor：执行 数据库操作 以SQL作为key查找Statement对象，存在就使用，不存在就创建，
         * 用完后不关闭，放置于map内供下次使用。简而言之，就是重复使用Statement对象
         *
         * BatchExecutor：执行update，将所有SQL都存到批处理中，等待统一执行。
         * 它缓存了多个statement对象，与JDBC 批处理相同。
         * 
         */
    
    }

    @Test
    public void test133(){
        /**
         * 133. MyBatis 分页插件的实现原理是什么？
         *
         * 使用 MyBatis 提供的插件接口，实现自定义插件，在插件的拦截方法内拦截待执行的SQL，
         * 然后重写SQL，更加 dialect 方言，添加对应的物理分页语句和物理分页参数。
         * 
         */
    
    }

    @Test
    public void test134(){
        /**
         * 134. MyBatis 如何编写一个自定义插件？
         *
         * MyBatis 自定义插件针对 MyBatis 四大对象
         * （Executor、StatementHandler、ParameterHandler、ResultSetHandler）进行拦截：
         *
         * ResultSetHandler：拦截结果集的处理
         * ParameterHandler：拦截参数的处理
         * StatementHandler：拦截SQl语法构建的处理，Statement是直接和数据库执行SQL的对象，实现了MyBatis的一级缓存。
         * Executor：拦截内部执行器，负责调用StatementHandler操作数据库，并把结果集通过 ResultSetHandler 进行自动映射，
         * 另外它还处理了二级缓存的操作
         *
         * 实现 Interceptor 接口
         * 重写方法
         * 
         */
    
    }
    
    @Test
    public void test135(){
        /**
         * 135. RabbitMQ 的使用场景有哪些？
         *
         * 抢购活动，削峰填谷，防止系统崩溃
         *
         * 延迟信息处理，比如10min后给下单未付款用户发送邮件提醒
         *
         * 解耦系统，对于新增的功能，可以单独写模块扩展
         * 比如用户确认评价之后，新增了给用户返积分的功能，这个时候不用在业务代码里添加新增积分的功能，
         * 只需要把新增积分的接口订阅确认评价的消息队列即可，后面再添加任何功能只需要订阅对应的消息队列即可
         * 
         */
    
    }
    
    @Test
    public void test136(){
        /**
         * 136. RabbitMQ 有哪些重要的角色？
         *
         * 生产者、代理、消费者
         *
         * 生产者：消息的创建者，负责创建和推送数据到消息服务器
         * 消费者：消息的接收方，用于处理数据和确认消息
         * 代理：RabbitMQ本身，用于扮演 快递 角色
         * 
         */
    
    }

    @Test
    public void test137(){
        /**
         * 137. RabbitMQ 有哪些重要的组件？
         *
         * ConnectionFactory(连接管理器)：应用程序和RabbitMQ 建立连接的管理器
         * Channel(信道)：消息推送使用的通道
         * Exchange(交换器)：用于接收分配消息
         * Queue(对列)：用于存储生产者的消息
         * RoutingKey(路由键)：用于把生产者的数据分配到交换器上
         * BindingKey(绑定键)：用于把交换器的消息绑定到队列上
         * 
         */
    
    }
    
    @Test
    public void test138(){
        /**
         * 138. RabbitMQ 中 vhost 的作用是什么？
         *
         * 每个 RabbitMQ 都能创建很多 vhost，我们称之为虚拟主机，
         * 每个虚拟主机其实都是 mini 版的RabbitMQ，它拥有自己的队列，交换器 和 绑定，拥有自己的权限机制
         * 
         */
    
    }
    
    @Test
    public void test139(){
        /**
         * 139. RabbitMQ 的消息是怎么发送的？
         *
         * 首先 客户端 必须连接到 RabbitMQ 服务器 才能发布和消费消息
         * 客户端 和 RabbitMQ 服务器 之间会建立一个TCP连接，TCP连接打开并通过了认证， 会创建一条amqp信道
         * 发布消息和订阅队列都是通过这个信道完成的
         * 
         */
    
    }
    
    @Test
    public void test140(){
        /**
         * 140. RabbitMQ 怎么保证消息的稳定性？
         *
         * 提供事务的功能
         * 通过将channel 设置为 confirm 模式
         * 
         */
    
    }


}
