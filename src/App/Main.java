package App;

import java.util.Scanner;

public class Main {
    static double firstValue;
    static double secondValue;
    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        if (setFirstValue())
            if (setSecondValue()) {

                DeviceTypeA devA = new DeviceTypeA(firstValue, secondValue);
                devA.сalculation();
                System.out.println(devA.getDeviceMsg());


                DeviceTypeB devB = new DeviceTypeB(firstValue, secondValue);
                devB.сalculation();
                System.out.println(devB.getDeviceMsg());
            }

        sc.close();
    }
    //------------------------------------------------------------------------------------------------------------------
    public static boolean setFirstValue() {

        System.out.println("Enter the first value:");
        String value = sc.nextLine().trim();

        firstValue = Utils.checkNumber(value);
        if (firstValue == -1) {
            System.out.println("No number entered!");
            sc.close();
            return false;
        } else return true;
    }
    //------------------------------------------------------------------------------------------------------------------
    public static boolean setSecondValue() {

        System.out.println("Enter the second value:");
        String value = sc.nextLine().trim();

        secondValue = Utils.checkNumber(value);
        if (secondValue == -1) {
            System.out.println("No number entered!");
            sc.close();
            return false;
        } else return true;
    }
    //------------------------------------------------------------------------------------------------------------------
}
