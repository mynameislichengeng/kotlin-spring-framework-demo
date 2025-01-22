plugins {
    kotlin("jvm")
}

group = "com.lc.spring.framework"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}dependencies {
    // 子项目特定的依赖可以在这里添加
}
