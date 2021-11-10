FROM maven:3.8.3-openjdk-11 as builder

WORKDIR /usr/src/mymaven
COPY . .

RUN mvn clean install -DskipTests -f . && mkdir /usr/src/wars/
RUN find . -iname '*.war' -exec cp {} /usr/src/wars/ \;

FROM tomcat:9.0.54-jre8
COPY --from=builder /usr/src/wars/* /usr/local/tomcat/webapps/
COPY tomcat-users.xml $CATALINA_HOME/conf/
