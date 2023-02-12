import javax.swing.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) 
    {
 //q1       
double average;
String m1 = JOptionPane.showInputDialog("What is the name of the first item?");
String m2= JOptionPane.showInputDialog("What is the price?");
double d1=Double.parseDouble(m2);
String m3= JOptionPane.showInputDialog("What is the name of the next item?");
String m4 =JOptionPane.showInputDialog("What is the price?") ;
double d2 = Double.parseDouble(m4);
String m5= JOptionPane.showInputDialog("What is the name of the last item?");
String m6=JOptionPane.showInputDialog("What is the price?");
double d3 = Double.parseDouble(m6);
average= (01+02+03) /(3);

System.out.println("The names of the items are " + m1 + ", " + m3 + ","
+ m5 + " and the average is " + average);


//q2
if (m1.equalsIgnoreCase("Peas") || m3.equalsIgnoreCase("Peas")  || m5.equalsIgnoreCase("Peas"))
{
    System.out.println("The names of the items are " + m1 + ", " + m3 + ","
    + m5 + " and the average is " + average);
}else{
    System.out.println("no average output");  
}
//q3
Scanner sc = new Scanner(System.in);
int n;

System.out.println("Enter number of items to process");
n = sc.nextInt();

String itemNames[] = new String[n];
double itemPrice[] = new double[n];

for(int i=0;i<n;i++) {
    System.out.println("Enter the Item "+(i+1)+" details");
    System.out.print("Enterthe Item Name:");
        itemNames[i] = sc.next();
        System.out.print("Enter the Item Price:");
        itemPrice[i] = sc.nextDouble();
}


System.out.println("Item details backwords:");
System.out.println("Item Name \t Item Price");
    for(int i=n-1;i>=0;i--) {
    System.out.println(itemNames[i]+"\t\t"+itemPrice[i]);
    }


int totalWithNamePeas=0;
    double averagePricePeas;
    double sum =0;
    for(int i=0;i<n;i++) {
        if(itemNames[i].equalsIgnoreCase("Peas"))
        {
        sum = sum + itemPrice[i];
        totalWithNamePeas++;
        }
        }
        averagePricePeas = sum/totalWithNamePeas;

if(totalWithNamePeas==0) {
    System.out.println("no average output");
    } else {
    System.out.println("The average price for Peas "+averagePricePeas);


}
}
}

