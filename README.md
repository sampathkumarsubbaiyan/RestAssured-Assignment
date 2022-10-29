In ReadJson class,I kept the response as string.Then I parse the string to Json format using JSONPath class
In ValidatingData class,I used the @Test testng annotations to run the tests
To validate the json data,first I get the json size and iterate the json data
  for first scenario,if country of player not equals India,which means the player is foreigner and I assert the count
  for the second scenario,as soon as the role of player is wicket keeper,i break the loop which means there is atleast one wicket keeper and assert value

