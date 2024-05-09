package StudentManagement;

public class Student {

    private int studentId;
    private String studentName;
    private String studentClass;
    private String studentAddress;
    private long studentContactNo;

    public Student() {

    }

    public Student(int studentId, String studentName, String studentClass, String studentAddress,
            long studentContactNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentAddress = studentAddress;
        this.studentContactNo = studentContactNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public long getStudentContactNo() {
        return studentContactNo;
    }

    public void setStudentContactNo(long studentContactNo) {
        this.studentContactNo = studentContactNo;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
                + ", studentAddress=" + studentAddress + ", studentContactNo=" + studentContactNo + "]";
    }

}
