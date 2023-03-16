import java.util.*;

public class Course implements Comparable<Course> {
    private String department;
    private int courseNumber;

    public Course(String department, int courseNumber) {
        this.department = department;
        this.courseNumber = courseNumber;
    }

    public String getDepartment() {
        return department;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    @Override
    public String toString() {
        return department + " " + courseNumber;
    }

    @Override
    public int compareTo(Course other) {
        if (this.department.equals(other.department)) {
            return Integer.compare(this.courseNumber, other.courseNumber);
        } else {
            return this.department.compareTo(other.department);
        }
    }
}