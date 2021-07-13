package shafi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Taking Input(Section) From User
        String section;
        System.out.print("Enter Your Section: ");
        section=input.next();

        Info ObjInfo = new Info(); //object of Info class
        Hobby ObjHobby = new Hobby(); //object of Hobbby class

        //Printing Informations
        System.out.println("\n"+"Informations: ");
        System.out.println("Section: "+ section);
        System.out.println( "Name: " + ObjInfo.name);
        System.out.println( "ID: " + ObjInfo.id);
        System.out.println("Hobby: " + ObjHobby.hobbyName);
    }
}
/*
Name: Md.Abidur Rahman Shafi
ID:2012020121
Section:C

E-mail:
Academic: cse_2012020121@lus.ac.bd
NonAcademic: abidurrahman780@gmail.com

Date:13/07/2021
 */


