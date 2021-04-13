# Spring-Boot-with-Kafka-Producer

Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic

1.Start zookeeper
2.Start Kafka Server
3.Create kafka topics
4.Consume from kafka topics
5.Publish messages

# Few-Handy-commands:

1. To start zookeeper : bin/zookeeper-server-start.sh config/zookeeper.properties
2. To start kafka server : bin/kafka-server-start.sh config/server.properties
3. checking the existing files: bin/kafka-topics.sh --list --zookeeper localhost:2181
4. create kafka topics : bin/kafka-topics.sh --create --zookeper localhost:2181 --replication-factor 1 --partitions 1 --topic {topic_name}  
                         bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic {topic_name} 
5. consuming the file : bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic {topic_name} --from-beginning
6. publishing message using local host: localhost:8080/kafka/publish/{message}
