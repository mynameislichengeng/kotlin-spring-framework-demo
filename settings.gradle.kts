pluginManagement {
    repositories {
        // 阿里云 Gradle 插件镜像
        maven("https://maven.aliyun.com/repository/gradle-plugin")

        // Gradle 插件门户（备用）
        gradlePluginPortal()

        // 阿里云 Maven 中央仓库镜像
        maven("https://maven.aliyun.com/repository/public")

        // 本地 Maven 仓库
        mavenLocal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
    repositories {
        // 阿里云 Maven 中央仓库镜像
        maven("https://maven.aliyun.com/repository/public")

        // 阿里云 Google Maven 镜像（适用于 Android 项目）
        maven("https://maven.aliyun.com/repository/google")

        // 阿里云 Gradle 插件镜像
        maven("https://maven.aliyun.com/repository/gradle-plugin")

        // 本地 Maven 仓库
        mavenLocal()

        // Maven Central 仓库（备用）
        mavenCentral()
    }
}


rootProject.name = "kotlin-spring-framework-demo"
include("kotlin-spring-boot-start-demo")
