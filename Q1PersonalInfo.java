program that prints your name, college name, and current date 

import java.util.Scanner;
import java.time.LocalDate;
public class Classroom{
    public static void main(String[]args){
        String name="Ranbeer";
        String college="WIT SOLAPUR";
        LocalDate currentdate=LocalDate.now();

        System.out.println("Name: "+ name);
        System.out.println("College: "+ college);
        System.out.println("Date: "+ currentdate);
    }
}

