mybatis-gen之java gui 学习
==============
可以到博客查看工具mybatis-generator简介,以及下载使用
 
博文地址: [mybatis-generator界面工具](http://javastar920905.coding.me/2019/05/mybatis-generator-gui/ )

> 想加一个生成controller和service 代码的功能,同时集成通用mapper 群里小伙伴说需要改源码,于是有了以下内容 

仔细观察了一下 resources下有fxml目录,用的JavaFX实现GUI.  
FXML是一种在JavaFX应用程序中定义用户界面的，基于XML的声明性标记语言


## 参考文档
* JavaFx
    * [JavaFX 教程 （中文）](https://code.makery.ch/zh-cn/library/javafx-tutorial/)
        * [安装使用Scene Builder](https://blog.csdn.net/u011781521/article/details/86632482) 官方下载很卡很慢 [腾讯微云 下载备份](https://share.weiyun.com/5pnIhSY) 
            * 可以使用Scene Builder 界面工具设计gui 
            * 在resources/MainUI.fxml 右键选择 *Open with Scene Builder*
    * [JavaFX中文资料](http://www.javafxchina.net/blog/docs/tutorial1/)
    * [java学习2-javafx写GUI程序1](https://blog.csdn.net/wengduke/article/details/85112877) 
    * [oracle文档](https://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-overview.htm)

* swing
    * [Java Swing 介绍 -菜鸟教程](https://www.runoob.com/w3cnote/java-swing-demo-intro.html)
    * [Java GUI编程](https://www.cnblogs.com/bahcelor/p/6626155.html)
    * [Java-GUI快速入门](https://blog.csdn.net/qq_42035966/article/details/82258199)
    * [java之 22天 GUI 图形界面编程(一)](https://www.cnblogs.com/fnlingnzb-learner/p/5953839.html)


## 目录结构介绍
```
config
logs    generator 生成日志
package 添加安装程序的图标
src
    bridge     mybatis 生成代码核心类(之后的controller service生成代码也在这)
    controller 控制器类(也就是应用程序的业务逻辑)
    exception
    model      模型实体类
    plugins    mybatis generator 插件自定义分页等
    util
    view       所有界面和控件类
    MainUI
pom.xml  使用javafx-maven-plugin 插件进行打包构建
```

## 用Scene Builder来设计你的界面
* resources/fxml 目录介绍
```
basicConnection.fxml  gui-数据库连接配置
generatorConfigs.fxml 
MainUI.fxml           gui-项目生成主,面板
newConnection.fxml
selectTableColumn.fxml  gui-选择列  面板
sshBasedConnection.fxml
```
   
* [入门demo](https://code.makery.ch/zh-cn/library/javafx-tutorial/part1/) 
创建FXML布局文件: 有两种方式来创建用户界面，一种是通过XML文件来定义，另外一种则是直接通过java代码来创建

```git
1 创建一个新*FXML Document* PersonOverview.fxml 
 * 修改属性 fx:controller="com.zzg.mybatis.generator.controller.PersonOverviewController"
 * 同时创建 PersonOverviewController
 * 用Scene Builder界面, 在resources/MainUI.fxml 右键选择 Open with Scene Builder
 
2 创建主应用程序选择 BorderPane 做为它的根节点
 * 创建一个 MainUI.java 用来加载 RootLayout.fxml ，同时添加 PersonOverview.fxml 到*RootLayout.fxml*中去
3 编写controller部分 https://code.makery.ch/zh-cn/library/javafx-tutorial/part2/
 * 实现 javafx.fxml.Initializable 接口
 
ok,javaFX 入门了. 能读懂项目代码,可以尝试添加生成功能了

```

## 针对spring boot 手脚架进行定制 [spring-boot-api-project-seed](https://github.com/java-frame/spring-boot-api-project-seed)
* [x] 自定义修改完成 [查看github  spring-boot-api-project-seed分支](https://github.com/javastar920905/mybatis-generator-gui/tree/spring-boot-api-project-seed) 
* [x] 添加生成controller和service 代码的功能  
* [x] 完善生成代码注释 [目录结构分析](http://localhost:3000/#/books/3.java/java_gui)

```
1 找到生成代码入口 MainUIController#generateCode
GeneratorConfig generatorConfig = getGeneratorConfigFromUI(); 从ui界面获取到的配置 保存在GeneratorConfig对象中

2 在 MybatisGeneratorBridge#generate 读取配置的属性,添加生成自定义代码功能

```


##  Java GUI编程简介
java中进行界面GUI开发，总共有四种方式
 * Awt

Awt是最早开发的界面库，为了满足跨平台的需要，达到“一次编写多处运行”的效果。在不同的系统下，使用系统的控件包装成统一的调用接口。但由于每个系统下面的控件不同，甚至，很多是缺失的。所以，效果并不太好。现在基本上没有人使用了。
 * Swing

为了解决Awt在不同系统下控件不一样的问题，开发了一套独立运行在Java虚拟机上的控件，这就是Swing。由于它完全独立于操作系统，所以，可以在各个系统下运行，并且基本一致。但是，由于是虚拟出来的控件，因此运行效率上稍微差一些，比较慢。另外，默认的界面比较丑，但是，有Look And Feel，类似css这种，可以通过配置修改显示效果。精通之后，可以做很多的效果出来，但是入门比较困难，开发效率也不高。
 * SWT

IBM为了开发Eclipse，开发出来的一套界面库，它基于Awt和Swing之间，效率等各方面，相当于各取了其中的一部分。已经不推荐使用了。
 * JavaFx
 
JavaFx是Java中的最新的界面库，Oracle开发的。有两种编写模式，一种是纯代码编写，一种是代码+FXML。纯代码好理解，代码+FXML是什么呢？如果熟悉html编程的话，就比较好理解了，相当于html+js来编写界面。当然，这两种方法都可以配合css来编写。
