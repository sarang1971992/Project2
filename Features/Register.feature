Feature: Register

Scenario: Register Successfull

 Given  verify user navigate to homepage
 When   user clicks on signup/login button
 Then   verify 'New User Signup!' is visible
 When   user enter name "sarang" and email "farupatil"
 And    user clicks on signup button
 Then   verify that 'ENTER ACCOUNT INFORMATION' is visible
 When   user click as the title
 And    user  enter the following details:
  | Field        | Value                |
  | Password     | Pass1234!            |
 
 And    user select the date of birth:
  
 And    user check the Sign up for newsletter option
 And    user check the Receive special offers option
 And    user enter the following address details:
  | Field      | Value                |
  | First Name | John                 |
  | Last Name  | Doe                  |
  | Company    | ABC Corp             |
  | Address    | 123 Main St          |
  | Address 2  | Apt 4B               |
  | Country    | United States        |
  | State      | California           |
  | City       | Los Angeles          |
  | Zipcode    | 90001                |
  | Mobile     | +1 123-456-7890      |
 
 And   user clicks on create account
 Then  Account should ber created and message like "ACCOUNT CREATED!" should display
 When  click on continue button
 Then  user shoud see " Logged in as "
 When  user click on delete account button
 Then  user should logout sucessfully and should see "ACCOUNT DELETED!" message 
