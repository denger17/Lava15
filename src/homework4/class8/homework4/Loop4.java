package homework4.class8.homework4;

public class Loop4 {
    public static void main(String[] args) {
        boolean workDay = true;
        int day = 1;
        while (workDay){
            System.out.println("I need a day off");
            day++;
            if (day>=6){
                workDay = false;
                System.out.println("i dont need day off anymore");

            }
        }





        }

    }

