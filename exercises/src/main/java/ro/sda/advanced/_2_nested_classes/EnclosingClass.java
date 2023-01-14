package ro.sda.advanced._2_nested_classes;

/*
  Create a maven project

  Create a class called EnclosingClass - this class should have a single field called counter (initialized with 0)
  The class should have a single method which is a getter for this counter.

  The class should contain an inner class named EnclosedClass
  Enclosed class should have only one method named incrementCounter() which will increment the instance variable of the EnclosingClass


  Write a test, in the test section of the maven project.

  The test should create an instance of EnclosingClass and using that instance the test should create an instance of
  EnclosedClass

  call the increment method on the EnclosedClass instance

  assert if EnclosingClass field counter is now 1

 */
public class EnclosingClass {

    int counter;

    public int getCounter() {
        return counter;
    }

    public class EnclosedClass {
        public void icrementCounter() {
            counter++;
        }

    }
}
