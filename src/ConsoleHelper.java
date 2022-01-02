import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString(){

        try {
            String string = bufferedReader.readLine();
            return string;
        } catch (IOException e) {
            System.out.println("An error occurred while trying to enter text. Try again.");
            return readString();
        }
    }

    public static int readInt(){
        try {
            int i = Integer.parseInt(readString());
            return i;
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while trying to enter a number. Try again.");
            return readInt();
        }

    }

    public static double readDouble(){
        try {
            double i = Double.parseDouble(readString());
            return i;
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while trying to enter a number. Try again.");
            return readDouble();
        }
    }

    public static void printMatrix(int [][] arr){
        System.out.println("Matrix: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}