# 使用小白接口进行个人开发

## 一些常用免费api
* [发布一个对外api](http://api.wangshuwen.com/doc)
* [免费API接口汇总（不定时更新）](https://segmentfault.com/a/1190000017047048?utm_source=tag-newest)
* [免费开放接口API](https://blog.csdn.net/c__chao/article/details/78573737)
* [干货集中营 API 文档](http://gank.io/api)
* [获取随机背景图](https://www.cnblogs.com/zhibu/p/7158807.html)
* [开放获取Bing每日背景图片接口](https://blog.saintic.com/blog/240.html)
* [在线免费 小白api](https://www.yesapi.cn/docs/#/v2.0/README) 限量
  * <a href="/books.html" target="_blank">小白接口,实现一个站长工具箱demo</a>

##  [小白开放平台文档](http://www.yesapi.cn/docs/#/)  
- 小白接口，是免费，免开发，直接可用的云端API
- 拥有云端接口，免开发，随时随地调用
- 拥有数据小仓库，属于自己的数据库
- 在线小白开放平台，可视化管理，数据维护更轻松
- VIP用户，支持私人定制
- 不需要：申请域名、申请服务器、创建数据库、开发接口、开发后台……
![小白接口藏宝图](http://cdn7.phalapi.net/20180121010550_0d66e64fe53f9a2df7e50b3477fe2075)
  
## [在线免费 小白api](https://www.yesapi.cn/docs/#/v2.0/README) 入门教程
  - 无需开发可直接使用的[小白接口](http://api.yesapi.cn/docs.php?type=fold)
  - 注册小白开放平台账号,登录小白开放平台,使用邮箱接收 app_key和app_secrect
  - [模型数据管理(实质上是MySQL数据库的表)](http://www.yesapi.cn/docs/#/v2.0/model) 
    - 添加新的模型表links(链接表),点击用户名进入个人中心管理
    - 根据需求添加自定义字段(url,remarks,icon,custome_order)
    - 添加模型,添加修改字段描述都需要开通vip,设计表需谨慎 link_type:[{'type':'java','value':10}] 
    - 使用在线添加数据接口添加,测试数据; 温馨提示：UUID字段不为空时，需要提供uuid和token，才能通过小白接口获取该数据哦~ 

## 模型数据接口,在线调试. 
- [接口签名设置-总开关：全部小白接口](http://open.yesapi.cn/?r=App/ApisSignConfig)(初次测试时可关闭全部接口签名验证,)
- [查看我的接口域名 app_key和app_secrect](http://open.yesapi.cn/?r=App/Mine) 
- 导入postman 调试接口 (https://www.getpostman.com/collections/34e2d04b9ad770e14cfc)

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
```$xslt
http://hd215.api.yesapi.cn/?s=App.Table.FreeQuery&model_name=link&where=[["link_type","=",""]]&app_key=F7427CADEFF47A4368C87B334FC5C34F
```


### 直连数据库模型-直连接口 (http://api.yesapi.cn/docs.php?api=App.SuperTable) 
- **直连数据库模型,好像需要vip** 
- [通过原始SQL查库](http://api.yesapi.cn/docs.php?service=App.SuperTable.SqlQuery&detail=1&type=fold) 可以通过原始SQL语句，查询数据库，并返回全部结果集
```$xslt
 http://hd215.api.yesapi.cn/?s=App.SuperTable.SqlQuery&model_name=link&sql=select * from link limit 0, 3&app_key=F7427CADEFF47A4368C87B334FC5C34F
```

## 实用的Ext接口
- 二维码/条形码/ip/全国地址/模拟数据/银行卡/手机归属地/日期api...
- [翻译整段汉文为拼音接口](http://api.yesapi.cn/docs.php?api=Ext.Pinyin)
```$xslt
http://hd215.api.yesapi.cn/?s=Ext.Pinyin.Sentence&text=小白接口测试&app_key=F7427CADEFF47A4368C87B334FC5C34F
```

## 应用管理接口
- 会员模块接口 (http://api.yesapi.cn/docs.php?api=App.User)
- 邮件发送/cdn图片/图形验证码/微信集成