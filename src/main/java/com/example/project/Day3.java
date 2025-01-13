package com.example.project;

public class Day3 {
  public static String[][] generateSnowflake(int size) {
      String[][] grid = new String[size][size];
      for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
              grid[i][j] = " ";
          }
      }
      int mid = size / 2;
      for (int i = 0; i < size; i++) {
          grid[i][mid] = "*";
          grid[mid][i] = "*";
      }
      for (int i = 0; i < size; i++) {
          grid[i][i] = "*";
          grid[i][size-1-i] = "*";
      }
      return grid;
  }
  public static void printSnowflake(String[][] snowflake) {
    for (String[] snow : snowflake) {
        for (String flake : snow) {
            System.out.print(flake);
        }
        System.out.println();
    }
}
  public static void main(String[] args) {
      String[][] snowflake = generateSnowflake(5);
      printSnowflake(snowflake);
  }
}
