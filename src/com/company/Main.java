package com.company;

public class Main {

   public static class WashingMachine {
        int DurationWashing;

        public WashingMachine(String name) {
            System.out.println("Тип стирки: " + name);
        }

        public void setDuration(int min) {
            DurationWashing = min;
        }
        public int getDurationWashing(){
            System.out.println("Длительность работы: "+ DurationWashing);
            return DurationWashing;
        }
        public static void main(String[] args) {
            WashingMachine myWashingMachine = new WashingMachine("отжим");

            myWashingMachine.setDuration(3);

            myWashingMachine.getDurationWashing();

        }

    }


}