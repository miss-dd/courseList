import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseList {
    private List<Course> courses;

    public CourseList() {
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        Collections.sort(courses);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Course> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public static void main(String[] args) {
        // Create a new CourseList
        CourseList courseList = new CourseList();

        // Add some courses to the list
        Course course1 = new Course("CS", 101);
        Course course2 = new Course("MATH", 201);
        Course course3 = new Course("PHYS", 101);
        courseList.addCourse(course1);
        courseList.addCourse(course2);
        courseList.addCourse(course3);

        // Get a list of all courses in the CourseList
        List<Course> allCourses = courseList.getCourses();
        System.out.println("All courses in the list:");
        for (Course course : allCourses) {
            System.out.println(course);
        }

        // Remove a course from the list
        courseList.removeCourse(course2);

        // Get a list of all courses in the CourseList again
        allCourses = courseList.getCourses();
        System.out.println("All courses in the list after removing " + course2 + ":");
        for (Course course : allCourses) {
            System.out.println(course);
        }
    }
}
