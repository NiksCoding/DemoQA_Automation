

Feature: Demo QA Tiles

 @Tiles
  Scenario Outline:  Open the Tiles
  
    Given user open the demoQA App
    When user click on the '<Tiles>'
    Then validate tile get open
    
    Examples:
    |Tiles|
    |Elements|
    |Forms|
    |AlertsFrameAndWindows|
    |Widgets|
    |Interactions|
    |BookStoreApplications|
    
    
    #Scenario:  Open the Tiles
  
   # Given user open the demoQA App
   # When user click on the "Elements"
   # Then validate tile get open
   
   @ElementItems
   Scenario Outline: Open Element items
   
   Given user open the demoQA App
   When user click on the "Elements"
   Then validate tile get open
   And user open the '<ElementsItem>' page
   
   Examples:
   |ElementsItem|
   |TextBox|
   |CheckBox|
   |RadioButtons|
   |Webtables|
   |Buttons|
   |Links|
   |BrokenLinksImages|
   |UploadAndDownload|
   |DynamicProperties|
   
   @TextBox
   Scenario: Fill the text box
   
   Given user on the Elements page
   And user open the "TextBox" page
   Then user fill all the text box
   And user click on submit button
   
   @CheckBox
   Scenario: CheckBox
   Given user on the Elements page
   And user open the "CheckBox" page
   Then user tick react check box
   
   @RadioButton
   Scenario: CheckBox
   Given user on the Elements page
   And user open the "RadioButton" page
   Then user tick impressive radio button
   
   
   
  
