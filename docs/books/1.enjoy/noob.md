# 使用小白接口进行个人开发
## 个人开发技术栈
* 开发工具 
  * [ git 教程](books/2.tools/git_init.md)
  - [ 使用coding 管理任务 一站式 DevOps](books/1.enjoy/2.coding.md) 在线开发,安装一次环境后,在网吧也能开发(适合小项目)
    - [合理使用公告,使用wiki 编写项目需求](https://dev.tencent.com/u/javastar920905/p/mdbook/wiki/4)
    - [任务看板](https://dev.tencent.com/u/javastar920905/p/mdbook/tasks/board) 建立一个短期目标里程碑
* 前端框架
  - [layui ](https://www.layui.com/) 本人java后台一枚,对vue,react 语法不是很了解,熟练jquery
    - [在线示例-组件效果预览](https://www.layui.com/demo/) 挺好用的工具
    - [layui 快速上手](https://www.layui.com/doc/) 下载1.5M
  - [uni-app](http://note.youdao.com/noteshare?id=a02b58aa60478a447d58105954122931&sub=5453E9D5AA14472F8F84F5F21FF2E944) 看中跨平台特性,小程序,pc
* 后台接口 使用小白开放平台 (适合小型项目,快速成型)
  - [小白接口大全](http://api.yesapi.cn/docs.php?type=fold) helloworld、会员模块、自定义数据模型[通用接口]....
  - [小白平台提供 接口在线调试工具](http://open.yesapi.cn/?r=Site/Debug) s参数为service的缩写
  - [集合元数据、计数器-数据选型攻略图 ](http://www.yesapi.cn/docs/#/v2.0/course_6?id=_3%E3%80%81%E7%B2%BE%E5%93%81%EF%BC%9A%E6%95%B0%E6%8D%AE%E9%80%89%E5%9E%8B%E6%94%BB%E7%95%A5%E5%9B%BE) 能不自己创建模型，就不创建了
    - [应用元数据模块](http://api.yesapi.cn/docs.php?keyword=main&channel=api)
    - [集合数据模块](http://api.yesapi.cn/docs.php?keyword=_set&channel=api) 应用,会员,游客,他人,用户(区别??)
  - [小白平台提供客户端管理界面](http://open.yesapi.cn/?r=Member/userManager ) 模型管理、会员与元数据管理、个人中心和接口签名设置、运营管家
* 成果展示
  * <a href="/books.html" target="_blank">小白接口,实现一个站长工具箱demo</a>  通过阅读上面内容，具备实现该功能的能力


## 一些常用免费api
* [发布一个对外api](http://api.wangshuwen.com/doc)
* [免费API接口汇总（不定时更新）](https://segmentfault.com/a/1190000017047048?utm_source=tag-newest)
* [免费开放接口API](https://blog.csdn.net/c__chao/article/details/78573737)
* [干货集中营 API 文档](http://gank.io/api)
* [获取随机背景图](https://www.cnblogs.com/zhibu/p/7158807.html)
* [开放获取Bing每日背景图片接口](https://blog.saintic.com/blog/240.html)

## [在线免费 小白api](https://www.yesapi.cn/docs/#/v2.0/README) 入门教程
* [**短视频-小姐姐教你如何上手小白开放平台**](http://www.yesapi.cn/docs/#/v2.0/video_2019)
  - 注册小白开放平台账号,登录小白开放平台,使用邮箱接收 app_key和app_secrect
  - 概念了解：（对于小白开放平台来说，我们就是客户端，需要接入小白平台开放的能力）
  - 签名生成原理，和很多开放平台（支付宝和微信差不多）
  - 三大元数据概念了解 （应用元数据，app_key的全局json对象；会员元数据，登录用户专属json对象）
  - [集合元数据、计数器-数据选型攻略图 ](http://www.yesapi.cn/docs/#/v2.0/course_6?id=_3%E3%80%81%E7%B2%BE%E5%93%81%EF%BC%9A%E6%95%B0%E6%8D%AE%E9%80%89%E5%9E%8B%E6%94%BB%E7%95%A5%E5%9B%BE) 能不自己创建模型，就不创建了
  - [小白平台提供客户端管理界面](http://open.yesapi.cn/?r=Member/userManager ) 模型管理、会员与元数据管理、个人中心和接口签名设置、运营管家
  - [小白平台提供在线调试工具](http://open.yesapi.cn/?r=Site/Debug)
  - [第八课数据模型之DIY接口](接口配置，限流，免登录等)
  - [常用sdk介绍](http://www.yesapi.cn/docs/#/v2.0/README?id=%E9%80%9A%E8%BF%87http%E8%AF%B7%E6%B1%82%E5%B0%8F%E7%99%BD%E6%8E%A5%E5%8F%A3) 通过HTTP请求小白接口
    - [YesApi Vue-Uniapp SDK](https://github.com/yesapicn/yesapi-vue-uniapp-sdk)
    - [YesApi 微信小程序 SDK（含商城项目源代码）](https://github.com/yesapicn/yesapi-miniprogram-1)
  - [模型数据管理(实质上是MySQL数据库的表)](http://www.yesapi.cn/docs/#/v2.0/model) 
    - 添加新的模型表links(链接表),点击用户名进入个人中心管理
    - 根据需求添加自定义字段(url,remarks,icon,custome_order)
    - 添加模型,添加修改字段描述都需要开通vip,设计表需谨慎 link_type:[{'type':'java','value':10}] 
    - 使用在线添加数据接口添加,测试数据; 温馨提示：UUID字段不为空时，需要提供uuid和token，才能通过小白接口获取该数据哦~ 

* 参考demo 进行开发
  * [迷你日记](http://www.yesapi.cn/docs/#/v2.0/demo_note) 学习登录注册
  * [发票助手](http://www.yesapi.cn/docs/#/v2.0/demo_fabiao)学习数据选型
  * [包车预约](http://www.yesapi.cn/docs/#/v2.0/demo_book) 更全面的demo
![小白接口开发流程](http://cdn7.okayapi.com/yesyesapi_20190407204536_e504ee805b36087810d187b469fa7150.png)



##  [小白开放平台文档](http://www.yesapi.cn/docs/#/)
- [小白开放平台开放的能力介绍](http://open.yesapi.cn/) 一站式解决方案、 小白开放平台和小白接口，适合做什么？  
- 小白接口，是免费，免开发，直接可用的云端API
- 拥有云端接口，免开发，随时随地调用
- 拥有数据小仓库，属于自己的数据库
- 在线小白开放平台，可视化管理，数据维护更轻松
- VIP用户，支持私人定制
- 不需要：申请域名、申请服务器、创建数据库、开发接口、开发后台……
![小白接口藏宝图](http://cdn7.phalapi.net/20180121010550_0d66e64fe53f9a2df7e50b3477fe2075)
  

## [模型数据接口,在线调试.](http://open.yesapi.cn/?r=Site/Debug)
- [小白接口大全](http://api.yesapi.cn/docs.php?type=fold)helloworld、会员模块、自定义数据模型[通用接口]....
- [接口签名设置-总开关：全部小白接口](http://open.yesapi.cn/?r=App/ApisSignConfig)(初次测试时可关闭全部接口签名验证,)
- [查看我的接口域名 app_key和app_secrect](http://open.yesapi.cn/?r=App/Mine) 
- 导入postman 调试接口 (https://www.getpostman.com/collections/34e2d04b9ad770e14cfc)

### 应用管理接口
- 会员模块接口 (http://api.yesapi.cn/docs.php?api=App.User)
- 邮件发送/cdn图片/图形验证码/微信集成
### 实用的Ext接口-无需开发可直接使用
- 二维码/条形码/ip/全国地址/模拟数据/银行卡/手机归属地/日期api...
- [翻译整段汉文为拼音接口](http://api.yesapi.cn/docs.php?api=Ext.Pinyin)

```$xslt
http://hd215.api.yesapi.cn/?s=Ext.Pinyin.Sentence&text=小白接口测试&app_key=F7427CADEFF47A4368C87B334FC5C34F
```
```$xslt
请求地址demo(静态网页开发关闭了sign验证,所以不需要传递sign字段):
http://hd215.api.yesapi.cn/?s=接口名&model_name=模型名称&app_key=F7427CADEFF47A4368C87B334FC5C34F

http://hd215.api.yesapi.cn/; 请求域名,每个人不同,到个人中心查看
s=App.Table.FreeQuery 接口名
model_name=模型名称
app_key=F7427CADEFF47A4368C87B334FC5C34F 个人中心查看
```
- hello world 接口 
```$xslt
http://hd215.api.yesapi.cn/?s=App.Hello.World&name=javabus.cn&app_key=F7427CADEFF47A4368C87B334FC5C34F
```


### 自定义模型-通用接口 (http://api.yesapi.cn/docs.php?api=App.Table) 
- **常用接口列举**
- [自由获取一条数据接口](http://api.yesapi.cn/docs.php?service=App.Table.FreeFindOne&detail=1&type=fold)  可以根据自定义的多个条件（AND或者OR），查找获取一条数据
```$xslt
http://hd215.api.yesapi.cn/?s=App.Table.FreeFindOne&model_name=link&where=[["link_type","=",""]]&app_key={你的app_key}&sign={动态签名}
```
- [列表查询-安全搜索查询接口](http://api.yesapi.cn/docs.php?service=App.Table.FreeQuery&detail=1&type=fold)可以根据自定义的多个条件（AND或者OR），进行快速且安全的搜索和查询。
- [数据库接口查询-语法说明](http://www.yesapi.cn/docs/#/v2.0/table_sql)
```$xslt
http://hd215.api.yesapi.cn/?s=App.Table.FreeQuery&model_name=link&where=[["link_type","=",""]]&app_key=F7427CADEFF47A4368C87B334FC5C34F
```


### 直连数据库模型-直连接口 (http://api.yesapi.cn/docs.php?api=App.SuperTable) 
- **[直连个人数据库-小白君视频介绍](https://www.bilibili.com/video/av45998778?from=search&seid=2383982856990787771)** model_name=数据表，不是数据库名
- [通过原始SQL查库](http://api.yesapi.cn/docs.php?service=App.SuperTable.SqlQuery&detail=1&type=fold) 可以通过原始SQL语句，查询数据库，并返回全部结果集
```$xslt
 http://hd215.api.yesapi.cn/?s=App.SuperTable.SqlQuery&model_name=link&sql=select * from link limit 0, 3&app_key=F7427CADEFF47A4368C87B334FC5C34F
```


