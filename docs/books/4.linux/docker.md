# docker 资源
    Docker 是个划时代的开源项目，它彻底释放了计算虚拟化的威力，极大提高了应用的维护效率，降低了云计算应用开发的成本！
    使用 Docker，可以让应用的部署、测试和分发都变得前所未有的高效和轻松！
    无论是应用开发者、运维人员、还是其他信息技术从业人员，都有必要认识和掌握 Docker，节约有限的生命。
    
## 日常使用总结   
* [Docker 维护和容器日常清理](https://note.youdao.com/ynoteshare1/index.html?id=f2cb5e6b5e133e772f3e864812ca0ffe&type=note#/) 
* <A HREF="http://www.runoob.com/w3cnote/docker-tricks.html">一些docker的技巧和秘诀 | 菜鸟教程</A>
* [使用maven插件将服务打包成docker镜像](http://note.youdao.com/noteshare?id=fe2e5127a04da131a69f10f06baa1cdd&sub=54E033AD8BB94B7BAC9A69D0840D0164)
* [Docker 问答录（100 问）](https://blog.lab99.org/post/docker-2016-07-14-faq.html#ming-ming-docker-network-ls-zhong-kan-dao-liao-jian-li-de-overlay-wang-luo-zen-me-docker-run-huan-shuo-wang-luo-bu-cun-zai-a)
* [docker 参考手册](https://mongoding.github.io/2017/11/16/docker/)
* [配置https 证书](https://note.youdao.com/ynoteshare1/index.html?id=3c19040eabad596cbb8741a9fe722c5a&type=note#/)
* [周立的系列博客：Docker系列教程](http://itmuch.com/docker/00-docker-lession-index/) Docker系列教程的索引贴，覆盖：Docker基础、网络、存储、Docker Compose等，是一个完整的知识体系，望惠存。

### docker 安装
* <A HREF="http://www.runoob.com/docker/ubuntu-docker-install.html">Ubuntu Docker 安装 | 菜鸟教程</A>
* [ubuntu 16.x 安装docker](https://yeasy.gitbooks.io/docker_practice/content/install/ubuntu.html)
```
    * 卸载docker 
        sudo apt-get remove docker \
               docker-engine \
               docker.io
    * 安装docker,添加用户组
        curl -fsSL https://get.docker.com | bash -s docker --mirror Aliyun
        sudo usermod -aG docker  $USER
    * 启动docker daemon
        $ sudo systemctl enable docker  
        $ sudo systemctl start docker
    * 检查安装结果
        docker info
        docker run hello-world
```
* [启用国内镜像加速](https://yeasy.gitbooks.io/docker_practice/content/install/mirror.html)
    * 检查加速器是否生效 docker info 查看Registry Mirrors值 

## docker 资源
### 学习文档
* <A HREF="https://yq.aliyun.com/articles/40494?spm=5176.100239.blogcont65145.24.twiNjK">Docker学习路线图 (持续更新中)-博客-云栖社区-阿里云</A>
* [Docker — 从入门到实践](https://github.com/javastar920905/docker_practice) -- [点击gitbook在线阅读](https://yeasy.gitbooks.io/docker_practice/content/)
    * <A HREF="https://github.com/yeasy/docker_practice/blob/master/SUMMARY.md">Docker — 从入门到实践目录列表</A>
    * [“Docker入门与实践”课程讲义及参考](https://github.com/javastar920905/docker101)
* <A HREF="https://docs.docker.com/">Docker Documentation - 官方文档</A>
   * <A HREF="https://docs.docker.com/engine/reference/commandline/docker/">docker 命令行commands</A>
* <A HREF="http://note.youdao.com/share/?id=9fc3d574e708cc8fe258bf8ca58fff55&type=notebook#/">有道云笔记-docker</A>
* <A HREF="http://www.docker.org.cn/docker/71.html">程序猿，千万别说你不了解Docker！ - docker动态 - docker中文社区</A>
    * <A HREF="http://www.docker.org.cn/book/docker/what-is-docker-16.html">什么是Docker? - Docker入门教程 - docker中文社区</A>
    * <A HREF="http://www.docker.org.cn/page/resources.html">Docker资源 - docker中文社区</A>
    * <A HREF="http://dockone.io/article/111">Docker入门教程 - DockOne.io</A>
    * <A HREF="https://yq.aliyun.com/articles/65145?utm_campaign=docker&utm_medium=images&utm_source=oschina&utm_content=m_15176">【技术干货】Docker精华学习资料集锦，老司机快上车-博客-云栖社区-阿里云</A>
    * <A HREF="http://kb.cnblogs.com/page/536115/">Docker简明教程_知识库_博客园</A>
    * <A HREF="https://waylau.com/docker-spring-boot-gradle/">用 Docker、Gradle 来构建、运行、发布一个 Spring Boot 应用 | waylau.com</A>
    * <A HREF="https://www.tianmaying.com/tutorial/spring-boot-docker">在Docker容器中运行Spring Boot应用-docker,springboot,java 相关文章-天码营</A>
    * <A HREF="https://yq.aliyun.com/articles/2930?spm=5176.100239.blogcont40494.23.6Yh0Wi">在阿里云容器服务上创建一个spring boot应用-博客-云栖社区-阿里云</A>
    * <A HREF="https://yq.aliyun.com/articles/6894?spm=5176.100239.blogcont40494.22.6Yh0Wi">使用Docker运行Java Web应用-博客-云栖社区-阿里云</A>
* <A HREF="http://www.jikexueyuan.com/path/docker/">Docker开源引擎容器技术相关视频教程_Docker从入门到精通_Docker学习路线-极客学院</A>
    * <A HREF="http://www.jikexueyuan.com/course/docker/">Docker视频教程_Docker在线学习-极客学院</A>
    * <A HREF="http://wiki.jikexueyuan.com/project/docker-practice/">Docker 实践-极客学院Wiki</A>
    * <A HREF="http://wiki.jikexueyuan.com/project/docker/">Docker中文教程_Docker开发中文手册[PDF]下载-极客学院Wiki</A>
* <A HREF="https://www.toutiao.com/a6638893607975649796/">最全的 50+ 易用 Docker 工具列表指南！</A>
* docker
   * <A HREF="https://store.docker.com/">Docker Store</A> 搜索镜像
   * <A HREF="https://hub.docker.com/u/javastar920905/">https://hub.docker.com/u/javastar920905/ 个人镜像仓库</A>
* 常用image
   * <A HREF="http://www.alauda.cn/2015/09/01/docker-hub-image/">Docker Hub最受欢迎的10大镜像 | Alauda</A>
   * <A HREF="https://store.docker.com/images/3d5f71ad-2cc0-467f-ab6a-351e7adf404e?tab=description">tomcat - Docker Store</A>
   * <A HREF="https://github.com/docker-library/docs">docker-library/docs官方镜像库的文档</A>
   * <A HREF="https://store.docker.com/images/3083290a-203f-4c04-b2de-cc057959d2c9?tab=description">mysql - Docker Store</A>
   * <A HREF="https://store.docker.com/images/37b1dde7-a3e7-463a-a0e3-d8be2b136292?tab=description">Nginx - Docker Store</A>
   * <A HREF="https://store.docker.com/images/fa7625b4-fdca-4b48-b078-692f6451965a">rabbitmq - Docker Store</A>
   * <A HREF="https://store.docker.com/images/3f8fc4ce-eb8e-40ad-88ba-69e97299c64f?tab=description">sonarqube - Docker Store</A>
* docker容器备份
   * <A HREF="http://www.linuxidc.com/Linux/2015-08/121184.htm">Docker中容器的备份、恢复和迁移_服务器应用_Linux公社-Linux系统门户网站</A>
* docker 网络模型
   * <A HREF="https://yq.aliyun.com/articles/30345?spm=5176.100239.blogcont40494.28.6Yh0Wi">[翻译] 理解Docker容器网络-博客-云栖社区-阿里云</A>
   * <A HREF="https://yq.aliyun.com/articles/30328?spm=5176.100239.blogcont40494.29.6Yh0Wi">学习Docker容器网络模型 - 搭建分布式Zookeeper集群-博客-云栖社区-阿里云</A>
   * <A HREF="https://yq.aliyun.com/articles/2929?spm=5176.100239.blogcont40494.58.6Yh0Wi">容器服务是如何做到的跨主机的容器间通信？-博客-云栖社区-阿里云</A>
* docker 监控
   * <A HREF="https://yq.aliyun.com/articles/5065?spm=5176.100239.blogcont40494.48.6Yh0Wi">Docker监控：基于阿里云容器服务构建自己的Docker监控框架-博客-云栖社区-阿里云</A>

### dockerfile
   * <A HREF="http://www.ituring.com.cn/book/tupubarticle/6873">docker file 编写mysql redis_nginx容器</A>
   * <A HREF="https://www.imooc.com/learn/824">第一个docker化的java应用-慕课网</A>
   * <A HREF="http://www.yunweipai.com/archives/22216.html">Jenkins &amp; Docker在HULK的落地实践 – 运维派</A>
   * <A HREF="http://guide.daocloud.io/dcs">DaoCloud Services 文档 - DCS 文档</A>
   * <A HREF="http://dockone.io/article/255?spm=5176.100239.blogcont40494.27.6Yh0Wi">Dockerfile之优化经验浅谈 - DockOne.io</A>
   
   
### docker编排

<A HREF="http://www.tuicool.com/articles/2Ebemei">我们与Docker编排的故事 - 推酷</A> 了解容器编排概念

* 容器编排工具选择
    * <A HREF="https://www.zhihu.com/question/55391506/answer/144358251">docker 编排工具 2017最佳选择是 swarm/kubernetes/Mesos ？ - 知乎</A>
    * <A HREF="http://www.tuicool.com/articles/RZb6Zbb">Docker编排工具调研：Rancher - 推酷</A>
    * <A HREF="http://www.cnblogs.com/xinsheng/p/3803137.html">Mesos 入门教程 - SangS - 博客园</A>
* k8s
    * <A HREF="https://www.kubernetes.org.cn/k8s">Kubernetes（k8s）中文文档 Kubernetes概述_Kubernetes中文社区</A>
    * k8s 简介 
        * <A HREF="https://baijiahao.baidu.com/s?id=1602795888204860650&wfr=spider&for=pc">三小时攻克 Kubernetes！</A> 为什么要用k8s,示例介绍
        * <A HREF="http://www.cnblogs.com/xkops/p/6165565.html">k8s入门系列之介绍篇 - 韩德田 - 博客园</A> 概念介绍
        * <A HREF="http://blog.csdn.net/shanyongxu/article/details/51620605">K8s概念指南 - 见证大牛成长之路的专栏 - 博客频道 - CSDN.NET</A> Cluster,node,Pod等介绍
    * 在线书籍学习
        * <A HREF="https://github.com/opsnull/follow-me-install-kubernetes-cluster"> 和我一步步部署 kubernetes 集群</A> -- [gitbook 在线阅读](https://k8s-install.opsnull.com/)
        * <A HREF="https://github.com/rootsongjc/kubernetes-handbook">Kubernetes中文指南/云原生应用架构实践手册 </A> -- [gitbook 在线阅读](https://jimmysong.io/kubernetes-handbook/)
        * <A HREF="https://note.youdao.com/share/?id=6543e35628c1e09c4b933e66833f3024&type=notebook#/">k8s学习 有道云总结</A>
    * <A HREF="https://my.oschina.net/dxqr/blog/607854">kubernetes(k8s)搭建实践 - whaon</A>
    * [阿里云Kubernetes服务上搭建GitLab+Jenkins应用发布模型的实践](https://www.toutiao.com/a6688869821565633031/?tt_from=mobile_qq&utm_campaign=client_share&timestamp=1557551368&app=news_article&utm_source=mobile_qq&utm_medium=toutiao_android&req_id=20190511130927010023039038656CA90&group_id=6688869821565633031)


