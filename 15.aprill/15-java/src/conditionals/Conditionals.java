package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        displayWeatherDescription(16);
    }

    static void displayWeatherDescription(double currentTemperature) {
        if (currentTemperature > 15) {
            System.out.println("It is warm outside");
        } else if (currentTemperature > 0){
            System.out.println("It is chilly outside");
        } else {
            System.out.println("It is freezing outside");
        }
    }

    public static void timeTask(String task) {

        switch (task) {
            case "STUDY":
                System.out.println("It is time to study!");
                break;
            case "WORK":
                System.out.println("It is time to work!");
                break;
            case "REST":
                System.out.println("dont tell me twice!");
                break;
            default:
                System.out.println("dont know what to do");

                break;
        }

    }
}
