Feature: Validate products micro service

Narrative: ......

Scenario: Validate user get objectOrArray in the response of 'Validation' web service
Meta:
@regression

Given 'Validation' REST API is up and running
When user sends request to 'Validation' web service
Then user should get <objectOrArray> in the response of the web service call

Examples:
|objectOrArray|
|array|

Scenario: Validate user get empty object in the response of 'Validation' web service
Meta:
@regression

Given 'Validation' REST API is up and running
When user sends request to 'Validation' web service
Then user should get <empty> in the response of the web service call

Examples:
|empty|
|array|

Scenario: Validate user gets parse_time_nanoseconds in the response of 'Validation' web service
Meta:
@regression

Given 'Validation' REST API is up and running
When user sends request to 'Validation' web service
Then user should get parse_time_nanoseconds in the response of the web service call

Scenario: Validate user gets validate in the response of 'Validation' web service
Meta:
@regression

Given 'Validation' REST API is up and running
When user sends request to 'Validation' web service
Then user should get <validate> in the response of the web service call

Examples:
|validate|
|true|

Scenario: Validate user gets size in the response of 'Validation' web service
Meta:
@regression
@runas test
Given 'Validation' REST API is up and running
When user sends request to 'Validation' web service
Then user should get <size> in the response of the web service call

Examples:
|size|
|1|