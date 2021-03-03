#Author : Rohan Sharma[rosharma0906@gmail.com]
# This is a sample feature file covering all the basics of Cucumber
Feature: Receiving an item feature
  
  In order to receive an item inside the warehouse, 
  the receiving user should be able to receive the item

  Scenario Outline: Receiving an item by providing the item barcode
    Given User is on the RF screen
    When User enter the "<ASN>" in the ASN field
    Then User needs to enter the item details
    When User enter the "<item barcode>"
    And User move to the next screen
    Then User is requested to enter the item quantity
    When User enter the quanity as "<quantity>"
    Then the received quanity is incremented with the "<received qty>"

    Examples: 
      | ASN      | item barcode | quantity | received qty |
      | ASN10001 | ITEM001      |       12 |           12 |
      | ASN10002 | ITEM001      |       32 |           32 |
      | ASN10003 | ITEM001      |       43 |           43 |
