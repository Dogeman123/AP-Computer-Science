// Michael Verdin
// Student Database
//12/13/22
import java.util.*;
import java.util.ArrayList;
public class StudentDataBase {
    public static int indexOfStu(ArrayList<Student> db, int id){
        int index = -1;
        for (int lcv =0; lcv <db.size(); lcv++)
            if (db.get(lcv).getId()==id) index =lcv;
        return index;
    }

    public static void printStu(Student stu){

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Menu:\n");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for student (by id)");
            System.out.println("4 - Search for student (by last name)");
            System.out.println("5 - Modify a student's GPA");
            System.out.println("6 - Remove student (by id)");
            System.out.println("7- Exit\n\nPlease enter your choice: ");
            int c = input.nextInt();
            ArrayList<Student> db = new ArrayList<Student>();

            if (c==1){
                System.out.println("Enter first name:");
                String first = input.next();
                System.out.println("Enter student ID: ");
                String last = input.next();
                System.out.println("Enter student ID: ");
                int id = input.nextInt();
                System.out.println("Enter GPA: ");
                double gpa = input.nextDouble();
                Student st = new Student(first,last,id,gpa);
                db.add(st);
            } else if (c==2){
                System.out.println("First\nLast\nID\nGPA");
                for(Student stu : db)
                    System.out.printf("%s\t%s\t%d\t%f\n",stu.getFirstName(),
                            stu.getLastName(), stu.getId(), stu.getGPA());
            } else if (c==3){
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStu(db, id);
                if(index != -1) printStu(db.get(index));
                else System.out.print("No student was found with that ID.");
            } else if (c==4){
                System.out.print("Enter last name: ");
                String last = input.next();
                int index = indexOfStu(db, last);
                if(index != -1) printStu(db.get(index));
                else System.out.println("No studnet was found with that last name.");
            } else if (c==5){

            } else if (c==6){

            } else if (c==7){
                return;
            }

            }

        }
    }

