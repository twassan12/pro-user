package com.pinguuid.pro;

import com.pinguuid.mi8.SameAPI;
import com.pinguuid.mi8.SameImpl;

public class Main {
  public static void main(String[] args) {
    SameAPI api = new SameImpl();
    String initialized = api.init(System.currentTimeMillis(), "for testing purpose");
    System.out.println("library was initialized: " + initialized);
  }
}
