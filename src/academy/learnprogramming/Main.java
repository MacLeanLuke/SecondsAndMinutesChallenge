package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(100,1000);
        getDurationString(7000);
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        seconds += minutes * 60;
        int hours = seconds / 3600;
        minutes = (seconds - (hours * 3600)) / 60;
        seconds -= (minutes * 60) + (hours * 3600);
        return hours + "h " + minutes + "m " + seconds + "s";

    }
    public static void getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("Invalid Value");
        }
        int minutes = seconds / 60;
        seconds -= (minutes * 60);
        getDurationString(minutes,seconds);
    }
}
