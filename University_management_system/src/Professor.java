public class Professor extends person{
    private String ProfessorId;
    private Course[] courses;
    private int CourseCount;

    public Professor( String name, int age, String email,String ProfessorId) {
        super(name, age, email);
        this.ProfessorId = ProfessorId;
        courses = new Course[5];
        CourseCount = 0;
    }
    public void AssignCourse(Course c){
        if(CourseCount<courses.length) {
            courses[CourseCount] = c;
            CourseCount++;
            System.out.println(getName() + " Assigned Course " + c.getCourseName()+" "+c.getCourseCode());
        }
        else
        {
            System.out.println("assign course was reached its limits");
        }
    }
    public void ListCourses(){
        System.out.println("Course thought by professor "+getName()+":");
        for( int i=0; i<CourseCount; i++ )
        {
            System.out.println("- "+courses[i].getCourseName());
        }
    }
    public Course getCourse(int index) {
        if (index >= 0 && index < CourseCount) {
            return courses[index];
        }
        return null;
    }

    public int getCourseCount() {
        return CourseCount;
    }
}
