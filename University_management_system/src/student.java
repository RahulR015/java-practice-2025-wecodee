public class student extends person{
    private int  id;
    private Course[] courses;
    private int CourseCount;
    public student(String name,int age,String email,int id)
    {
        super(name,age,email);
        this.id=id;
        courses=new Course[5];
        CourseCount=0;
    }
    public void enrollCourse(Course c){
        if(CourseCount<courses.length) {
            courses[CourseCount] = c;
            CourseCount++;
            System.out.println(getName() + " Enrolled in " + c.getCourseName());
        }
        else
        {
            System.out.println("assign course was reached its limits");
        }
    }
    public void ListCourses() {
        if(CourseCount>0) {
            System.out.println("Courses of student " + getName() + ":");
            for (int i = 0; i < CourseCount; i++) {
                System.out.println("- " + courses[i].getCourseName());
            }
        }
        else
            {
              System.out.println("No courses of student " + getName());
            }
    }

}
