package StudentManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            connection = DatabaseConnection.getDatabaseConnection();

            // Student student3 = new Student(103, "Ganesh Patil", "Bcom Computers",
            // "Sambhaji Nagar", 8988845995L);
            Student student3 = new Student();

            student3.setStudentName("Virat");
            student3.setStudentClass("B.Tech CSE");
            student3.setStudentAddress("Pune");
            student3.setStudentContactNo(9977495990L);

            student3.setStudentId(105);

            String query = "update student set studentName = '" + student3.getStudentName() + "', studentClass = '"
                    + student3.getStudentClass() + "', studentAddress = '" + student3.getStudentAddress()
                    + "', studentContactN0 = '" + student3.getStudentContactNo() + "' where studentId = '"
                    + student3.getStudentId() + "'";

            Statement statement = connection.createStatement();

            int status = statement.executeUpdate(query);

            if (status > 0) {
                System.out.println("Student data updated in database table.");
            } else {
                System.out.println("Student data not updated in database table.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

}
