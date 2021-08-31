$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature.feature");
formatter.feature({
  "line": 1,
  "name": "deatils on functionality of app",
  "description": "",
  "id": "deatils-on-functionality-of-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login functionality",
  "description": "",
  "id": "deatils-on-functionality-of-app;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user should be on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user shold enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user should clikc the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user validate on correct page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user should quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_on_the_homepage()"
});
formatter.result({
  "duration": 10790535000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_shold_enter_username_and_password()"
});
formatter.result({
  "duration": 1979176600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_clikc_the_login_button()"
});
formatter.result({
  "duration": 759318400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_validate_on_correct_page()"
});
formatter.result({
  "duration": 41700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_quit_the_browser()"
});
formatter.result({
  "duration": 37700,
  "status": "passed"
});
});