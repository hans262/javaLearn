* ��ݼ�
ע�⣺alt+shift+j
���ɷ�����alt+shift+m
�Զ�import��ctrl+shift+o
�Զ����ɴ��룺alt+shift+s

* Maven
����ֿ� http://repo.maven.apache.org/maven2/
���ھ��� https://maven.aliyun.com/nexus/content/groups/public/

** �����ļ�
apache-maven-3.6.0/conf/settings.xml

** ���ھ��� <mirror>
��Ϊ����ֿ��ڹ��⣬�����ٶ���

** ���زֿ� <localRepository>
��Զ�ֿ̲�İ����ص����أ�����ÿ�ι�����Ŀ��Ҫ���ذ���

** eclipse����Maven

���maven��װλ��
window/Preferences/Maven/installations/Add => Maven�İ�װĿ¼

�޸��û�����Ŀ¼
window/Preferences/Maven/User Settings
ȫ�������� maven��װĿ¼��setting
�û������� maven�ֿⱣ����setting

����maven��Ŀ
New/project/Maven Maven Project
��ѡ create a simple project(skip archetype selection) ��������Ŀ������ԭ��ѡ��
Group Id: com.ck.mavenDemo ��Ŀȡ������ com.��˾��.��Ŀ��
Artifact Id: mavenDemo
Packaging: jar ����web��Ŀ��Ҫ����Ϊwar

�����������Ŀ
https://mvnrepository.com/
�����վȥ�ҵ�����

<dependencies>
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.10</version>
	    <scope>test</scope>
	</dependency>
</dependencies>



