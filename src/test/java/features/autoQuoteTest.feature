Feature: Auto Quote Testing
Background:
* this is a quote test


  @smoke @auto
  Scenario: Create an Auto Quote
    Given validate homePage Text 'Welcome to Progressive'
    When clickAuto
    And insert ZipcodeField '11373'
    When Get a Quote
    And insert first Name 'mhmd'
    Then insert Last Name 'khon'
    
    @dataDriven @csr-453 @regression
    Scenario Outline: Auto Quote with <zipCode>
    Given validate homePage Text 'Welcome to Progressive'
    When clickAuto
    And insert ZipcodeField <zipCode>
    When Get a Quote
    And insert first Name 
    Then insert Last Name 
    Examples:
    |zipCode|
    |'11374'|
    |'11375'|
    |'11376'|
