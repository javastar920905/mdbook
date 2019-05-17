# vue seo 技术调研
> 在我们项目中,一开始使用的是前后端分离方式开发的,前端用的vue. 现在资讯模块要求seo 优化.
做了以下技术调研

* 最后选择方案为资讯列表页和详情页使用后端改写,原因:
    * prerender预渲染方式,资讯详情页太多,不合适
    * 已有项目改造成nuxt,前端页面已经很多了,几十个模块,几百页面, 成本很大
    * nuxt 和vue多项目共存,表示可以尝试,(要解决header共用,项目间跳转等问题, nuxt浏览器api差异等 麻烦也不小)
    * 作为后端java开发,对freemarker 比较熟悉

### 什么是 seo?
* [wordpress 站点seo 探索](http://note.youdao.com/noteshare?id=4b3413380c098db1f44278badc248da8&sub=4E537CA163FB4D6E8B885FEB141E7321)
    * SEO是英文 Search Engine Optimization 的缩写，翻译成中文叫做“搜索引擎优化”。
    * 查看网站收录情况 (site:网站地址)

<H3>vue seo 技术调研 </H3>
<li> <A HREF="https://github.com/javastar920905/vue-demo/tree/master/nuxtdemo">vue seo 手脚架 nuxtdemo</A></li>
<li> <A HREF="https://zh.nuxtjs.org/guide">关于 Nuxt.js - Nuxt.js</A></li>
<li> <A HREF="https://segmentfault.com/q/1010000011824706/">公司让我用Vue.js做官网，需要考虑SEO的问题，如何进行开发比较好？ - SegmentFault 思否</A></li>
<li> <A HREF="https://segmentfault.com/q/1010000012093365">前端 - 自己用vue写了一个小网站,但是seo是个问题(本人后端) - SegmentFault 思否</A></li>
<li> <A HREF="https://www.jianshu.com/p/65b42f6215ff">Vue.js教程: 构建一个预渲染SEO友好的应用示例 [译] - 简书</A></li>
<li> <A HREF="http://www.speedcode.cn/ArticleDetail?id=88">Vue项目改造nuxt的详细教程</A></li>


### 后端 seo 方案
* [java 实现页面静态化](http://note.youdao.com/noteshare?id=3765767f7c61378158136915e4ba66b8&sub=66C8D60DE124459184B97DB9A3BB79BF)
* [freemaker 页面静态化 demo](http://note.youdao.com/noteshare?id=d6d3e8d8cd9ce6912e4cde6fc92eac6a&sub=135393D3EAB043A3BD0EFED83991FDF8)
    * 首页,文章资讯列表页,资讯页,使用freemarker 实现静态化
    * 点赞收藏等动作,使用jquery 重新实现
    * 前端大大下载 idea,maven 解析,启动spring boot项目进行开发预览


### [前端 vue seo 技术调研](http://note.youdao.com/noteshare?id=0398310da49330d472e94c6a77a30a82&sub=92E4D0C01D9E45F697BD49DEBA91C936)
* [预渲染的方式--- prerender-spa-plugin（解决SEO,首屏问题）](https://github.com/chrisvfritz/prerender-spa-plugin)
    * 适合用于改善少数营销页面（例如 /, /about, /contact 等）的SEO
    * [预渲染+用nginx代理来实现两个项目之间的跳转](http://www.cnblogs.com/Man-Dream-Necessary/p/10141717.html?tdsourcetag=s_pcqq_aiomsg)
* [vue------SSR (学习成本挺大-对于一个后端...)](https://ssr.vuejs.org/zh/)
* [vue------Nuxt.js](https://zh.nuxtjs.org/guide/directory-structure/) 服务端渲染 (SSR)
    * 使用服务器端渲染 (SSR) 时还需要有一些权衡之处
        * 开发条件所限。浏览器特定的代码，只能在某些生命周期钩子函数 (lifecycle hook) 中使用；
        * 一些外部扩展库 (external library) 可能需要特殊处理，才能在服务器渲染应用程序中运行。
        * 涉及构建设置和部署的更多要求。与可以部署在任何静态文件服务器上的完全静态单页面应用程序 (SPA) 不同，服务器渲染应用程序，需要处于 Node.js server 运行环境
    * NUXT为什么？ vue开发的SPA（单页应用）不利于搜索引擎的SEO优化。
    * NUXT适用于： Nuxt.js适合作新闻、博客、电影、资讯等需要搜索引擎提供流量的项目。


## 前端渲染和后端渲染方式对比

* 服务端渲染（SSR）

    > 后端渲染HTML的情况下，浏览器会直接接收到经过服务器计算之后的呈现给用户的最终的HTML字符串，这里的计算就是服务器经过解析存放在服务器端的模板文件来完成的，在这种情况下，浏览器只进行了HTML的解析，以及通过操作系统提供的操纵显示器显示内容的系统调用在显示器上把HTML所代表的图像显示给用户。
    
    * 好处：前端耗时少（前端只负责将html进行展示），利于SEO
    
    * 坏处：网络传输数据量大，占用（部分、少部分）服务器运算资源，response 出的数据量会（稍）大点，模板改了前端的交互和样式什么的一样得跟着联动修改 

* 客户端渲染（前端渲染CSR）------SPA---单页面应用

    > 前端渲染就是指浏览器会从后端得到一些信息，这些信息或许angularjs的模板文件，亦或是JSON等各种数据交换格式所包装的数据，甚至是直接的合法的HTML字符串。这些形式都不重要，重要的是，将这些信息组织排列形成最终可读的HTML字符串是由浏览器来完成的，在形成了HTML字符串之后，再进行显示。
    
    * 好处：网络传输数据量小（减少了服务器压力）
    
    * 坏处：前端耗时较多，不利于SEO  。由于传统的搜索引擎只会从 HTML 中抓取数据，导致前端渲染的页面无法被抓取。
    
    * 前端渲染遇到的问题---seo和首屏问题
        
        前端渲染常使用的 SPA 会把所有 JS 整体打包，无法忽视的问题就是文件太大，导致渲染前等待很长时间。特别是网速差的时候，让用户等待白屏结束并非一个很好的体验
