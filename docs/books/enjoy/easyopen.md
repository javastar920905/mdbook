# 使用easyopen 搭建开放平台

## easyopen 简介
一个简单易用的接口开放平台，平台封装了常用的参数校验、结果返回等功能，开发者只需实现业务代码即可

easyopen的功能类似于[淘宝开放平台](https://open.taobao.com/api.htm?docId=4&docType=2)，它的所有接口只提供一个url，通过参数来区分不同业务。这样做的好处是接口url管理方便了，平台管理者只需维护好接口参数即可。


## 参考文档
* [git 仓库](https://gitee.com/durcframework/easyopen)
* [参考文档](https://durcframework.gitee.io/easyopen)
* [easyopen入门介绍 有道云笔记](http://note.youdao.com/noteshare?id=f3e96ad5fcae4b1d206461c93305feea&sub=073458F601AD435D8D95A96F59FC4E2B)<a href="https://share.weiyun.com/5uxeUUl" sec="8kvdxs">.</a>
* 技术交流群  328419269

## 项目结构介绍
```
easyopen
    develop-doc  文档项目,可以编写自己项目的文档,已经发布到 easyopen开发文档  
    easyopen	      开放平台核心代码。jar包已发布到中央仓库
    easyopen-ext
        easyopen-ext-hystrix	Hystrix扩展
    easyopen-starter
        easyopen-spring-boot-starter  接口服务端starter
    easyopen-configuration  配置中心
        config-manager	配置中心界面，采用vue实现(更美观)-easyopen-config  对应的vue页面
        doc-manager		api文档管理界面，采用vue实现(更美观)-easyopen-server-manual对应的vue页面
        easyopen-config  	配置中心
        markdowndoc
    
    easyopen-demo
        easyopen-server-empty	接口服务器空项目demo，可在此基础上做开发。
        easyopen-server-ext	hystrix 熔断demo
        easyopen-server-manual     是开发者写接口的地方,对外开放的接口都写在这个项目中
        easyopen-server-normal      spring boot 项目demo,引入easyopen-spring-boot-starter 快速开发
        easyopen-server-springmvc  接口服务器springmvc实现版本
        easyopen-server-webflux	接口服务器 含有WebFlux例子
    easyopen-sdk        模拟服务调用者,调用开放平台注册的接口
        sdk-csharp	    C#对应的SDK
        sdk-java		开放平台对应的sdk，适用于Android
        sdk-javascript	开放平台对应的sdk，可适用于前端页面
        
1. 模块说明:
   * easyopen-server-manual 是开发者写接口的地方,对外开放的接口都写在这个项目中
   * easyopen-sdk 模拟服务调用者,调用开放平台注册的接口
2. 项目启动
   * 启动easyopen-demo下的easyopen-server-manual（业务代码在GoodsApi.java中）
   * 访问文档页面：http://localhost:8080/api/doc
   * 运行easyopen-sdk下的sdk-java中的SdkTest.java
3. 添加新的接口
   * 参考GoodsApi添加api接口

```

## 开始搭建开放平台项目
### 需要部署的模块
* open-api
    * config-server 配置中心,依赖数据库
    * doc-manager   vue项目,提供api界面
    * 对外提供服务的服务端,引入easyopen-spring-boot-starter
    * develop-doc   文档项目,独立部署,可以直接clone 当前项目,部署到github
    * open-api-sdk 提供zip包给调用方

1.2 使用docker 部署配置中心
      
      * [配置中心使用方法-参考文档](https://durcframework.gitee.io/easyopen/#/files/121_%E4%BD%BF%E7%94%A8%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83%EF%BC%88v1.10.0%EF%BC%89?id=%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83%E4%BD%BF%E7%94%A8%E6%96%B9%E6%B3%95)
      * 导入apiconf-demo.sql脚本
      * 配置application.properties
      * 启动后访问：http://localhost:8070/
      * 用户名密码:admin 123456  
      * [使用maven插件将服务打包成docker镜像](http://note.youdao.com/noteshare?id=fe2e5127a04da131a69f10f06baa1cdd&sub=54E033AD8BB94B7BAC9A69D0840D0164)
      
1.3 部署doc-manager 项目

      - 前提：先安装好npm，[npm安装教程](https://blog.csdn.net/zhangwenwu2/article/details/52778521)。建议使用淘宝镜像。
      - 打开config/dev.env.js，修改BASE_API变量
      - 启动配置中心(easyopen-config)
      * cnpm install cnpm run dev
      * npm run build 打包发布 
      * 把dist 目录发布到github pages 
      * 使用nginx 配置解决跨域 
  
1.4 对外提供服务的服务端,引入easyopen-spring-boot-starter
  * 添加maven 依赖
  * 基础配置
  
```
显示文档
easyopen.show-doc=true
关闭跨域，默认开启
easyopen.cors=false
开启webflux
easyopen.mono=false

拦截器
easyopen.interceptors[0]=com.gitee.easyopen.support.LimitInterceptor
easyopen.interceptors[1]=com.gitee.easyopen.support.PermissionInterceptor

配置中心,config-server-port对应easyopen-config中的netty.server.port
easyopen.app-name=open-service
easyopen.config-server-ip=javabus.cn
easyopen.config-server-port=8071
easyopen.doc-url=https://open.javabus.cn/module/api/doc

```
  
## easyopen-starter  帮我们做的工作
      pom.xml  中帮我们引入了 easyopen 依赖
      resources\META-INF\spring.factories 下会自动帮我们注册EasyopenAutoConfiguration类
      EasyopenAutoConfiguration会帮我们做一些默认配置 @EnableConfigurationProperties(EasyopenProperties.class)
      new ApiConfig()  可以使用@Bean方式覆盖该对象
      定义一个默认的 EayopenIndexController 
      application.properties中的配置会注入到EasyopenProperties中   (以easyopen开头的属性)
      application.properties 的配置示例可以参考 easyopen-server-normal 模块
