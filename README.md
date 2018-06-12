# Depens
Android Gradle Plugin、管理项目依赖

使用方式 ：[参考链接 https://blog.csdn.net/lisdye2/article/details/52292896]

可以直接看效果图:
![](./screenshot/img_1.1.png)


使用方式 ： 参照下图
![](./screenshot/img_1.1.png)

 根项目目录 ：
   classpath 'com.jfrog.bintray.gradle:gradle-bintray-plugin:1.7.3'

allprojects {
    apply plugin: 'com.depend'

    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
        maven {
            url  "https://dl.bintray.com/sharebysy/Depend"
        }
        google()
    }
