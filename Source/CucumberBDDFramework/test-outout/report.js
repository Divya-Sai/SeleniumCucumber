$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Divya-New/Project/workspace/CucumberBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Application URL",
  "description": "",
  "id": "login-to-application-url",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login test to application URL",
  "description": "",
  "id": "login-to-application-url;login-test-to-application-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Log In to enter details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify user is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_login_page()"
});
formatter.result({
  "duration": 15505478089,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.logIn_to_enterDetails()"
});
formatter.result({
  "duration": 7948373611,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_Enters_Username()"
});
formatter.result({
  "duration": 2699283546,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_Enters_Password()"
});
formatter.result({
  "duration": 348814764,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_user_Home_Page()"
});
formatter.result({
  "duration": 17663388,
  "status": "passed"
});
});