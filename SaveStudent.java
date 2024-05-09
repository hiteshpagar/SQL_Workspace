package StudentManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveStudent {

	public static void main(String[] args) throws SQLException {

		Connection connection = null;

		try {

			connection = DatabaseConnection.getDatabaseConnection();

			//Student student3 = new Student(101, "Hitesh", "BE.Computer", "Pune", 9022548458L);
			//Student student3 = new Student(102, "Pranav", "B.Tech.Computer", "Nagpur", 9022888458L);
			//Student student3 = new Student(103, "Rushikesh", "BE.Computer", "Pune", 9022854758L);
			//Student student3 = new Student(104, "Manmath", "BE.Computer", "Latur", 9085548458L);
			//Student student3 = new Student(105, "Rahul", "B.Tech.Computer", "Mumbai", 9857548458L);
			//Student student3 = new Student(105, "Rahul", "B.Tech.Computer", "Mumbai", 7757548458L);
			//Student student3 = new Student(106, "Rahul", "B.Tech.Computer", "Mumbai", 8857548458L);
		   //Student student3 = new Student(107, "Kiran", "BE.Computer", "Nashik", 8857548458L);
			Student student3 = new Student(108, "Rohit", "BE.Computer", "Satara", 7357548458L);

			

			// SQL query for insert data into database table student
			// String query = "insert into student values(214, 'Anurada', 'BCA', 'Nashik',
			// 7088845565)";

			String query = "insert into student values('" + student3.getStudentId() + "', '" + student3.getStudentName()
					+ "', '" + student3.getStudentClass() + "', '" + student3.getStudentAddress() + "', '"
					+ student3.getStudentContactNo() + "')";

			Statement statement = connection.createStatement();

			int status = statement.executeUpdate(query);

			if (status > 0) {
				System.out.println("Student data stored in database table.");
			} else {
				System.out.println("Student data not stored in database table.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}

}
