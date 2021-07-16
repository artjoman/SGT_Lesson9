public class Lesson9 {

    public static void main(String[] args) {

        int[] firstArray = new int[3];
        firstArray[0] = 55;
        firstArray[1] = 1900;
        firstArray[2] = 1;

        System.out.println("This is the FIRST element: " + firstArray[0]);
        System.out.println(" I want to get 1900. here it is " + firstArray[1]);


        // Shorthand array initialization
        int[] temperatures = {33, 34, 31, 30, 29, 28, 36};
        System.out.println("This is the temperature for Friday: " + temperatures[4]);
        System.out.println(" In temperatues array we have " + temperatures.length + " elements");
        System.out.println("last element in the array is: " + temperatures[temperatures.length - 1]);

        int[] weatherForecast = new int[7];
        weatherForecast[0] = 29;
        weatherForecast[1] = 31;
        weatherForecast[2] = 30;
        weatherForecast[3] = 30;
//        int[] weatherForecast = {29, 31, 30};
        weatherForecast[4] = 37;
        weatherForecast[5] = 30;
        weatherForecast[6] = 19;

        double averageTemperature =
                (weatherForecast[0] + weatherForecast[1] + weatherForecast[2] + weatherForecast[3]
                        + weatherForecast[4] + weatherForecast[5] + weatherForecast[6]) / 7d;
        System.out.println("Average temperature for the week is " + averageTemperature + " degrees");


        // LOOPS
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! You are in an iteration! " + i);
        }


        // INFINITE LOOP
//        for (int i = 0; i < 10; i--) {
//            System.out.println("New iteration:" + i);
//        }


        int counter = 0;


        for (int i = 59; i < 1005; i++) {
            System.out.println("This is iteration #" + counter);
            counter++;
        }

        counter = 1;

        for (int currentTime = 8; currentTime < 12; currentTime++) {
            System.out.println("BOM BOM! It is " + currentTime + " o'clock");
            System.out.println("This is the " + counter + " time the clock alarmed ");
            counter = counter + 1;
        }


        // ARRAYS + LOOPS

        int[] grades = {1, 9, 7, 8, 9, 9, 5, 8, 9, 1, 2, 9, 8, 10, 7, 8, 1, 10, 10, 6};

        int gradeSum = 0;

//        double average = (grades[0] + grades[1] + grades[2] + grades[3] .... ) / grades.length;

        for (int i = 0; i < grades.length; i++) {
            gradeSum += grades[i];
        }

        System.out.println("Sum of all the grades is " + gradeSum);

        double averageGrade = gradeSum / (double)grades.length;

        System.out.println("The average grade is:" + averageGrade);


        boolean[] arrayOfBooleans = {true, false, true, false};

        String[] arrayOfStrings = { "Message 1", "Message 2", "Message 3" };

        double monthlySalary[] = { 1000, 1100, 1200d, 1300d, 1400d };

        boolean[] covidTests = { false, false, false, false, false };

        String[] students = { "Artjoms", "Laura", "Oxana", "Tatjana" };


        // Circle K coffee
        for (int i = 0; i < 10000; i++) {
            if( i % 7 == 0) {
                System.out.println("This coffee is for FREE!!!");
            } else {
                System.out.println("You need to pay for this cup of coffee #" + i);
            }

        }
    }
}
