$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AmanShukla/IdeaProjects/BDDCucumberDemo/src/test/java/Featurefile/Login.feature");
formatter.feature({
  "name": "Checking login Functionality of Orange HRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking user login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDef.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is clicking on forgot password button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDef.user_is_clicking_on_forgot_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username in username textbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDef.user_enters_username_in_username_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password in password textbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDef.user_enters_password_in_password_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDef.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDef.user_is_on_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/AmanShukla/IdeaProjects/BDDCucumberDemo/src/test/java/Featurefile/homepage.feature");
formatter.feature({
  "name": "Checking homepage functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking homepage icons are working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is at Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Homepagedef.user_is_on_Homepage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinations.Homepagedef.user_is_on_Homepage(Homepagedef.java:55)\r\n\tat ✽.user is at Homepage(C:/Users/AmanShukla/IdeaProjects/BDDCucumberDemo/src/test/java/Featurefile/homepage.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on admin button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validateAdminModule()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on PIM button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validatePim()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on leave button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validateleave()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on time button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validatetime()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on recruitment button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validaterecruitment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Myinfo button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validatemyinfo()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on performance button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validateperformance()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Dashboard button",
  "keyword": "When "
});
formatter.match({
  "location": "Homepagedef.validatedashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is logging out",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepagedef.logout()"
});
formatter.result({
  "status": "skipped"
});
});