$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/KOMALA S/eclipse-workspace/HotelCucumber/src/test/resources/Hotel.feature");
formatter.feature({
  "name": "validate the adactin hotel application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validate adactine application with correct Username and Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launches the Adactin url",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\" and clicks login button",
  "keyword": "When "
});
formatter.step({
  "name": "User searchs the holel",
  "keyword": "And "
});
formatter.step({
  "name": "User selects the hotel",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the \"\u003cFirstname\u003e\", \"\u003cLastname\u003e\" and \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the Month, Year and Card type",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the \"\u003cCardno\u003e\" and \"\u003ccvc\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Books the hotel",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Firstname",
        "Lastname",
        "Address",
        "Cardno",
        "cvc"
      ]
    },
    {
      "cells": [
        "komalamani",
        "komala123",
        "komala",
        "selvaraj",
        "cbe",
        "1234567898765432",
        "123"
      ]
    },
    {
      "cells": [
        "komalamani",
        "komala123",
        "preethi",
        "selvaraj",
        "cbe",
        "0987654321234567",
        "893"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate adactine application with correct Username and Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launches the Adactin url",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_launches_the_Adactin_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"komalamani\" and \"komala123\" and clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_enters_the_and_and_clicks_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searchs the holel",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_searchs_the_holel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_selects_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"komala\", \"selvaraj\" and \"cbe\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enters_the_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Month, Year and Card type",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enters_the_Month_Year_and_Card_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"1234567898765432\" and \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enters_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Books the hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.books_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate adactine application with correct Username and Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launches the Adactin url",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_launches_the_Adactin_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"komalamani\" and \"komala123\" and clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_enters_the_and_and_clicks_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searchs the holel",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_searchs_the_holel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_selects_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"preethi\", \"selvaraj\" and \"cbe\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enters_the_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Month, Year and Card type",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enters_the_Month_Year_and_Card_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"0987654321234567\" and \"893\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enters_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Books the hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.books_the_hotel()"
});
formatter.result({
  "status": "passed"
});
});