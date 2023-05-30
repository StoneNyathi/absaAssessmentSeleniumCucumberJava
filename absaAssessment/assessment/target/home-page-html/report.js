$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/co/za/assessment/Assessment.feature");
formatter.feature({
  "name": "Home page for Way2automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Way2automation User Web tables",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTests"
    }
  ]
});
formatter.step({
  "name": "A user navigates to HomePage",
  "keyword": "Given "
});
formatter.step({
  "name": "Validate that you are on the User List Table",
  "keyword": "When "
});
formatter.step({
  "name": "click add user",
  "keyword": "And "
});
formatter.step({
  "name": "user provide reg details \u003cfirstname\u003e,\u003clastname\u003e,\u003cusername\u003e,\u003cpassword\u003e,\u003ccustomer\u003e,\u003crole\u003e,\u003cemail\u003e,\u003ccell\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify created users exist on page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "username",
        "password",
        "customer",
        "role",
        "email",
        "cell"
      ]
    },
    {
      "cells": [
        "FName1",
        "LName1",
        "User1",
        "Pass1",
        "Company AAA",
        "Admin",
        "admin@mail.com",
        "825555"
      ]
    },
    {
      "cells": [
        "FName2",
        "LName2",
        "User2",
        "Pass2",
        "Company BBB",
        "Customer",
        "customer@mail.com",
        "083444"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Way2automation User Web tables",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTests"
    }
  ]
});
formatter.step({
  "name": "A user navigates to HomePage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate that you are on the User List Table",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click add user",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user provide reg details FName1,LName1,User1,Pass1,Company AAA,Admin,admin@mail.com,825555",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify created users exist on page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Way2automation User Web tables",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTests"
    }
  ]
});
formatter.step({
  "name": "A user navigates to HomePage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate that you are on the User List Table",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click add user",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user provide reg details FName2,LName2,User2,Pass2,Company BBB,Customer,customer@mail.com,083444",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify created users exist on page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});