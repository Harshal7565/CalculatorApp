# CalculatorApp
This is sample calculator application is build using spring boot &amp; REST API.

As per instructions, application build using spring boot & Rest API.
Used Log4j2 for logging.
Exception handling done.

Attaching POSTMAN curl for reference.

curl --location 'http://localhost:8080/calculate' \
--header 'Content-Type: application/json' \
--data '{
    "numberOne": "2",
    "numberTwo": "1",
    "operation": "+"
}'

In the above curl, operations would be "+", "-", "*" & "/".
numberOne & numberTwo can be integers.
