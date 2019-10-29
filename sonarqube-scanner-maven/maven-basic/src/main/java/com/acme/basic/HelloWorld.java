package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    logger.log("Hello World!");
  }

  void notCovered() {
    logger.log("This method is not covered by unit tests");
  }

}
