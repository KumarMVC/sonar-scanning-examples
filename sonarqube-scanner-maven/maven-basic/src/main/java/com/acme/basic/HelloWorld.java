package com.acme.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

  void sayHello() {
    logger.log("Hello World!");
  }
  void notCovered() {
    logger.log("This method is not covered by unit tests");
  }

}
