Feature: Signup feature

Background:
  Given user at TalentTEK Homepage
 And Student click on Create an new account button

  @test
  Scenario: User should be able to signup with valid credentials
    And user enter valid first name
    And user enter valid last name
    And user enter new valid email address
    And  user enter a valid password
    And  user enter valid confirm password
    And user enter their month as "Nov" under dob
    And user enter their day as '4' under dob
    And user enter their year as '1990' under dob
    And user select a gender
    And user click the term and condition policy
    And user click on Create my account button
  Then the user should be able to login successfully

#   Scenario:User should not be able to signup with  numeric first name
#    And user enter numeric first name
#     And  user enter valid last name
#     And  user enter valid email address
#     And  user enter valid password
#     And  user enter valid confirm password
#     And  user select month, day, and year for date of birth
#     And  user select gender
#     And  user click the term and condition policy
#     And  user click on 'Create my account' button
#     Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#    Scenario:user should not be able to signup with numeric last name
#      And user enter valid first name
#      And user enter numeric last name
#      And user enter valid email address
#      And user enter valid password
#      And user enter valid confirm password
#      And  user select month, day, and year for date of birth
#      And  user select gender
#      And  user click the term and condition policy
#      And  user click on create Account button
#      Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#    Scenario:User should not be able to signup with numeric first name and last name
#      And  user enter numeric first name
#      And  user enter numeric last name
#      And  user enter valid email address
#      And  user enter valid password
#      And  user enter valid confirm password
#      And  user select month, day, and year for date of birth
#      And  user select gender
#      And  user click the term and condition policy
#      And  user click on create Account button
#      Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#    Scenario:  User should not be able to signup with alphanumeric first name
#      And  user enter alphanumeric first name
#      And  user enter valid last name
#      And  user enter valid email address
#      And  user enter valid password
#      And  user enter valid confirm password
#      And  user select month, day, and year for date of birth
#      And  user select gender
#      And  user click the term and condition policy
#      And  user click on create Account button
#      Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#  Scenario:  User should not be able to signup with alphanumeric last name
#    And  user enter valid first name
#    And  user  enter alphanumeric last name
#    And  user enter valid email address
#    And  user enter valid password
#    And  user enter valid confirm password
#    And  user select month, day, and year for date of birth
#    And  user select gender
#    And  user click the term and condition policy
#    And  user click on create Account button
#    Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#  Scenario:  User should not be able to signup with an empty field
#    And  user enter empty first name
#    And  user enter empty last name
#    And  user enter valid email address
#    And  user enter valid password
#    And  user enter valid confirm password
#    And  user select month, day, and year for date of birth
#    And  user select gender
#    And  user click the term and condition policy
#    And  user click on create Account button
#    Then user should be see "please fill out the field" message
#
#  Scenario:  User should not be able to signup with an empty field for first name
#    And  user enter empty first name
#    And  user enter valid last name
#    And  user enter valid email address
#    And  user enter valid password
#    And  user enter valid confirm password
#    And  user select month, day, and year for date of birth
#    And  user select gender
#    And  user click the term and condition policy
#    And  user click on create Account button
#    Then user should not be able to login successfullyld be see "please fill out the field" message
#
#  Scenario:  User should not be able to signup with an empty field for last name
#    And  user enter valid first name
#    And  user enter empty last name
#    And  user enter valid email address
#    And  user enter valid password
#    And  user enter valid confirm password
#    And  user select month, day, and year for date of birth
#    And  user select gender
#    And  user click the term and condition policy
#    And  user click on create Account button
#    Then user should not be see "please fill out the field" message
#
#  Scenario:  User should not be able to signup with special character
#    And user enter special character for first name
#    And user enter special character for last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#  Scenario:  User should not be able to signup with special character for last name
#    And user enter valid first name
#    And user enter special character last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#  Scenario:  User should not be able to signup with special character for first name
#    And user enter special character first name
#    And user enter valid last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should recive "First name and last name cannot contain numeric or spceial characters"
#
#  Scenario: User should be able to signup with valid 3 letters for first name and last name
#    And user enter 3 letters for first name
#    And user enter 3 letters for last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should be able to login successfully
#
#  Scenario: User should  not be able to signup with less than 3 letters first name and last name
#    And user enter 2 letters for  first name
#    And user enter 2 letter for  last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should not be able to login successfully
#
#  Scenario: User should be able to signup with more than 12 character
#    And user enter 13 character for first name
#    And user enter 13 character for last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should be able to login successfully
#
#  Scenario: User should be able to signup with similar name or character
#    And user enter common name for first name
#    And user enter common name for last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should be able to login successfully
#
#
#
#  Scenario:  User should not be able to signup with Invalid password and email
#    And user enter valid first name
#    And user enter valid last name
#    And user enter Invalid email address
#    And user enter Invalid password
#    And user enter Invalid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should not be able to login successfully
#
#  Scenario: User should not be able to signup with Invalid email
#      And user enter valid first name
#      And user enter valid first name
#      And user enter Invalid email address
#      And user enter valid password
#      And user enter valid confirm password
#      And user select month, day, and year for date of birth
#      And user select gender
#      And user click the term and condition policy
#      And user click on create Account button
#      Then user should not be able to login successfully
#
#  Scenario: User should not be able to signup with Invalid password
#    And user enter valid first name
#    And user enter valid first name
#    And user enter valid email address
#    And user enter Invalid password
#    And user enter Invalid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should not be able to login successfully
#
#  Scenario: User should not be be able to sign up without selecting the term and condition policy check box
#    And user enter valid first name
#    And user enter valid last name
#    And user enter valid email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user enter valid month, day and year for date of birth
#    And user select gender
#    And user does not click the term and condition policy
#    And user click on Create my Account button
#    Then user should be see arror massage "please check this box if you want to proceed"
#
#  Scenario: User should not be able to sign up with Passwords containing less then 6 character
#    And user enter valid first name
#    And user enter valid last name
#    And user enter valid email address
#    And user enter Passwords containing less then 6 characters
#    And user enter same characters from password field in confirm password field
#    And user enter valid month, day and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user c
#    And user click on Create my Account button
#    Then the user should see error message: "Passwords must be at least 6 character"
#
#  Scenario: User should not be able to signup with exiting email
#    And user enter valid first name
#    And user enter valid first name
#    And user enter exiting email address
#    And user enter valid password
#    And user enter valid confirm password
#    And user select month, day, and year for date of birth
#    And user select gender
#    And user click the term and condition policy
#    And user click on create Account button
#    Then user should not be able to login successfully
#
#  Scenario: user should not be able to sign up without selecting gender radio button
#    And user enter valid first name
#    And user enter valid last name
#    And user enter valid email address
#    And user enter valid Passwords
#    And user enter same characters from password field in confirm password field
#    And user enter valid month, day and year for date of birth
#    And user does not select gender radio button 'male' or 'female'
#    And user click the term and condition policy
#    And user click on Create my Account button
#    Then the user should see error message: "Passwords must be at least 6 character"