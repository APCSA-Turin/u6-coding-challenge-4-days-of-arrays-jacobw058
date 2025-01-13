package com.example.project;
import java.util.Random;
public class Day1 {
    private static String[] elf_names = {"Glitter", "Chocolate", "Tiny", "Snowflake", "Frosty"};
    public static String generateElfName(String name) {
        if (name != null && !name.isEmpty()) {
            int rand = (int) (Math.random() * elf_names.length);
            return elf_names[rand] + " " + name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
}