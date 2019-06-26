# BintrayDemo
直接用此demo需要修改在根目录下的gradle.properties的配置信息

1. BINTRAY_URL = 值替换成你自己的仓库地址 

2. USER_ORG = 值替换成你注册的bintray用户名

3. REPO_NAME  = 仓库名,在Bintray创建仓库后将名字替换成自己的

配置好后Terminal执行命令（mac系统前面加./）
```
gradlew clean build bintrayUpload -PbintrayUser=替换自己的用户名  -PbintrayKey=替换成自己的key  -PdryRun=false

```

运行app，弹出Bintray~的吐司表示远程仓库配置成功

[不知道用什么替换？ 点击看博客](https://blog.csdn.net/KwunYamShan/article/details/53262102)