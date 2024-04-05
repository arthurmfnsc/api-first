plugins {
	java

	id("io.spring.dependency-management") version "1.1.4"
	id("org.openapi.generator") version "7.4.0" apply false
	id("org.springframework.boot") version "3.2.4"
}

apply(from = "plugins/java.gradle")
apply(from = "plugins/openapi.gradle")

group = "com.arthurfnsc"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	implementation("io.swagger.core.v3:swagger-core:2.2.21")
	implementation("org.hibernate.validator:hibernate-validator:7.0.1.Final")
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}