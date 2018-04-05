$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "RS Component Login feature",
  "description": "",
  "id": "rs-component-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "RS Component Login Test Scenario",
  "description": "",
  "id": "rs-component-login-feature;rs-component-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is RS Components | Electronic and Electrical Components",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter User name and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on Log In button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_already_on_LoginPage()"
});
formatter.result({
  "duration": 10134502866,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.login_page_is_RS_Components()"
});
formatter.result({
  "duration": 868976,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.LoginStepDefinition.login_page_is_RS_Components(LoginStepDefinition.java:39)\n\tat ✽.When title of login page is RS Components | Electronic and Electrical Components(Login.feature:6)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_Log_In_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Home_page()"
});
formatter.result({
  "status": "skipped"
});
});