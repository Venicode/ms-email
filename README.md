<p align="center">
  <b>This microservice belongs to the <a href="https://github.com/Venicode/user-registration-validation">User Registration Validation</a> project.</b>
</p>

# Initial Configurations

To preserve the data, you need create your database and a RabbitMQ queue. After that, update in <a href="https://github.com/Venicode/ms-email/blob/master/src/main/resources/application.properties"> application.properties </a>:

```
spring.application.name=email
server.port=8082
aws.accessKeyId=YOURACCESSKEYID
aws.secretKey=YOURSECRETKEY
aws.region=AWSREGION
spring.rabbitmq.addresses=amqps://rabbitmq.addresses
broker.queue.email-register.name = default.email-register
```
