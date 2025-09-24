import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //GETTING PROFESSOR DETAILS
        Professor[] prof = new Professor[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("\nEnter Professor "+(i+1)+"Details:");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("ProfessorId:");
            String ProfessorId = sc.nextLine();
            prof[i]=new Professor(name,age,email,ProfessorId);
            //Assign 1 course for each professor
            System.out.println("Enter the course for this professor");
            String course = sc.nextLine();
            System.out.println("Enter the courseCode for this course");
            String courseCode = sc.nextLine();
            Course c = new Course(course,courseCode);
            prof[i].AssignCourse(c);
        }
        //GETTING STUDENT DETAILS
        student[] stud=new student[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter Student "+(i+1)+"Details:");
            System.out.println("Student Name: ");
            String name = sc.nextLine();
            System.out.println("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Id:");
            int id = sc.nextInt();
            stud[i]=new student(name,age,email,id);
        }
        //Allow Student to choose the course
        for(int i=0;i<3;i++) {
            System.out.println("\nStudent" + stud[i].getName() + "-Choose professor To Enroll your course");
            while (true) {
                //List of professor and courses
                for (int j = 0; j <3; j++) {
                    System.out.println("Professor Name: " + prof[j].getName());
                    prof[j].ListCourses();
                }
                System.out.println("Enter the professor number to enroll for the course(0 to stop)");
                int profchoice = sc.nextInt();
                sc.nextLine();
                if (profchoice == 0) {
                    break;
                }
                if(profchoice >= 1 && profchoice <= stud.length) {
                    Professor p = prof[profchoice-1];
                    if(p.getCourseCount()>0)
                    {
                        Course choosenCourse= p.getCourse(profchoice-1);
                        stud[i].enrollCourse(choosenCourse);
                    }
                    else
                    {
                        System.out.println("Professor"+p.getName()+" has no enrolled courses");
                    }
                }
                else {
                    System.out.println("Select a valid choice");
                }
            }
        }
        }
    }