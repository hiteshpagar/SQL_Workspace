package StudentManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            connection = DatabaseConnection.getDatabaseConnection();

            Student student3 = new Student();

            student3.setStudentId(106);

            String query = "delete from student where studentId = '" + student3.getStudentId() + "'";

            Statement statement = connection.createStatement();

            int status = statement.executeUpdate(query);

            if (status > 0) {
                System.out.println("Student data deleted from database table.");
            } else {
                System.out.println("Student data not deleted from database table.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

}
