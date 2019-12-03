# Started Kafka Simple Example

### Installation and Setup

 Download the [Kafka 2.3.0](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.3.0/kafka_2.12-2.3.0.tgz)
                release and un-tar it.

 > tar -xzf kafka_2.12-2.3.0.tgz 
>
 > cd kafka_2.12-2.3.

Kafka uses ZooKeeper so you need to first start a ZooKeeper serve

> sh bin/zookeeper-server-start.sh config/zookeeper.properties


Now start the Kafka server

> bin/kafka-server-start.sh config/server.properties

Start the spring aplication

> ./gradlew build bootRun


### Send Message Test
`curl --request GET --url 'http://localhost:8080/kafka/send?message=Hello'` 

Output Success: 
`SENT MESSSAGE=[Hello] WITH OFFSET[1]`