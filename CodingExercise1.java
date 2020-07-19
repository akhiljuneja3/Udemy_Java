public class CodingExercise1 {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        double milesPerHour;
        if(kilometersPerHour<0)
            return -1;
        else
            milesPerHour = kilometersPerHour/1.609;
        return Math.round(milesPerHour);

    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0)
            System.out.println("Invalid Value");
        else{
            long milesPerHour = Math.round(kilometersPerHour/1.609);
            System.out.println(kilometersPerHour +" km/h = "+milesPerHour+" mi/h");
        }
    }
}