# Spring Boot with Kafka Consumer Example

This Project covers how to use Spring Boot with Spring Kafka to Consume JSON/String message from Kafka topics

Start ZooKeeper
->  C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>zookeeper-server-start.bat C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\config\zookeeper.properties

Start Kafka (cluster)
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-server-start.bat C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\config\server.properties

Create Topic 
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic rahuls_kafka_example
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic rahuls_kafka_example_json

Publish to the Kafka Topic via Console
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-console-producer.bat --broker-list localhost:9092 --topic rahuls_kafka_example
-> C:\WORKDRIVE\Kafka\kafka_2.12-2.6.0\bin\windows>kafka-console-producer.bat --broker-list localhost:9092 --topic rahuls_kafka_example_json



-- Linux 
## Start Zookeeper
- `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh config/server.properties`


