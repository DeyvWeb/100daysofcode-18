// class MyEmployee{
//     private int id;
//     private String name;
    
//     public void setName(String n)
//     {
//         name = n;
//     }

//     public String getName(){
//         return name;
//     }
    
//     public void setId(int i)
//     {
//         id = i;
//     }

//     public int getId(){
//         return id;
//     }
// }

// class Harryaccessmodifier {
//     public static void main(String[] args) {
//         MyEmployee harry = new MyEmployee();
        
//         // harry.id = 45;          throws an error due to private modifier
//         // harry.name = "Code_with_Harry";
        
//         harry.setName("Code_With_Harry");
//         System.out.println(harry.getName());

//         harry.setId(45);
//         System.out.println(harry.getId());
//     }
// }


// Question : Area and Perimeter of the circle

// class Circle{
//     private double area;
//     private double perimeter;
    

//     public void setRadius1(double radius1){
//         perimeter = (2*3.14*radius1);
//     }

    
//     public double getRadius1(){
//         return perimeter;
//     }

//     public void setRadius(double radius){
//         area = (radius*radius*3.14);
//     }

//     public double getRadius(){
//         return area;
//     }
// }

// class Harryaccesmodifier {
//     public static void main(String[] args) {
//         Circle c = new Circle();
        
//         c.setRadius(2);
//         System.out.println(c.getRadius());

//         c.setRadius1(3);
//         System.out.println(c.getRadius1());


//     }
// }

// package com.company;

// import java.util.Random;
// import java.util.Scanner;

// public class cwh_41_ex2sol {
//     public static void main(String[] args) {
//         // 0 for Rock
//         // 1 for Paper
//         // 2 for Scissor

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
//         int userInput = sc.nextInt();

//         Random random = new Random();
//         int computerInput = random.nextInt(3);

//         if (userInput == computerInput) {
//             System.out.println("Draw");
//         }
//         else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
//                 || userInput == 2 && computerInput == 1) {
//             System.out.println("You Win!");
//         } else {
//             System.out.println("Computer Win!");
//         }
//         // System.out.println("Computer choice: " + computerInput);
//         if(computerInput==0){
//             System.out.println("Computer choice: Rock");
//         }
//         else if(computerInput==1){
//             System.out.println("Computer choice: Paper");
//         }
//         else if(computerInput==2){
//             System.out.println("Computer choice: Scissors");
//         }
//     }
// }


//CONSTRUCTORS MAIN FOCUS

// class MyMainEmployee{
//     private int id;
//     private String name;

//     public MyMainEmployee(){
//         id = 0;
//         name = "Your-Nme-Here";
//     }

//     public MyMainEmployee(String myName){
//         id = 1;
//         name = "Deyvant"; 
//     }

//     public MyMainEmployee(String myName, int myId){
//         id = myId;
//         name = myName; 
//     }
//     public void setId(){
//         this.id = 123232;
//     }
//     public int getId(){
//         return id;
//     }


//     public String getName(){
//         return name;
//     }

//     public void setName(){
//         this.name = "Deyvanttttttttttttttttt";
//     }

//     public void setName(String n){
//         this.name = n;
//     }
// }

// class Harryaccesmodifier{
//     public static void main(String[] args)  {
//         MyMainEmployee me = new MyMainEmployee("Deyvant", 2323);


//         System.out.println(me.getName());


//     }
// }