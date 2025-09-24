public class Course {
    private String courseName;
    private String courseCode;
    private String professor;
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public String GetProfessor() {
        return professor;
    }
}
