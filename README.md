**Sample Project to demonstrate Dockerfile**

Steps to execute. 

1. docker pull mongo  (Needed only once)
2. mvn package  
3. docker build -t spring-boot-mongo:latest .  
4. docker run --name dockermongo -d -p 27017:27017 mongo:latest  
5. docker run --name spring-boot-mongo -d -p 8090:8090 --link dockermongo spring-boot-mongo:latest


Some useful commands

docker ps  
docker images  
docker rm  
docker rmi  

docker events&
docker logs `<container id>`  