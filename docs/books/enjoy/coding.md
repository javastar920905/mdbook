# 使用coding 管理任务 一站式 DevOps
> 需求构想 计划 开发 测试 发布交付

> 使用coding 管理任务 [coding 一站式 DevOps](https://coding.net/)

 

### 个人版本
* [腾讯云开发者平台](https://dev.tencent.com/user)
* [mdbook 项目主页](https://dev.tencent.com/u/javastar920905/p/mdbook)
    * 里程碑
    * 任务看板
    * 代码托管  merge request pages 服务
    * 文档管理 wiki 
        
### 企业版本 javabus 
* [demo 登录地址](https://javabus.coding.net)
  * 迭代  需求管理 任务管理  bug 管理  
  * 代码托管  持续集成 
  * 文档管理 wiki  文件 
  * 项目统计  项目公告 

### [云端开发环境 cloud studio](https://studio.dev.tencent.com/ws/blkpze)
* [点击帮助菜单 查看文档](https://dev.tencent.com/help/cloud-studio/faq)
* [安装常用插件](https://dev.tencent.com/help/cloud-studio/plugins) 
    * git-dirty-diff,git-line-history,CloudStudio-Plugin-Diff
* [ubuntu 系统; 内置git]; 
    *  cat /etc/os-release 查看系统版本
    *  mvn -v 查看maven java版本

### java 开发 切换java环境
  * java 1.8  maven 3.3.9(阿里云仓库)) (mvn -v 查看版本)
  * 先更新下源sudo apt-get update
  * sudo安装软件  (安装可能会失败,多尝试几次即可; 安装的软件下次进来还会存在)
  * [安装nodejs](/books/2.front🆚/front_learn.md)

  ```
    * sudo apt-get install nodejs (Ubuntu16下，使用apt-get下载的nodejs最新版本为v4.2.6)
    * sudo apt-get install npm
    * [升级nodejs,升级npm](https://blog.csdn.net/u010277553/article/details/80938829) 
        * sudo npm cache clean -f
        * sudo npm install -g n
        * sudo n stable
    * 使用淘宝cnpm 替换npm
        * npm install -g cnpm --registry=https://registry.npm.taobao.org
    * [npm 升级替换淘宝镜像](https://www.cnblogs.com/musings/p/8976074.html)
        * npm get registry  (返回https://registry.npmjs.org/)
        * 设置成淘宝的 npm config set registry http://registry.npm.taobao.org/
    * sudo cnpm i docsify-cli -g (安装docsify)
```
  * [安装docker](/books/4.linux☠/docker)

```
    * [ubuntu 16.x 安装docker](https://yeasy.gitbooks.io/docker_practice/content/install/ubuntu.html)
    * 卸载docker 
        * sudo apt-get remove docker \
               docker-engine \
               docker.io
    * 安装docker
        * curl -fsSL https://get.docker.com | bash -s docker --mirror Aliyun
        * sudo usermod -aG docker  $USER
    * 启动docker daemon
        * $ sudo systemctl enable docker  
        * sudo /lib/systemd/systemd-sysv-install enable docker
        * $ sudo systemctl start docker
    * 检查安装结果
        * docker info
        * docker run hello-world
    * 
    * [启用国内镜像加速]
        *检查加速器是否生效 docker info 查看Registry Mirrors值 (https://yeasy.gitbooks.io/docker_practice/content/install/mirror.html)
```
  * [运行java类 debug](https://dev.tencent.com/help/cloud-studio/java-debug)
    * 点击左上角cloud logo ，进入设置-语言服务器来选择项目类型和源代码目录。
    * mvn dependency:resolve
    * 将鼠标移动到编辑器要调试的行左侧，会出现红色的断点，点击它则在此行打上断点
    * 打开右侧的「调试」面板，点击绿色的三角形按钮开始调试


### 前端开发可以切换为node.js 环境
  * 先更新下源sudo apt-get update
  * sudo安装软件  (安装可能会killed失败,多尝试几次即可; 安装的软件下次进来还会存在)
  * cnpm 安装 
    * sudo npm install -g cnpm --registry=https://registry.npm.taobao.org
  * docsify 安装 
    * sudo cnpm i docsify-cli -g
    * docsify init ./docs  在项目的 ./docs 目录里写文档(已经初始化过的,不要再运行该命令,会覆盖已有内容)
    * docsify serve ./docs  运行一个本地服务器
  * 添加cloud外部访问链接(1h失效) 注意发布服务端口对应

 


