//@Author  :Sahaya Reshma.A
//Title    :Print teacher and student dertails using inherit

package Inheritance;
 class Teacher{
Teacher(){
}
String T_name;
String T_Qualifiaction;
String T_Subject;
String T_Position;
Teacher(String T_name, String T_Qualifiaction, String T_Subject, String T_Position)
{
this.T_name = T_name;
this.T_Qualifiaction = T_Qualifiaction;
this.T_Subject = T_Subject;
this.T_Position = T_Position;
}
class Student extends Teacher
{
String S_name;
int S_Id;
long S_year;
String S_Department;
Student (String S_name, int S_Id , long S_year , String S_Department)
{
this.S_name = S_name;
this.S_Id = S_Id;
this.S_year = S_year;
this.S_Department = S_Department;
}
}
public class School
{
public static void main(String[]args)
{
Teacher obj = new Teacher(" Armaan" , " D.Ed.A" , " Bussiness Maths" , " CAO");
Student obj1 = new Student(" Anirudh" ,  7 ,  2022 , " Commerce");
System.out.println("        ");
System.out.println("Teacher name is" + obj.T_name);
System.out.println("Teacher Qualification is" + obj.T_Qualifiaction);
System.out.println("Subject taken by teacher is" + obj.T_Subject);
System.out.println("Teacher position in school is" + obj.T_Position);
System.out.println("        ");
System.out.println("Student name is" + obj1.S_name);
System.out.println("Student id is " + obj1.S_Id);
System.out.println("Student year is " + obj1.S_year);
System.out.println("Student Department is" + obj1.S_Department);
}
}
