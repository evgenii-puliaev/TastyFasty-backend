dependencies {
    implementation(project(":data"))

    implementation("org.hibernate.validator:hibernate-validator:6.1.2.Final")
    implementation("org.springframework.boot:spring-boot-autoconfigure:2.2.5.RELEASE")
    implementation("org.mapstruct:mapstruct:1.3.1.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.3.1.Final")
}
