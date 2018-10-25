$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "login",
  "description": "",
  "id": "login;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "I open \"\u003cbrowser\u003e\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I naviagte to \"\u003curl\u003e\" url",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter \"\u003cemail\u003e\" into the email field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003cpassword\u003e\" into the password field",
  "keyword": "And "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "login;login;",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "email",
        "password"
      ],
      "line": 9,
      "id": "login;login;;1"
    },
    {
      "cells": [
        "chrome",
        "https://en-gb.facebook.com/",
        "aa1@gmail.com",
        "xyzwkkk"
      ],
      "line": 10,
      "id": "login;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1655148834,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "login",
  "description": "",
  "id": "login;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "I open \"chrome\" browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I naviagte to \"https://en-gb.facebook.com/\" url",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter \"aa1@gmail.com\" into the email field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter \"xyzwkkk\" into the password field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 8
    }
  ],
  "location": "LoginSteps.iOpenBrowser(String)"
});
formatter.result({
  "duration": 81883125,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://en-gb.facebook.com/",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iNaviagteToUrl(String)"
});
formatter.result({
  "duration": 1292819289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aa1@gmail.com",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterIntoTheEmailField(String)"
});
formatter.result({
  "duration": 3222951883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyzwkkk",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterIntoThePasswordField(String)"
});
formatter.result({
  "duration": 71280958,
  "status": "passed"
});
formatter.after({
  "duration": 93052042,
  "status": "passed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registration",
  "description": "",
  "id": "registration;registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open \"\u003cbrowser\u003e\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I naviagte to \"\u003curl\u003e\" url",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003cfirstname\u003e\" into the firstname field",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter \"\u003clastname\u003e\" into the lastname field",
  "keyword": "When "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "registration;registration;",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "firstname",
        "lastname"
      ],
      "line": 9,
      "id": "registration;registration;;1"
    },
    {
      "cells": [
        "chrome",
        "https://en-gb.facebook.com/",
        "aa@gmail.com",
        "xyzwkkk"
      ],
      "line": 10,
      "id": "registration;registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1011353728,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Registration",
  "description": "",
  "id": "registration;registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open \"chrome\" browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I naviagte to \"https://en-gb.facebook.com/\" url",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"aa@gmail.com\" into the firstname field",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter \"xyzwkkk\" into the lastname field",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 8
    }
  ],
  "location": "LoginSteps.iOpenBrowser(String)"
});
formatter.result({
  "duration": 132568,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://en-gb.facebook.com/",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iNaviagteToUrl(String)"
});
formatter.result({
  "duration": 1303243259,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aa@gmail.com",
      "offset": 9
    }
  ],
  "location": "RegistrationSteps.iEnterIntoTheFirstnameField(String)"
});
formatter.result({
  "duration": 192014584,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyzwkkk",
      "offset": 9
    }
  ],
  "location": "RegistrationSteps.iEnterIntoTheLastnameField(String)"
});
formatter.result({
  "duration": 85413619,
  "status": "passed"
});
formatter.after({
  "duration": 95588809,
  "status": "passed"
});
});