package class7;

public class DoWhileLoops {
    public static void main(String[] args) {

        boolean workDay = true;
        int day = 2;
        while (workDay) {
            if (day <= 7) {
                    System.out.println("I need a day off");
                } else {
                    System.out.println("I do need a day off anymore");
                    workDay = false;
                }
                day++;// it is equal to day=day+1 day+=1

            }
        }
    }


