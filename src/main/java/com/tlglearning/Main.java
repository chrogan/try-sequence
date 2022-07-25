package com.tlglearning;

public class Main {

  public static void main(String[] args) {
    try(Resource res = new Resource()){
      System.out.println("Start Trying");
      res.process();
      System.out.println("Stop trying");
    } catch(RuntimeException e) {
      System.out.println("Caught runtime exception");
    } catch(Exception e) {
      System.out.println("Caught Exception");
    } finally {
      System.out.println("Get money");
    }
  }

}
