package day27_accessModifier;

 public class Credentials {

     static String studentName = "Mike";

     static{
         studentName = "Jordan";
     }


     public static void main(String[] args) {
         studentName = "Jean";
         System.out.println(studentName);
     }


}
