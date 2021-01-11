public class Student {
    private String major;
    private String phone;

    public Student(String major, String phone){
        this.major = major;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                "password='" + super.getPassword(0) + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
