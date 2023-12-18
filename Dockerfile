FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
RUN curl -sSL https://aws.oss.sonatype.org/content/repositories/snapshots/software/amazon/jdbc/aws-advanced-jdbc-wrapper/2.3.2-SNAPSHOT/aws-advanced-jdbc-wrapper-2.3.2-20231218.190120-18.jar -o aws-advanced-jdbc-wrapper.jar


ENTRYPOINT ["java","-jar","/app.jar"]
