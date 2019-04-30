# java 网络爬虫系列

# 参考文档
* [jsoup Cookbook(中文版)](https://www.open-open.com/jsoup/) 
* [Jsoup解析Html中文文档](https://www.cnblogs.com/jycboy/p/jsoupdoc.html)

# 实现过的demo


# 爬虫工具
* 简单爬虫jsoup
* 使用httpclient 实现爬虫
    * httpUrlConnection
    * okhttp 
    * httpClient
* webmagic 
* phantomjs 
* selenium

# 常见爬虫场景实现方式
* 无需登录
    * 无js混淆加密
    * js 混淆加密
* 需要登录
    * phantomjs 
    * selenium
    
# 爬虫实现步骤
* 了解待爬取目标网站(是否需要登录)
* 分析请求url
   * 请求参数分析
   * 请求头分析
   * 是否需要 cookie
* 请求重试
* 请求结果分析
   * 状态码,和返回值判断
   * 结果html解析
* 分页类处理

持续更新中...
    

