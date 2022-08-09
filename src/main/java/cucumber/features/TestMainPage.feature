@MainPageTest

  Feature: MainPageTest

    Scenario: Test text description
      When I open site "https://ithillel.ua/"
      Then Text description must be equals "Вдосконалюйся!"