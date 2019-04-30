# java 网络爬虫系列
# 爬虫工具
* 简单爬虫jsoup
* 使用httpclient 实现爬虫
    * httpUrlConnection
    * okhttp 
    * httpClient
* webmagic 
* phantomjs 
* selenium

# 常见爬虫场景
* 是否需登录
* 是否js混淆加密
* 是否有验证码
    * 能用户自己输入 就别识别了(爬取验证码,返回图片base64字符串)...
    * [打码兔-验证码识别](http://note.youdao.com/noteshare?id=7411bb857d66432420b9d6b67682026d&sub=6898DDE2A2114F95A3D423CD3C5D9ABF)
* 是否需要代理ip

 
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

# 实现过的demo
* [java-demo ](https://github.com/javastar920905/java-demo)(docTohtml,html2pdf,spider,code-identification 模块)
* [jsoup-demo](https://github.com/javastar920905/jsoup-demo)(私有)
* [webmagic做的爬虫示例程序](https://github.com/javastar920905/spider-webmagic)
* [selenium实现自动化登录测试](https://github.com/javastar920905/selenium-demo)
持续更新中...


# 参考文档
* jsoup
    * [Download and install jsoup](https://jsoup.org/download)
    * [jsoup Cookbook(中文版)](https://www.open-open.com/jsoup/) 
    * [Jsoup解析Html中文文档](https://www.cnblogs.com/jycboy/p/jsoupdoc.html)
* selenium
    * [selenium _安装入门实践](http://note.youdao.com/noteshare?id=44227005beaebfc34aa33d1bb08325d6&sub=E2CF139608024C6E97697F3A5635449B)
    * [常用 webDriver API](http://note.youdao.com/noteshare?id=2a3e36644c1678f9714ee4177ee8bcca&sub=12EB0068C89A49BAA5E0B7B7CF04C455)
    * [Selenium WebDriver实战宝典](https://share.weiyun.com/58vvzMx)
* html 转pdf image
    * [wkhtmltopdf](https://wkhtmltopdf.org/) 
       * 下载已经编译好的工具 https://wkhtmltopdf.org/downloads.html
       * 运行命令 wkhtmltopdf 或 wkhtmltoimage
       * 参考命令手册  https://wkhtmltopdf.org/usage/wkhtmltopdf.txt
       * 使用java 命令行调用 wkhtmltopdf toc test.html test.pdf 
    * [iText](https://www.oschina.net/code/snippet_128625_58201)
    * [html 转pdf库](https://pdfcrowd.com/doc/api/client-library/java/) (需要申请api key...收费)

<H3>网络爬虫</H3>
<li> <A HREF="http://note.youdao.com/noteshare?id=169f3e5b6d512bec03e556d39e8df1c1&sub=67BE055240F64C1BAA1A635F30EB2A59">js 混淆加密</A></li>
<li> <A HREF="http://note.youdao.com/noteshare?id=35813082a65d753ffb7d20dac573f184&sub=43A0490203794CD095765E525413E6E3">使用PhantomJS模拟用户操作_不解密混淆代码</A></li>
<li> <A HREF="http://webmagic.io/">WebMagic</A></li>
<li> <A HREF="http://www.cnblogs.com/yjmyzz/p/webmagic.html">基于webmagic的爬虫项目经验小结 - 菩提树下的杨过 - 博客园</A></li>
<li> <A HREF="https://www.oschina.net/p/crawler-samples">神箭手云爬虫首页、文档和下载 - 快速开发爬虫系统的云框架 - 开源中国社区</A></li>
<li> <A HREF="http://www.oschina.net/news/77402/19-java-open-source-web-crawler">玩大数据一定用得到的19款 Java 开源 Web 爬虫 - 开源中国社区</A></li>
<li> <A HREF="https://www.oschina.net/p/hawk-crawler">Hawk_Crawler首页、文档和下载 - 数据采集和清洗工具 - 开源中国社区</A></li>
<li> <A HREF="https://www.oschina.net/p/zerg">Zerg首页、文档和下载 - 基于docker的分布式爬虫服务 - 开源中国社区</A></li>
<li> <A HREF="https://www.oschina.net/p/gecco">GECCO首页、文档和下载 - 易用的轻量化的网络爬虫 - 开源中国社区</A></li>
<li> <A HREF="http://note.youdao.com/share/?id=e571b6c5b77055f57cbe3180f41589de&type=note#/">有道云笔记--获取xpath</A></li>
<li> <A HREF="http://www.w3school.com.cn/xpath/">XPath 教程</A></li>
<li> <A HREF="http://zvon.org/xxl/XPathTutorial/General/examples.html">XPath 教程</A></li>
<li> <A HREF="https://ke.qq.com/course/125925">Java大型企业级项目实战技术应用【六星教育】_腾讯课堂</A></li>

<H3>httpClient API</H3>
<li> <A HREF="http://hc.apache.org/httpclient-3.x/apidocs/">Overview (HttpClient 3.1 API)</A></li>
<li> <A HREF="http://blog.csdn.net/binyao02123202/article/details/8919897">Httpclient远程调用WebService示例（Eclipse+httpclient） - binyao02123202的专栏 - 博客频道 - CSDN.NET</A></li>

    

