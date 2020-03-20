FROM maven:3.6.3-jdk-8

WORKDIR /app/mdprosit

COPY prositmarkdown-@project.version@-fat.jar mdprosit.jar

CMD java -jar mdprosit.jar