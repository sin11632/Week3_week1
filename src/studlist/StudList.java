package studlist;

import java.util.Scanner;

public class StudList {

    public static void main(String[] args) {
        
        Student [] sList=new Student[3];
        Scanner input=new Scanner(System.in);
        

    for(int i=0;i<=sList.length -1;i++)
    {
        sList[i]=new Student(); //initialize the object
        System.out.println("Enter student name:");
        sList[i].setName(input.nextLine());//store value in to the array of the objects
        
    }
    
    for(int i=0;i<=sList.length -1; i++)
    {
        System.out.println("Student name: "+sList[i].getName());
    }
    }
    
}
