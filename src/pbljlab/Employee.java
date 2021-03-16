package pbljlab;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args)
    {

        String[][] empTable = new String[][] {
                {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
                {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
                {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
                {"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
                {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
                {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
                {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };
        String[][] daTable = new String[][] {
                {"e", "Engineer", "20000"},
                {"c", "Consultant", "32000"},
                {"k", "Clerk", "12000"},
                {"r", "Receptionist", "15000"},
                {"m", "Manager", "40000"}
        };
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter employee code- ");
        int EmpNo= sc.nextInt();
        int rowSize = empTable.length;
        int flag=-1;
        for (int i = 0; i < rowSize; i++) {
            if (EmpNo == Integer.parseInt(empTable[i][0])) {
                flag=i;
                break;
            }
        }
        if(flag!=-1){

            String des="";
            int da=0;
            int basic=Integer.parseInt(empTable[flag][5]);
            int hra=Integer.parseInt(empTable[flag][6]);;
            int it=Integer.parseInt(empTable[flag][7]);
            for(int i=0;i<daTable[0].length;i++)
                if(empTable[flag][3]==daTable[i][0]){
                    des=daTable[i][1];
                    da=Integer.parseInt(daTable[i][2]);
                    break;
                }
            int totalSal=da+basic+hra-it;

            System.out.println("EmpNo: " + empTable[flag][0]);
            System.out.println("Emp Name: " + empTable[flag][1]);
            System.out.println("Department: " + empTable[flag][4]);
            System.out.println("Designation: " + des);
            System.out.println("Salary: " + totalSal);
        }
        else{
            System.out.println("Employee with empid "+EmpNo+ " does not exist");
        }
    }
}
