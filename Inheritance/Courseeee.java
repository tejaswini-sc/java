import java.util.*;

class Course {
    private String courseName;
    private String courseCode;

    public void setData(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getDetails() {
        return "Course Name: " + courseName + ", Course Code: " + courseCode;
    }
}

class OnlineCourse extends Course {
    private String platform;

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Platform: " + platform;
    }
}

class OfflineCourse extends Course {
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Location: " + location;
    }
}

public class Courseeee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String s = scanner.nextLine();

        String[] a = s.split(" ");

        String courseName = a[0];
        String courseCode = a[1];

        if (type.equals("OnlineCourse")) {
            String platform = a[2];

            OnlineCourse oc = new OnlineCourse();
            oc.setData(courseName, courseCode);
            oc.setPlatform(platform);

            System.out.print("Course Details: " + oc.getDetails());
        } 
        else if (type.equals("OfflineCourse")) {
            String location = a[2];

            OfflineCourse ofc = new OfflineCourse();
            ofc.setData(courseName, courseCode);
            ofc.setLocation(location);

            System.out.print("Course Details: " + ofc.getDetails());
        }

        scanner.close();
    }
}