import java.util.Objects;
import java.util.Scanner;

public class CarInventory {
    public static void main(String[] args) {
        String [][] cars=new String[][]{{"1", "2", "3"}, {"BMW", "Toyota", "Tesla"}};

        displayGarage(cars);


    }


    public static void displayGarage(String[][] cars) {

        for (int i = 0; i <= cars.length - 1; i++) {
            for (int j = 0; j <= cars[i].length - 1; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void EntryCar(String space, String carName){
        System.out.println("Add new car:");
        Scanner scanner=new Scanner(System.in);


    }
}
