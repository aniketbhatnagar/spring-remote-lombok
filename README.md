Reproduces a bug that pulls in older version of Spring when spring-boot-starter-remote-shell is added as dependency.

Steps to reproduce:
1. mvn clean package; java -jar target/spring-remote-lombok-test-0.0.1.jar
2. You will notice that the app fails to boot.

Steps to fix:
1. Uncomment exclusions in pom.xml.
2. mvn clean package; java -jar target/spring-remote-lombok-test-0.0.1.jar
3. You will notice that the app boots fine.
