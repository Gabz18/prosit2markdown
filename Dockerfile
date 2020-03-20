FROM maven:3.6.3-jdk-8

WORKDIR /app/mdprosit

COPY prositmarkdown-@project.version@-fat.jar mdprosit.jar

EXPOSE 8081

CMD java -jar mdprosit.jar