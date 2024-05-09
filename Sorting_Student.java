package StudentManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_Student {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            connection = DatabaseConnection.getDatabaseConnection();

            String query = "select * from student";

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            List<Student> listOfStudents = new ArrayList<Student>();

            while (rs.next()) {

                int id = rs.getInt(1);
                String name = rs.getString(2);
                String sClass = rs.getString(3);
                String address = rs.getString(4);
                String sContact = rs.getString(5);

                long contact = Long.parseLong(sContact);

                Student student = new Student(id, name, sClass, address, contact);

                listOfStudents.add(student);

            }

            listOfStudents.forEach(System.out::println);

            System.out.println("---------------------------------------------------------------------------");

            List<Student> sortedListOfStudents = listOfStudents.stream()
                    .sorted(Comparator.comparing(Student::getStudentContactNo)).collect(Collectors.toList());

            sortedListOfStudents.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

}
