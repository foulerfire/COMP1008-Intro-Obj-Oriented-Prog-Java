import java.util.Scanner;
 
public class WeatherReport {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String dailyWeather;
    String precipChance;
    String windSpeed;
    double highTemp;
    double lowTemp;
    int uvIndex;

    System.out.print("Enter the daily weather: ");
    dailyWeather = input.nextLine(); //get input and assign to dailyWeather variable
            
    System.out.print("Enter chance of precipitation: ");
    precipChance = input.nextLine(); //get input and assign to precipChance variable
    
    System.out.print("Enter the daily windspeed: ");
    windSpeed = input.nextLine(); //get input and assign to windSpeed variable

    while (true) { 
        System.out.print("Enter daily High temperature");
        if(input.hasNextDouble()){
            highTemp = input.nextDouble();
            input.nextLine();
            break;
        }
        else{
            System.out.println("Sorry you did not enter a number, please try again");
            input.nextLine();
        }
    }

    while (true) { 
        System.out.print("Enter daily Low temperature");
        if(input.hasNextDouble()){
            lowTemp = input.nextDouble();
            input.nextLine();
            break;
        }
        else{
            System.out.println("Sorry you did not enter a number, please try again");
            input.nextLine();
        }
    }

    while (true) { 
        System.out.print("Enter daily UV Index");
        if(input.hasNextInt()){
            uvIndex = input.nextInt();
            input.nextLine();
            break;
        }
        else{
            System.out.println("Sorry you did not enter a number, please try again");
            input.nextLine();
        }
         input.close();
    }
 
        int highAsInt = (int) highTemp;
        int lowAsInt = (int) lowTemp;
 
        String uvTip;

        if (uvIndex >= 6) {
            uvTip = "Use sunscreen!";
        }
        else if (uvIndex >= 3) {
            uvTip = "Moderate UV, be careful.";
        }
        else {
            uvTip = "UV is low.";
        }
 
        String fullReport =
        "\n--- Weather Report ---\n" +
        "Weather: " + dailyWeather + "\n" +
        "Precip: " + precipChance + "\n" +
        "Wind: " + windSpeed + "\n" +
        "High: " + highTemp + " (int: " + highAsInt + ")\n" +
        "Low: " + lowTemp + " (int: " + lowAsInt + ")\n" +
        "UV: " + uvIndex + "\n" +
        "Tip: " + uvTip + "\n";

         System.out.println(fullReport);

        input.close();
       
    }
}
 