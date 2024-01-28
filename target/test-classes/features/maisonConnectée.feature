#Author:khemiriSyrine
Feature: maison connectée 


  Scenario: effectuer le tri des produits
    Given admin is on maison connectée page
    When admin click on "Tri par tarif croissant"
    And  click on product "Mi Temperature and Humidity Monitor Pro"
    Then admin is directed to the page "Mi Temperature and Humidity Monitor Pro"
