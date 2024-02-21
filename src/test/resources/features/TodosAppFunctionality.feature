Feature: TodosApp functionality
  As a user of app
  I want to be able to add the tasks
  So that we can visible total tasks added

  Scenario: Test Adding Todos
    Given I am on the todos app page
    When I enter 'Learn Automation Testing' in the input field
    And I click add button
    And I enter 'Practice Automation Testing' in the input field
    And I click add button
    Then As we can visible What we added

  Scenario: Test Marking added Todos
    Given I am on the todos app page
    When I enter 'Learn Automation Testing' in the input field
    And I click add button
    And I enter 'Practice Automation Testing' in the input field
    And I click add button
    And I click the first two checkboxes
    Then As we can visible checkboxes are sele cted or not