/**
 * Created by meudecc on 15/02/2017.
 */
public class Student {

    public enum AttendanceGrade {ABSENT, VERY_POOR, POOR, AVERAGE, GOOD, VERY_GOOD};

    public AttendanceGrade getAttendanceGrade(int attendance) {
        if (attendance < 0 || attendance > 100) throw new IllegalArgumentException();
        if (attendance == 0) return AttendanceGrade.ABSENT;
        if (attendance < 30) return AttendanceGrade.VERY_POOR;
        if (attendance < 50) return AttendanceGrade.POOR;
        if (attendance < 70) return AttendanceGrade.AVERAGE;
        if (attendance <= 90) return AttendanceGrade.GOOD;
        return AttendanceGrade.VERY_GOOD;
    }

    public static void main(String[] args) {
        Student student = new Student();
        int attendance = 85; // replace with actual attendance
        AttendanceGrade grade = student.getAttendanceGrade(attendance);
        System.out.println("The attendance grade for an attendance of " + attendance + "% is: " + grade);
    }
}
