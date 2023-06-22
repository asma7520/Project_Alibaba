
Feature: Language and Currency Verification Functionality

 Scenario: Language and Currency Verification
 Given  We are on the  landing page
 When We mousehover on region setting
 And We click on language dropdown menu
 And We click on Hindi language
 #And We click on currency dropdown menu
 #And We select INR
 Then We click on save button
 Then We verify the new language 

 