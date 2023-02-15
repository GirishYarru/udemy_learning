FROM openjdk:8

VOLUME /home/logs
COPY ./build/resources/main /home/resources/system.properties
COPY ./build/lib/TestProj-1.0-SNAPSHOT-all.jar /home/TestProj-1.0-SNAPSHOT-all.jar
CMD ["java","-jar","/home/TestProj-1.0-SNAPSHOT-all.jar"]