参考文档：https://www.wolai.com/2vZn67BGbtGFXHcKnwRYbg



## 1、统一配置管理

application.properties

application.yml

功能参数说明：https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties



细节说明：

* 位置在resources文件夹下，必须命名为 application* 后缀为  .properties / .yaml /  .yml
* 如果同时存在application.properties | application.yml(.yaml) , properties的优先级更高



<font color=blue>**YAML配置文件使用**</font>

相比于 .properties 文件， .yaml 格式有以下优势：

* 层次结构
* 自我描述性
* 注释支持
* 多行文本
* 类型支持，YAML格式天然支持复杂的数据类型，如列表、映射等
* 更好的可读性

---

## 2、多环节配置和使用

1. 属性文件分离，将应用程序的配置参数分离到不同的属性文件中，例如可以创建 application-dev.properties、application-prod.properties和application-test.properties等文件。在这些文件中，可以定义各自环境的配置参数，如数据库连接信息、端口号等。然后，在application.properties中通过spring.profiles.active属性指定当前使用的环境。Spring Boot会根据该属性来加载对应环境的属性文件，覆盖默认的配置。
2. YAML配置文件：与属性文件类似，可以将配置参数分离到不同的YAML文件中，每个环境对应一个文件。例如，可以创建application-dev.yml、application-prod.yml和application-test.yml等文件。在这些文件中，可以使用YAML语法定义各自环境的配置参数。同样，通过spring.profiles.active属性指定当前的环境，Spring Boot会加载相应的YAML文件。
3. 命令行参数(动态)：可以通过命令行参数来指定当前的环境。例如，可以使用--spring.profiles.active=dev来指定使用开发环境的配置。



---



## 3、批量配置文件注入 

<font color=blue>@ConfigurationProperties </font>是SpringBoot提供的重要注解, 他可以将一些配置属性批量注入到bean对象。

单个属性绑定注入用<font color=blue> @Value </font>注解



---



## 4、SpringBoot3 整合 SpringMVC



1. 创建程序
2. 引入依赖
3. 创建启动类， @SpringBootApplication
4. 创建实体类
5. 编写Controller， 相关常用注解：
   1. @Controller	注册组件
   2. @RequestMapping  ：应用于控制器类和控制器方法，用于映射URL路径到特定的处理方法
   3. @GetMapping：将HTTP GET请求映射到特定的处理方法上
   4. @ResponseBody ：将控制器方法的返回值直接写入HTTP响应体，而不是将其视为视图名称进行解析

6. 访问测试



---

## 5、静态资源处理

默认的静态资源路径为：

* classpath:/META-INF/resources/
* classpath:/resources/
* classpath:/static/
* classpath:/public/

我们只要静态资源放在这些目录中任何一个，SpringMVC都会帮我们处理。 我们习惯会把静态资源放在classpath:/static/ 目录下。在resources目录下创建index.html文件。



---

## 6、SpringBoot3 整合 Druid 数据源

1. 创建程序
2. 引入依赖
3. 编写启动类
4. 添加配置文件：添加druid连接池的基本配置
5. 编写Controller
6. 启动测试

druid-spring-boot-3-starter目前最新版本是1.2.18，虽然适配了SpringBoot3，但缺少自动装配的配置文件，需要手动在resources目录下创建META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports，文件内容如下：

* com.alibaba.druid.spring.boot3.autoconfigure.DruidDataSourceAutoConfigure





















