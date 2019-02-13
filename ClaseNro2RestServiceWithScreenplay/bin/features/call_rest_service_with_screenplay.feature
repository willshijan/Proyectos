Feature: Request a REST API with Screenplay
  I want to call an API using the Scrrenplays ability CallAnApi

 @SimpleGet
  Scenario: Simple GET Request
    Given that jorge calls a REST API with Screenplay
    When jorge obtains the response
    Then jorge verifies the quality response
 
