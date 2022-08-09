@Certificate
Feature: Test Certification on https://certificate.ithillel.ua/

  Scenario Outline:
    When I open site "https://certificate.ithillel.ua/"
    And Enter certificate code "<Cert>"
    Then Check result
    Examples:
      | Cert          |
      | 45686546364   |
      | 6564654654654 |
      | 4564878       |
      | 7982313218    |
      | 48672050      |