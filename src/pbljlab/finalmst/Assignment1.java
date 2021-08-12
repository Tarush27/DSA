package pbljlab.finalmst;

import java.io.*;
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter name: ");
        emp.setName(sc.nextLine());
        System.out.print("Enter D.O.B.: ");
        emp.setDob(sc.nextLine());
        System.out.print("Enter department: ");
        emp.setDepartment(sc.nextLine());
        System.out.print("Enter designation: ");
        emp.setDesignation(sc.nextLine());
        System.out.print("Enter salary: ");
        emp.setSalary(sc.nextDouble());
        sc.nextLine();

        ObjectOutputStream oos;
        FileInputStream fis;
        ObjectInputStream ois;
        try (FileOutputStream fos = new FileOutputStream("OutObject.txt")) {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);

            fis = new FileInputStream("OutObject.txt");
            ois = new ObjectInputStream(fis);
            Employee emp2 = (Employee) ois.readObject();

            System.out.println("Name: " + emp2.getName());
            System.out.println("D.O.B.: " + emp2.getDob());
            System.out.println("Department: " + emp2.getDepartment());
            System.out.println("Designation: " + emp2.getDesignation());
            System.out.println("Salary: " + emp2.getSalary());

            fos.close();
        }
        oos.close();
        fis.close();
        ois.close();
        sc.close();
    }


}
