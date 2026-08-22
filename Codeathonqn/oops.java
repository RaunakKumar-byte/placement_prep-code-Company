import java.util.*;

abstract class Student{
    private int rollNo;
    private String name;
    private int marks;

    Student(int rollno, String name, int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    int getRollNo(){
        return rollNo;
    }
    String getName(){
        return name;
    }
    int getMarks(){
        return marks;
    }
    void setMarks(){
        this.marks=marks;
    }
    abstract String result();
}
class UGStudent extends Student{
    UGStudent(int r,String n, int m){
        super(r,n,m);
    }

    String result(){
        return getMarks()>=40?"Pass":"Fail";
    }
}
class PGStudent extends Student{
    PGStudent(int r, String n, int m){
        super(r,n,m);
    }

    String result(){
        return getMarks()>=50?"Pass":"Fail";
    }
}

public class oops{

    static Student[] students = new Student[100];
    static int count = 0;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            try{
                int choice=sc.nextInt();

                switch(choice){
                    case 1:
                        int roll = sc.nextInt();
                        String name = sc.next();
                        int marks = sc.nextInt();
                        int type = sc.nextInt();

                        if (marks < 0 || marks > 100)
                            throw new Exception("Invalid marks");

                        if (type != 1 && type != 2)
                            throw new Exception("Invalid student type");

                        if (type == 1)
                            students[count++] = new UGStudent(roll, name, marks);
                        else
                            students[count++] = new PGStudent(roll, name, marks);

                        System.out.println("Student added successfully");
                        break;  

                    case 2:
                            for (int i = 0; i < count; i++) {
                            Student s = students[i];
                            System.out.println(
                                s.getRollNo() + " " +
                                s.getName() + " " +
                                s.getMarks() + " " +
                                s.result()
                            );
                        }
                        break;

                    case 3:
                        roll=sc.nextInt();
                        boolean found=false;

                            for (int i = 0; i < count; i++) {
                            if (students[i].getRollNo() == roll) {
                                Student s = students[i];
                                System.out.println(
                                    s.getRollNo() + " " +
                                    s.getName() + " " +
                                    s.getMarks() + " " +
                                    s.result()
                                );
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                            System.out.println("Student not found");

                        break;

                    case 4:
                        roll = sc.nextInt();
                        int newMarks = sc.nextInt();

                        if (newMarks < 0 || newMarks > 100)
                            throw new Exception("Invalid marks");

                        found = false;

                        for (int i = 0; i < count; i++) {
                            if (students[i].getRollNo() == roll) {
                                students[i].setMarks(newMarks);
                                System.out.println("Marks updated successfully");
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                            System.out.println("Student not found");

                        break;

                    case 5:
                         roll = sc.nextInt();
                        found = false;

                        for (int i = 0; i < count; i++) {
                            if (students[i].getRollNo() == roll) {

                                for (int j = i; j < count - 1; j++)
                                    students[j] = students[j + 1];

                                students[--count] = null;

                                System.out.println("Student deleted successfully");
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                            System.out.println("Student not found");

                        break;
                    case 6:
                    return;

                    default:
                        System.out.println("Wrong choice");


                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}