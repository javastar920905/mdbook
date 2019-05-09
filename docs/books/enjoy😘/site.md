## 开源建站 博客/cms/oa/
* [个人建站需要哪些准备](http://note.youdao.com/noteshare?id=bd97285d480a32c2f13487109bc36101&sub=3753245B841A47E8B1C6C56BDA739FCF)
    * 网站域名和空间 (个人可以使用github pages)
    * 域名备案,https 证书配置 (个人可省略)
    * 制作建设
    * 测试发布 DNS托管
    * 维护推广
    * [使用百度统计 统计访问量](https://tongji.baidu.com/web/24646268/overview/index?siteId=11315684)
    * [静态网站托管_cdn加速](http://note.youdao.com/noteshare?id=9d88babb53038493e87abf99fa65afc1&sub=BF71AB91CD544364BF0FD69A79FF3F0E)

## 建站工具
* [查看 Jekyll 文档](https://jekyllrb.com/) Jekyll 是一个简单的静态网站生产程序，使用 Jekyll 可快速地搭建项目页面、博客或是网站。
* [查看 Hexo 文档](https://hexo.io/zh-cn/) Hexo 是一个快速、简洁且高效的博客框架，您可利用靓丽的主题快速生成静态网页。
* [docsify 教程-有道云笔记](http://note.youdao.com/noteshare?id=b0ca41d567d3fb5eed648125119b3ad1&sub=DFBFB1BBA9A342FEB3F37F5D3FCCF185)  [docsify中文文档](https://docsify.js.org/#/zh-cn/quickstart)
* [fullpage.js 搭建官网](http://note.youdao.com/noteshare?id=391e00311724a9cda3548a87c23fa35b&sub=B85279C173114D698ED101F42C366F61)
* [layer弹出层插件](http://note.youdao.com/noteshare?id=1c2dad6ed53d889b137440ccee4b7434&sub=F40F7338C149484D9E5EB96C53986FFE)
* [使用 wordpress 建站 ](http://note.youdao.com/noteshare?id=9006452e0e69a4046488153996086a29)
   * <A HREF="https://rawgit.com/javastar920905/i/master/love/you.html#1">给媳妇的话</A>
   * <A HREF="https://cn.wordpress.org/">China 简体中文 — WordPress</A>
   * <A HREF="https://www.wpdaxue.com/tutorials/tips/">基础教程 | WordPress大学</A>
   * <A HREF="http://docs.ghostchina.com/zh/">Ghost使用指南 - Ghost中文文档</A>
   * <A HREF="https://my.ghost.org/account">ghost Account</A>
   * <A HREF="http://47.93.226.209:8081/">ouzhx-wp – 又一个WordPress站点</A>
* [GitHub加hexo搭建博客教程](http://note.youdao.com/noteshare?id=b47437906e1e2e44c794113c0eca7843&sub=BE762853AFDE458A963FD6D25B4ABB39)
* [Github Pages如何被百度收录-解析到coding pages](http://note.youdao.com/noteshare?id=3e252ad6a1535939e4d559844c84c77e&sub=8A566630E77242909E30ABA05D090BC1)

## 使用coding 管理任务
> 需求构想 计划 开发 测试 发布交付 javabus
* [coding 一站式 DevOps](https://coding.net/)
* 个人版本
    * [云端开发环境 cloud studio](https://studio.dev.tencent.com/ws/blkpze)
    * [登录地址](https://dev.tencent.com/user)
    * [mdbook 项目主页](https://dev.tencent.com/u/javastar920905/p/mdbook)
        * 里程碑
        * 任务看板
        * 代码托管  merge request pages 服务
        * 文档管理 wiki 
    * git-push到多个远程仓库,github,coding(针对git的push添加多个源 )
    * 部署服务地址 http://javastar920905.coding.me/mdbook/docs  http://www.javabus.cn/docs/#/
```
  git remote add origin https://git.dev.tencent.com/javastar920905/mdbook.git
  git push -u origin master
    
  git remote set-url --add origin https://github.com/javastar920905/mdbook.git 
  git remote set-url --add origin https://git.dev.tencent.com/javastar920905/mdbook.git
  git remote set-url --add --push origin https://git.dev.tencent.com/javastar920905/mdbook.git
  git remote -v
  可以进入.git/config发现origin下新加入了这个远程仓库的url
  git push origin就可以全部push到所有仓库 但是git pull 会出问题,只会pull第一个url的,
```
        
* 企业版本 javabus 
    * [demo 登录地址](https://javabus.coding.net)
    * 迭代  需求管理 任务管理  bug 管理  
    * 代码托管  持续集成 
    * 文档管理 wiki  文件 
    * 项目统计  项目公告 