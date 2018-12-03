# Java docker file
FROM java

# Define working directory
WORKDIR /opt/working/

# Move jar file to working directory
ADD yaml-config-0.0.1-SNAPSHOT.jar /opt/working/yaml-config-0.0.1-SNAPSHOT.jar

# use entrypoint to pass JAVA_OPTS to java on startup
ENTRYPOINT exec java -jar yaml-config-0.0.1-SNAPSHOT.jar

# Command to run application
#CMD java -jar yaml-config-0.0.1-SNAPSHOT.jar

# Command to run docker image after build
# docker run -d -e APP_NAME='huy application' --name yaml-config tqh28/yaml-config:SNAPSHOT

