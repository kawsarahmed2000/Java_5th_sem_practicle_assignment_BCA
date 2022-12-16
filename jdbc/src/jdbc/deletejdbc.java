package jdbc;

import java.sql.*;
import java.util.*;

public class deletejdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
			Statement stmt = con.createStatement();
			Scanner dis = new Scanner(System.in);
			System.out.println("Enter Roll Number of student to be deleted:");
			int s1 = dis.nextInt();
			stmt.executeUpdate("delete from Student where rollNo=(" + s1 + ")");
			System.out.println("One Record Deleted!!!");

		} catch (ClassNotFoundException e) {
		} catch (SQLException e1) {
			System.out.println(e1);
		}

	}
}