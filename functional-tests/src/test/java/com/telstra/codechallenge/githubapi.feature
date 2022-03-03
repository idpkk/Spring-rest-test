Feature: As a developer i want to test the gitubapi uri

  Scenario: Find the hottest repositories created in the last week
    Given url microserviceUrl
    And path '/v1/github_api/1'
    When method GET
    Then status 200
    And match header Content-Type contains 'application/json'
    # see https://github.com/intuit/karate#schema-validation
    And match response == 
    """
    [
    	{
        html_url: '#string',
        watchers_count: '#number',
        language: '#string',
        description: '#string',
        name: '#string'
    	}
    ]
    """

