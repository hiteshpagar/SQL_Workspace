package StudentManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudent {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            connection = DatabaseConnection.getDatabaseConnection();

            Student student3 = new Student();
            student3.setStudentId(101);

            String query = "select * from student where studentId = '" + student3.getStudentId() + "'";

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {

                int id = rs.getInt(1);
                String name = rs.getString(2);
                String sClass = rs.getString(3);
                String address = rs.getString(4);
                String sContact = rs.getString(5);

                long contact = Long.parseLong(sContact);

                Student student = new Student(id, name, sClass, address, contact);

                System.out.println(student);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

}
