#Author: khemiriSyrine
Feature: ajouter au panier

  Scenario: ajouter un article au panier
    Given admin is on productPage
    When admin click on "Ajouter au panier"
    And admin click on "basket"
    Then admin is directed on "votre panier "
