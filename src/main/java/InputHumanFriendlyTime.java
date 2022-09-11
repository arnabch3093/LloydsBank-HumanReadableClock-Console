import exception.CustomException;
import exception.CustomExceptionType;

import java.util.Scanner;

public class InputHumanFriendlyTime {

    public static void main(String[] args){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the time in 24 hours format");
            String time = sc.next();
            int[] timeIntFormat = validateInput(time);

            String humanFriendlyTime = CurrentHumanFriendlyTime.convertToHumanFriendlyTime(timeIntFormat[0], timeIntFormat[1]);
            System.out.println(humanFriendlyTime);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }

    private static int[] validateInput(String time) throws CustomException {
        int[] timeInt = new int[2];
        int hours, minutes;
        try{
            String[] timeInHHMM = time.split(":");
            hours = Integer.parseInt(timeInHHMM[0]);
            minutes = Integer.parseInt(timeInHHMM[1]);
            timeInt[0] = hours;
            timeInt[1] = minutes;
        } catch (Exception ce){
            throw new CustomException(CustomExceptionType.INVALID_FORMAT);
        }

        if(timeInt[0]<0 || timeInt[0]>23)
            throw new CustomException(CustomExceptionType.INVALID_INPUT);

        if(timeInt[1]<0 || timeInt[1]>59)
            throw new CustomException(CustomExceptionType.INVALID_INPUT);

        return timeInt;
    }


}
