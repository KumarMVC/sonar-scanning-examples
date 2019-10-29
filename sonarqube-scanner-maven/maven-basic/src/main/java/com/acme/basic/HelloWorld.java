package com.acme.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

  void sayHello() {
    logger.log("Hello World!");
  }
  void notCovered() {
    logger.log("This method is not covered by unit tests");
  }

}
