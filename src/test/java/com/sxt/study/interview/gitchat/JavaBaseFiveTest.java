package com.sxt.study.interview.gitchat;

import com.sxt.study.interview.InterviewApplicationTests;
import org.junit.Test;

/**
 * @author songj
 * @date 2019/8/28 8:08
 */
public class JavaBaseFiveTest extends InterviewApplicationTests {
    
    @Test
    public void test141(){
        /**
         * 141. RabbitMQ 怎么避免消息丢失？
         *
         * 把消息持久化磁盘，保证服务器重启消息不会丢失
         * 每个集群至少有一个物理磁盘，保证消息落入磁盘
         * 
         */
    
    }
    
    @Test
    public void test142(){
        /**
         * 142. 要保证消息持久化成功的条件有哪些？
         *
         * 声明队列设置持久化durable 为true
         * 消息推送投递模式设置持久化 deliveryMode 设置为 2（持久）
         * 消息已到达持久化交换器
         * 消息已到达持久化队列
         * 
         */
    
    }
    
    @Test
    public void test143(){
        /**
         * 143. RabbitMQ 持久化有什么缺点？
         *
         * 使用了磁盘存储，降低了服务器的吞吐量， 可使用ssd硬盘来缓解吞吐量的问题
         * 
         */
    
    }
    
    @Test
    public void test144(){
        /**
         * 144. RabbitMQ 有几种广播类型？
         * direct：发送方把消息发送给订阅方，如果有多个订阅者，默认采取轮询的方式进行消息发送
         * headers：与direct类似，但性能很差
         * fanout：分发模式，把消息分发给所有订阅者
         * topic：匹配订阅模式，使用正则匹配到消息队列，能匹配到的都能接收到
         *
         * 
         */
    
    }

    @Test
    public void test145(){
        /**
         * todo
         * 145. RabbitMQ 怎么实现延迟消息队列？
         *
         * 通过消息过期后进入死信交换器，再由交换器转发到延迟消费队列，实现延迟功能
         * 使用 RabbitMQ-delayed-message-exchange 插件实现延迟功能
         * 
         */
    
    }
    
    @Test
    public void test146(){
        /**
         * 146. RabbitMQ 集群有什么用？
         *
         * 高可用，某个服务器出现问题，RabbitMQ 还能正常工作
         * 高容量，集群可以承载更多的消息量
         * 
         */
    
    }
    
    @Test
    public void test147(){
        /**
         * 147. RabbitMQ 节点的类型有哪些？
         *
         * 磁盘节点：消息会存储到磁盘
         * 内存节点：消息存储在内存中，重启服务器消息丢失，性能高于磁盘类型
         * 
         */
    
    }

    @Test
    public void test148(){
        /**
         * 148. RabbitMQ 集群搭建需要注意哪些问题？
         *
         * 整个集群中包含一个磁盘节点
         * 各节点之间使用 "--link" 连接
         * 各节点之间使用 erlang cookie 值必须相同，用于各节点的认证
         * 
         */
    
    }
    
    @Test
    public void test149(){
        /**
         * 149. RabbitMQ 每个节点是其他节点的完整拷贝吗？为什么？
         *
         * 不是
         * 存储空间的考虑
         * 如果每个节点都拥有所有队列的完全拷贝，这样新增节点没有增加存储空间，反而增加了更多的冗余数据
         *
         * 性能的考虑
         * 如果每条消息都需要拷贝到所有节点，那么新增节点没有提升处理消息的能力
         * 
         */
    
    }
    
    @Test
    public void test150(){
        /**
         * 150. RabbitMQ 集群中唯一一个磁盘节点崩溃了会发生什么情况？
         * 不能进行以下操作
         *
         * 不能创建队列
         * 不能创建交换器
         * 不能创建绑定
         * 不能添加用户
         * 不能更改权限
         * 不能添加和删除集群节点
         *
         * 磁盘节点崩溃了，集群可以保持运行，但不能更改任何东西
         * 
         */
    
    }

    @Test
    public void test151(){
        /**
         * 151. RabbitMQ 对集群节点停止顺序有要求吗？
         *
         * 先停止 内存节点，再停止 磁盘节点
         * 
         */
    
    }
    
    @Test
    public void test152(){
        /**
         * 152. kafka 可以脱离 zookeeper 单独使用吗？为什么？
         *
         * 不能，zookeeper 管理和协调 kafka 的节点服务器
         * 
         */
    
    }

    @Test
    public void test153(){
        /**
         * 153. kafka 有几种数据保留的策略？
         *
         * kafka有2种数据保留的策略：按照过期时间保留 和 存储消息的大小保留
         * 
         */
    
    }

    @Test
    public void test154(){
        /**
         * 154. kafka 同时设置了 7 天和 10G 清除数据，到第五天的时候消息达到了 10G，这个时候 kafka 将如何处理？
         *
         * 清除数据
         * 
         */
    
    }

    @Test
    public void test155(){
        /**
         * 155. 什么情况会导致 kafka 运行变慢？
         *
         * CPU 性能瓶颈
         * 磁盘读写瓶颈
         * 网络瓶颈
         * 
         */
    
    }
    
    @Test
    public void test156(){
        /**
         * 156. 使用 kafka 集群需要注意什么？
         *
         * 集群的数量不是越多越好，最好不要超过7个，因为节点越多，消息复制需要的时间越多，整个群组的吞吐量越低
         *
         * 集群数量最好是单数，因为超过一半故障集群就不能用了
         * 
         */
    
    }

    @Test
    public void test157(){
        /**
         * 157. zookeeper 是什么？
         *
         * zookeeper 是分布式应用程序协调服务，为分布式应用提供一致性服务，
         * 包括：配置维护、域名服务、分布式同步、组服务等
         * 
         */
    
    }
    
    @Test
    public void test158(){
        /**
         * 158. zookeeper 都有哪些功能？
         *
         * 集群管理：监控节点存活状态，运行请求等
         * 主节点选举：主节点挂掉之后可以从备选的节点开始新一轮选举
         * 分布式锁：独占锁，一次只有一个线程占用资源；共享锁，读锁共享，读写互斥  有多个线程同时读同一个资源
         * 命名服务：在分布式系统中，通过命名服务，客户端应用能根据指定名字来获取资源或服务的地址，提供者等信息
         * 
         */
    
    }
    
    @Test
    public void test159(){
        /**
         * 159. zookeeper 有几种部署模式？
         *
         * 单机部署：一台服务器上运行
         * 集群部署：多台服务器上运行
         * 伪集群部署：一台服务器上运行多个zookeeper实例
         *
         * 
         */
    
    }
    
    @Test
    public void test160(){
        /**
         * 160. zookeeper 怎么保证主从节点的状态同步？
         *
         * zookeeper 的核心是原子广播，这个机制保证了各个server之间的同步。
         * 实现这个机制的协议叫zab协议。zab协议有两种模式，恢复模式（选主）和广播模式（同步）
         *
         * 
         */
    
    }
    
    @Test
    public void test161(){
        /**
         * 161. 集群中为什么要有主节点？
         *
         * 在分布式环境中，有些业务逻辑只需要在集群中的某一台机器进行执行，其它的机器可以共享这个结果
         * 这样可以大大减少重复计算，提高性能。
         * 
         */
    
    }
    
    @Test
    public void test162(){
        /**
         * 162. 集群中有 3 台服务器，其中一个节点宕机，这个时候 zookeeper 还可以使用吗？
         *
         * 还可以使用，单数服务器 没有超过1半宕机
         * 
         */
    
    }
    
    @Test
    public void test163(){
        /**
         * 163. 说一下 zookeeper 的通知机制？
         *
         * 客户端会对某个z node 建立一个watcher事件，当该z node变化时，
         * 这些客户端会收到zookeeper的通知，
         * 然后该客户端可以根据z node 变化做出业务上的改变
         * 
         */
    
    }

    @Test
    public void test164(){
        /**
         * 164. 数据库的三范式是什么？
         *
         * 第一范式：强调的是列的原子性，表的每一列不可分割
         * 第二范式：从属性完全依赖于主关键字，有主键，唯一识别每一行
         * 第三范式：任何非主属性不依赖于其它非主属性
         * 
         */
    
    }
    
    @Test
    public void test165(){
        /**
         * 165. 一张自增表里面总共有 7 条数据，删除了最后 2 条数据，重启 MySQL 数据库，又插入了一条数据，此时 id 是几？
         *
         * 表类型如果是 MyISAM ，那 id 就是 8。
         * 表类型如果是 InnoDB，那 id 就是 6,  把自增主键的最大ID保存在内存中，重启丢失
         * 
         */
    
    }
    
    @Test
    public void test166(){
        /**
         * 166. 如何获取当前数据库版本？
         *
         * select version() 
         * 
         */
    
    }
    
    @Test
    public void test167(){
        /**
         * 167. 说一下 ACID 是什么？
         *
         * 原子性：一个事务中的操作，要么全部完成，要么全不完成
         * 一致性：操作前后数据库的完整性没有被破坏
         * 隔离性：一个事务不能影响另一个事务执行
         * 持久性：事务提交后，对数据库的影响是永久性的
         * 
         */
    
    }
    
    @Test
    public void test168(){
        /**
         * 168. char 和 varchar 的区别是什么？
         *
         * char(n) 固定长度类型    效率高，占空间
         * varchar(n) 可变长度类型  值占用字节+记录长度字节
         * 
         */
    
    }
    
    @Test
    public void test169(){
        /**
         * 169. float 和 double 的区别是什么？
         *
         * float   4个字节
         * double  8个字节
         * 
         */
    
    }
    
    @Test
    public void test170(){
        /**
         * 170. MySQL 的内连接、左连接、右连接有什么区别？
         *
         * 左连接，以左边表为准
         * 右连接，以右边表为准
         *
         * 内连接，保留符合条件的数据
         * 
         */
    
    }
}
