#Author: khemiriSyrine
Feature: page d'accueil XIAOMI
Background: 
    Given admin is on home page
    
  Scenario: selectionner un produit
   
    When admin mouse hover on menu "Smart Home"  
    And admin click on submenu "Maison connectée"
    Then admin is directed to the page "Maison Connectée"
