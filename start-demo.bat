call mvn clean install -DskipTests
docker build -t travel-plan-image .
docker-compose up