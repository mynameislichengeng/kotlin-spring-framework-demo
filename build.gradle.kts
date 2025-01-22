plugins {
    id("org.springframework.boot") version "3.4.1" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
    kotlin("jvm") version "2.1.0" apply false  // 更新到最新 Kotlin 版本
    kotlin("plugin.spring") version "2.1.0" apply false
}

allprojects {
    group = "com.lc.spring.framework"
    version = "1.0-SNAPSHOT"
}

subprojects {
    println("子项目${project.name}")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "kotlin")
    apply(plugin = "kotlin-spring")
    apply(plugin = "java")

    tasks.withType<Test> {
        useJUnitPlatform()
    }

}
