import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner (System.in);
        System.out.println("This code Is Used To Compute For The Net Pay Of Employees In A Particular Company.\n");
        double grossPay , netPay, incomeTax, nationalLevy, districtTax,payMent;
        //Starting The Main Code
        System.out.println("Please enter the gender of the person:");
        String gender = inputScanner.nextLine();
        System.out.println("Please , enter the hours worked by the person: ");
        int hours = inputScanner.nextInt();
        //Starting a nested if statement 
        if (hours<=40){
            System.out.println("It's regular Hours");
            if (gender.equals("male")) {
                grossPay = 500*hours;
            }else{
                grossPay = 550*hours;
            }
            }else{
                System.out.println ("It is an over time.");
                if(gender.equals("male")) {
                    grossPay = (1.5*500*(hours-40)) +(500*40);
                } else{
                    grossPay = (1.5*550*(hours-40)) + (550*40);
                }
            }
            //Writing the code for the number of children
            System.out.println("Please, enter the number of children:");
            int children = inputScanner.nextInt();
            if (children<=3) {
                payMent = children*10;
            } else {
                payMent = 30 +(children-3)*20;
            }
            incomeTax = 0.15*grossPay;
            nationalLevy = 0.025*grossPay;
            districtTax = 0.01*grossPay;
            netPay = grossPay - (incomeTax+nationalLevy+districtTax +payMent);

            System.out.println("The net pay of the employee is: " +netPay);

            inputScanner.close();
        }
        
    }
