class BloodData {
 
    private static String bloodType = "O"; 
    private static char rhFactor = '+';   


    public static void setBlood(String bt) {
        bloodType = bt;
    }


    public static void setRH(char rh) {
        rhFactor = rh;
    }

    public static String getBlood() {
        return bloodType;
    }

    public static char getRH() {
        return rhFactor;
    }

  
    public static void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }


    public static void defaultPatient() {
        bloodType = "A";
        rhFactor = '-';
    }
}

public class TestBloodData {
    public static void main(String[] args) {
        System.out.println("-----jGRASP exec: java TestBloodData");

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter Blood Type: ");
        String bt = input.nextLine();
        BloodData.setBlood(bt);

        System.out.print("Enter Rh Factor: ");
        char rh = input.nextLine().charAt(0);
        BloodData.setRH(rh);

       
        BloodData.displayBloodInfo();

        input.close();
    }
}