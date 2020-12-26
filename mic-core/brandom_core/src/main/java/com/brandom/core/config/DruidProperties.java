package com.brandom.core.config;

import lombok.Getter;
import lombok.Setter;

/**
 * druid配置信息
 * 
 * 2019年2月23日下午12:00:38
 *
 * @author Wuwenchao
 *
 */
@Getter
@Setter
public class DruidProperties {

    private String name; // 配置这个属性的意义在于，如果存在多个数据源，监控的时候可以通过名字来区分开来
    private String url;
    private String username;
    private String password; // 连接数据库的密码。如果你不希望密码直接写在配置文件中，可以使用ConfigFilter。详细看这里：https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter
    private String driverClassName; // Druid会自动跟url识别驱动类名，如果连接的数据库非常见数据库，配置属性driverClassName
    private int initialSize; // 0
                             // 初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
    private int maxActive; // 8 最大连接数
    private int minIdle; //
    private int maxWait; // 获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。

    private boolean testOnBorrow = false; // true
                                          // 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
    private boolean testOnReturn = false; // false
                                          // 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
    private boolean testWhileIdle = true; // false
                                          // 建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
    private String validationQuery = "select 1"; // 用来检测连接是否有效的sql，要求是一个查询语句。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会其作用。

    // <!-- 配置一个连接在池中最小、最大生存的时间，单位是毫秒 -->
    private int minEvictableIdleTimeMillis; // 默认是1800000ms
    private int maxEvictableIdleTimeMillis; // 默认是25200000ms

    private int timeBetweenEvictionRunsMillis; // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒

    private boolean removeAbandoned = false; // 系统会进行无效的Connection的回收，回收的
                                             // Connection为removeAbandonedTimeout(默认300秒)中设置的秒数后没有使用的Connection，激活回收机制好像是getNumActive()=getMaxActive()-2

    private int removeAbandonedTimeout = 300;// 超时时间(以秒数为单位)

    private boolean logAbandoned = true; // 是否在自动回收超时连接的时候打印连接的超时错误

    private String filters = "stat,log4j"; //"wall"

}