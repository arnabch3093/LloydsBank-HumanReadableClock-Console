import java.time.LocalTime;

public class CurrentHumanFriendlyTime {

    public static void main(String[] args){

        String[] time = LocalTime.now().toString().split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);

        if(hours>12)
            hours = hours - 12;

        String humanFriendlyTime = convertToHumanFriendlyTime(hours, minutes);
        System.out.println(humanFriendlyTime);
    }

    public static String convertToHumanFriendlyTime(int hours, int mins){

        String humanFriendlyTime="";
        String[] friendlyTimes = {"twelve", "one", "two", "three", "four",
                                        "five", "six", "seven", "eight", "nine",
                                        "ten", "eleven", "twelve", "thirteen",
                                        "fourteen", "fifteen", "sixteen", "seventeen",
                                        "eighteen", "nineteen", "twenty", "twenty one",
                                        "twenty two", "twenty three", "twenty four",
                                        "twenty five", "twenty six", "twenty seven",
                                        "twenty eight", "twenty nine"};

        if (hours > 12)
            hours = hours - 12;

        if(mins == 0)
            humanFriendlyTime = friendlyTimes[hours] + " o' clock";
        else if(mins == 1)
            humanFriendlyTime = "one minute past " + friendlyTimes[hours];
        else if(mins == 15)
            humanFriendlyTime = "quarter past " + friendlyTimes[hours];
        else if (mins == 30)
            humanFriendlyTime = "half past " + friendlyTimes[hours];
        else if (mins == 45)
            humanFriendlyTime = "quarter to " + friendlyTimes[(hours % 12) + 1];
        else if(mins == 59)
            humanFriendlyTime = "one minute to " + friendlyTimes[(hours % 12) + 1];
        else if (mins <= 30)
            humanFriendlyTime = friendlyTimes[mins] + " minutes past " + friendlyTimes[hours];
        else if (mins > 30)
            humanFriendlyTime = friendlyTimes[60 - mins] + " minutes to " + friendlyTimes[(hours % 12) + 1];

        return humanFriendlyTime;
    }
}
