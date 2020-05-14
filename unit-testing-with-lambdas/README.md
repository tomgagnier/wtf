Unit Testing with Lambdas
=========================

Writing tests for classes that used static methods from another class
was problematic before Java 8.  

Some options were:
   * create a Veneer class to wrap the function and inject it
   * use a framework to change behavior by rewriting byte code (yech!)
   
Now we can inject lambda functions and use them vary our test scenarios.
