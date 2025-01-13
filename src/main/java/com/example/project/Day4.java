package com.example.project;
import java.util.Random;

public class Day4 {
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};
    public static class Reindeer {
        private String name;
        private int distanceTravelled;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int runTime;
        private int restTime;
        private boolean isRunning;
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.distanceTravelled = 0;
            this.runTime = 0;
            this.restTime = 0;
            this.isRunning = true;
        }
        public int getDistanceTraveled() {
            return distanceTravelled;
        }
        public void simulateSecond() {
            if (isRunning) {
                distanceTravelled += speed;
                runTime++;
                if (runTime == runDuration) {
                    isRunning = false;
                    runTime = 0;
                }
            } else {
                restTime++;
                if (restTime == restDuration) {
                    isRunning = true;
                    restTime = 0;
                }
            }
        }
        public String getName() {
            return name;
        }
    }
    public static String simulateRace(int time, Reindeer[] reindeers) {
        for (int i = 0; i < time; i++) {
            for (Reindeer reindeer : reindeers) {
                reindeer.simulateSecond();
            }
        }
        Reindeer winner = reindeers[0];
        for (Reindeer reindeer : reindeers) {
            if (reindeer.getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeer;
            }
        }
        return winner.getName();
    }
    public static void main(String[] args) {
        Random random = new Random();
        Reindeer[] reindeers = new Reindeer[reindeer_names.length];
        for (int i = 0; i < reindeer_names.length; i++) {
            reindeers[i] = new Reindeer(reindeer_names[i], 
                                        random.nextInt(10) + 1, 
                                        random.nextInt(10) + 1, 
                                        random.nextInt(10) + 1);
        }
        String winner = simulateRace(1000, reindeers);
        System.out.println("The winner is: " + winner);
    }
}