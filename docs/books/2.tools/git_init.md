# git 教程
<!-- tabs:start -->
#### ** git 学习资源 **

## git 入门教程
- [汇智网-互动方式在线学习练练手](http://xc.hubwiz.com/class/55d301543ad79a1b05dcc4e2/#1/1)
- <A HREF="http://backlogtool.com/git-guide/cn/">   猴子都能懂的GIT入门 | 贝格乐（Backlog）</A>
  - [Git索引](https://backlog.com/git-tutorial/cn/reference/) Git索引是从通过Git的操作来查找其具体方法 
- [廖雪峰的官方网站-Git教程](https://www.liaoxuefeng.com/wiki/896043488029600)
- <A HREF="http://rogerdudler.github.io/git-guide/index.zh.html" ADD_DATE="1511486152">git - 简易指南</A> 助你入门 git 的简明指南，木有高深内容 ;)。 
- <A HREF="http://www.runoob.com/git/git-basic-operations.html"  >Git 基本操作 | 菜鸟教程</A>  这是一个系列教程，包含分支、工作区暂存区区别、github、coding等
  - <A HREF="http://www.runoob.com/git/git-workspace-index-repo.html"   >Git 工作区、暂存区和版本库 | 菜鸟教程</A>
  - <A HREF="http://www.runoob.com/git/git-branch.html"   >Git 分支管理 | 菜鸟教程</A>
- <A HREF="https://github.com/flyhigher139/Git-Cheat-Sheet" >Git Cheat Sheet 中文版 --工作中用到的命令都包含了</A>
- <A HREF="http://www-cs-students.stanford.edu/~blynn/gitmagic/intl/zh_cn/ch01.html" >Git Magic - 第 1 章 入门</A>
- <A HREF="http://gitbook.liuhui998.com/index.html" >git 工作原理-Git Community Book 中文版</A>


## git 进阶
* <A HREF="http://www.ruanyifeng.com/blog/2017/08/issue.html" >如何使用 Issue 管理软件项目？ - 阮一峰的网络日志</A> Issue 和看板
- [场景式解读 Git 工作流](https://blog.coding.net/blog/git-workflow-2)
* [深入浅出 Git](https://blog.coding.net/blog/git-from-the-inside-out)
* [coding 博客-git 自救指南](https://blog.coding.net/blog/githandbuch)
* [Commit message 和 Change log 编写指南](https://blog.coding.net/blog/commit_message_change_log)
* [Feature Branch Workflow 实践](https://blog.coding.net/blog/feature-branch-workflow-practice)
* [Code Review 代码审阅初窥门径](https://blog.coding.net/blog/Code-Review)
* <A HREF="http://www.tuicool.com/articles/NzeQZz3"   >使用git rebase让历史变得清晰 - 推酷</A>


## 服务器安装gitlab
<li><A HREF="https://note.youdao.com/share/?id=a6e2fe66979e9ea3b54b48c8257bea52&type=note#/">gitlab 服务端安装_配置ssh key</A></li>

## github 和 codings
- [码云（Gitee.com）帮助文档](http://git.mydoc.io/undefined)
<li><A HREF="http://wiki.jikexueyuan.com/project/github-basics/the-introduction.html"    >GitHub 简介 - GitHub 使用手册 - 基础篇 - 极客学院Wiki</A></li>
<li><A HREF="http://wiki.jikexueyuan.com/project/github-basics/github-for-windows.html"  >GitHub for Windows - GitHub 使用手册 - 基础篇 - 极客学院Wiki</A></li>
<li><A HREF="https://github.com/integrations"   >git hub 其他开源项目</A></li>
<li><A HREF="http://www.ruanyifeng.com/blog/2017/07/pull_request.html" >Pull Request 的命令行管理 - 阮一峰的网络日志</A></li>

## svn
<li><A HREF="http://www.cnblogs.com/xiaobaihome/archive/2012/03/20/2407610.html" >SVN服务器搭建和使用（一） - xjbest - 博客园</A></li>
<li><A HREF="http://jingyan.baidu.com/article/93f9803fea9ff4e0e46f55f0.html" >svn安装与其服务器搭建_百度经验</A></li>

#### ** 常用命令备份 **

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

- <A HREF="https://blog.csdn.net/Dandelion_drq/article/details/50747892"  >git把某个文件去除版本控制 - CSDN博客</A>

## 解决git push每次需要输入密码问题
```
git config --global credential.helper store
```
这条命令之后执行一次push操作，这个时候还要输入账号密码，以后就不用了

## git 配置用户名
* 查看用户名和邮箱地址 git config user.name

* 修改用户名和邮箱地址
```
 git config  --global user.eamil  "username"
 git config  --global user.email  "email"
```

## 查看配置文件的位置

位置1:/etc/gitconfig

      系统级别的配置,适用于所有的用户和所有的库,可以使用 $git config --system 来指定和修改,存储在Git安装目录下

位置2:~/.gitconfig

      用户级别的配置,适用于当前登录的用户,可以使用$git config --gloabal来指定和修改,存储在C:\Documents and Settings\$USER下

## 使用git bash shell生成密钥 
ssh-keygen -t rsa -C “git 用户名“

(/c/Users/Administrator/.ssh/id_rsa): id_rsa和id_rsa.pub (把公钥给git管理员)

## 分支操作
* 推送本地分支到远程仓库
git push --set-upstream origin 分支名

* 远程仓库里拉取一条本地不存在的分支时
git checkout -b 本地分支名 origin/远程分支名


#### ** git 原理学习-待更新 **
## [git的内部存储结构](https://www.toutiao.com/a6697183062993666564/?tt_from=mobile_qq&utm_campaign=client_share&timestamp=1559541930&app=news_article&utm_source=mobile_qq&utm_medium=toutiao_android&req_id=2019060314053001002506614044853B9&group_id=6697183062993666564)
* Git的三个区+一个远程仓库
    * ①Remote：远程仓库，像github就是一个远程仓库。
    * ②Repository:本地仓库，通过git clone将远程仓库的代码下载到本地。代码库的元数据信息在根目录下的.git目录下。
    * ③Workspace：工作空间，就是我们写代码的目录。
    * ④Index：暂存区，指的是.git目录下的index文件。
    > * 在平时写完代码后, 执行git add 就是将变更的内容从工作空间提交到暂存区，
    > * git commit就是将暂存区的内容提交到本地代码库里，
    > * git push 就是将本地代码库的变更提交到远程仓库，
    > * 这时其他人就能通过pull 将你的变更下载到工作空间。
* .git的内部存储结构
    * hooks:是存储git钩子的目录，钩子是在特定事件发生时触发的脚本。比如：提交之前，提交之后。
    * info:是存储git信息的目录，比如排除特定后缀的文件.
    * objects:是存储git各种对象及内容的对象库，包含正常的和压缩后的。
    * refs:是存储git各种引用的目录，包含分支、远程分支和标签。
    * config:是代码库级别的配置文件。
    * HEAD:是代码库当前指向的分支，这里为master。


<!-- tabs:end -->



