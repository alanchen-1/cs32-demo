package edu.brown.cs.student.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REPL {
  public static void run() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    boolean running = true;
    while (running) {
      String input = reader.readLine();
      if (input == null) break;
      String[] split = input.split(" ");
      switch (split[0]){
        case "add":
          if (split.length != 3) {
            System.out.println("ERROR: 'add' expects 2 parameters.");
            break;
          }
          try {
            int x = Integer.parseInt(split[1]);
            int y = Integer.parseInt(split[2]);
            System.out.println(Calculator.add(x, y));
            break;
          } catch (NumberFormatException err) {
            System.out.println("ERROR: error parsing numbers");
            break;
          }
        case "multiply":
          if (split.length != 3) {
            System.out.println("ERROR: 'multiply' expects 2 parameters.");
            break;
          }
          try {
            int x = Integer.parseInt(split[1]);
            int y = Integer.parseInt(split[2]);
            System.out.println(Calculator.multiply(x, y));
            break;
          } catch (NumberFormatException err) {
            System.out.println("ERROR: error parsing numbers");
            break;
          }
        case "exit":
          running = false;
          System.out.println("Exiting.");
          break;
        default:
          System.out.println("ERROR: command not recognized");
          break;
      }
    }
  }
}
