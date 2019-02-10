* 快捷键
注解：alt+shift+j
生成方法：alt+shift+m
自动import：ctrl+shift+o
自动生成代码：alt+shift+s

* Maven
中央仓库 http://repo.maven.apache.org/maven2/
国内镜像 https://maven.aliyun.com/nexus/content/groups/public/

** 配置文件
apache-maven-3.6.0/conf/settings.xml

** 国内镜像 <mirror>
因为中央仓库在国外，下载速度慢

** 本地仓库 <localRepository>
把远程仓库的包下载到本地，不用每次构建项目都要下载包。

** eclipse配置Maven

添加maven安装位置
window/Preferences/Maven/installations/Add => Maven的安装目录

修改用户设置目录
window/Preferences/Maven/User Settings
全局设置用 maven安装目录的setting
用户设置用 maven仓库保留的setting

创建maven项目
New/project/Maven Maven Project
勾选 create a simple project(skip archetype selection) 创建简单项目（跳过原型选择）
Group Id: com.ck.mavenDemo 项目取名规则 com.公司名.项目名
Artifact Id: mavenDemo
Packaging: jar 创建web项目需要设置为war

添加依赖到项目
https://mvnrepository.com/
这个网站去找到依赖

<dependencies>
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.10</version>
	    <scope>test</scope>
	</dependency>
</dependencies>



