# Part II - In-Adapter

1. Implement a first so-called `In-Adapter` regarding the Students.\
The In-Adapter should receive a `StudentId` via REST endpoint and return matching Student information.\
Additionally, when there is no matching Student the return is a client error resulting in 404 (NOT_FOUND).
   - In-Adapter, Driving Adapter or Primary Adapter are interchangeable and mean the same thing
   - In-Adapter are calling an In-Port
<br><br>

1. Implement a **second** `In-Adapter` regarding the Students.\
The In-Adapter should receive a Payload containing `StudentId` via RabbitMQ and return matching Student information.\
Additionally, when there is no matching Student the return is an error message saying the student couldn't be found.
<br><br>

