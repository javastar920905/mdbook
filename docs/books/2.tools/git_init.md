# git 教程

## git 教程 (github&amp;github&amp;svn)
<li><A HREF="https://note.youdao.com/share/?id=a6e2fe66979e9ea3b54b48c8257bea52&type=note#/">gitlab 服务端安装_配置ssh key</A></li>
<li><A HREF="http://rogerdudler.github.io/git-guide/index.zh.html" ADD_DATE="1511486152">git - 简易指南</A></li>
<li><A HREF="http://www.bootcss.com/p/git-guide/" >git 使用简易指南</A></li>
<li><A HREF="http://www.runoob.com/git/git-basic-operations.html"  >Git 基本操作 | 菜鸟教程</A></li>
<li><A HREF="http://www.runoob.com/git/git-workspace-index-repo.html"   >Git 工作区、暂存区和版本库 | 菜鸟教程</A></li>
<li><A HREF="http://www.runoob.com/git/git-branch.html"   >Git 分支管理 | 菜鸟教程</A></li>
<li><A HREF="http://backlogtool.com/git-guide/cn/">   猴子都能懂的GIT入门 | 贝格乐（Backlog）</A></li>
<li><A HREF="http://www.cnblogs.com/elvalad/p/4066133.html"    >git rebase使用 - elvalad - 博客园</A></li>
<li><A HREF="http://www.tuicool.com/articles/NzeQZz3"   >使用git rebase让历史变得清晰 - 推酷</A></li>
<li><A HREF="http://www.ruanyifeng.com/blog/2017/08/issue.html"    >如何使用 Issue 管理软件项目？ - 阮一峰的网络日志</A></li>
<li><A HREF="http://www.ruanyifeng.com/blog/2017/07/pull_request.html" >Pull Request 的命令行管理 - 阮一峰的网络日志</A></li>
<li><A HREF="https://github.com/flyhigher139/Git-Cheat-Sheet" >git工作中用到的命令都包含了</A></li>
<li><A HREF="http://note.youdao.com/share/?id=8b323b3626b87ee05b81d5d11745ba8a&type=notebook#/3F210255CC384E4BA67B1FB78E47DFF2" >0-2git安装教程 有道云总结</A></li>
<li><A HREF="https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000/001373962845513aefd77a99f4145f0a2c7a7ca057e7570000" >Git简介 - 廖雪峰的官方网站</A></li>
<li><A HREF="http://www-cs-students.stanford.edu/~blynn/gitmagic/intl/zh_cn/ch01.html" >Git Magic - 第 1 章 入门</A></li>
<li><A HREF="http://gitbook.liuhui998.com/index.html" >git 工作原理-Git Community Book 中文版</A></li>
<li><A HREF="https://www.jianshu.com/p/5a4571df2305" >Git的https模式避免重复输入密码 - 简书</A></li>
<li><A HREF="https://blog.csdn.net/Dandelion_drq/article/details/50747892"  >git把某个文件去除版本控制 - CSDN博客</A></li>
<li><A HREF="http://www.cnblogs.com/xiaobaihome/archive/2012/03/20/2407610.html" >SVN服务器搭建和使用（一） - xjbest - 博客园</A></li>
<li><A HREF="http://jingyan.baidu.com/article/93f9803fea9ff4e0e46f55f0.html" >svn安装与其服务器搭建_百度经验</A></li>

## github 初始化
<li><A HREF="http://wiki.jikexueyuan.com/project/github-basics/the-introduction.html"    >GitHub 简介 - GitHub 使用手册 - 基础篇 - 极客学院Wiki</A></li>
<li><A HREF="http://wiki.jikexueyuan.com/project/github-basics/github-for-windows.html"  >GitHub for Windows - GitHub 使用手册 - 基础篇 - 极客学院Wiki</A></li>
<li><A HREF="https://github.com/integrations"   >git hub 其他开源项目</A></li>



## …or create a new repository on the command line
```
echo "# mdbook" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/javastar920905/mdbook.git
git push -u origin master
```
## …or push an existing repository from the command line
```
git remote add origin https://github.com/javastar920905/mdbook.git
git push -u origin master
```
## 移除现有origin
```
git remote -v
git remote remove origin
```

## 解决git push每次需要输入密码问题
```
git config --global credential.helper store
```
这条命令之后执行一次push操作，这个时候还要输入账号密码，以后就不用了

## git 配置用户名
* 查看用户名和邮箱地址 git config user.name

* 修改用户名和邮箱地址
 git config --global user.name "username"
 
 git config --global user.email "email"

* 查看配置文件的位置

位置1:/etc/gitconfig

      系统级别的配置,适用于所有的用户和所有的库,可以使用 $git config --system 来指定和修改,存储在Git安装目录下

位置2:~/.gitconfig

      用户级别的配置,适用于当前登录的用户,可以使用$git config --gloabal来指定和修改,存储在C:\Documents and Settings\$USER下

## 使用git bash shell生成密钥 
ssh-keygen -t rsa -C “git 用户名“

(/c/Users/Administrator/.ssh/id_rsa): id_rsa和id_rsa.pub (把公钥给git管理员)


