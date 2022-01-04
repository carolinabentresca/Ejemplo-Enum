package Enum_Emp;

public class Enum_Empanadas {

    public static void main(String[] args) {
        for (Empanada elem : Empanada.values()) {
            System.out.println("****************************");
            System.out.println(elem.toString());
        }

    }
}
