FROM java:8
MAINTAINER brasilio <brasilio64@gmail.com>
VOLUME /tmp
ADD /home/docker-java-postgres/backend/target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
EXPOSE 8450
ENV JAVA_OPTS=""
RUN mvn clean install -DskipTests
RUN sh -c 'touch /backend-0.0.1-SNAPSHOT.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /backend-0.0.1-SNAPSHOT.jar" ]