$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/feature/google.feature");
formatter.feature({
  "name": "Searching on Google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for Iphone X on Google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.step({
  "name": "the user is on Google home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Google_StepDefs.the_user_is_on_Google_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"Iphone X\" and hits search button",
  "keyword": "When "
});
formatter.match({
  "location": "Google_StepDefs.the_user_enters_and_hits_search_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should able to see the result of the search",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_StepDefs.the_user_should_able_to_see_the_result_of_the_search()"
});
formatter.result({
  "status": "passed"
});
});