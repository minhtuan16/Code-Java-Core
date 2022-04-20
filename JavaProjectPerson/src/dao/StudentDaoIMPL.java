package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Person;
import model.Student;
import model.Teacher;

public class StudentDaoIMPL implements StudentDao {

	PersonDao dao = new PersonDaoIMPL();

	@Override
	public void insert(Student s) {

		String sql = "INSERT INTO STUDENT(person_id, maSV) VALUES (?, ?)";

		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			pS.setInt(1, s.getId());
			pS.setString(2, s.getMaSV());

			pS.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Loi insert !");
			e.printStackTrace();
		}
	}

	@Override
	public void update(Student s) {

		String sql = "UPDATE STUDENT SET maSV = ? WHERE person_id = ?";

		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			pS.setString(1, s.getMaSV());
			pS.setInt(2, s.getId());

			pS.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Loi update !");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		
		String sql = "DELETE FROM STUDENT WHERE person_id = ? ";

		Connection conn = JDBCConnection.getConn();

		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			pS.setInt(1, id);

			pS.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Loi delete !");
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> selectAll() {

		
			String sql = "SELECT person_id, name, address, maSV FROM STUDENT"
					+ " "
					+ "INNER JOIN PERSON ON PERSON.id = STUDENT.person_id";
			Connection conn = JDBCConnection.getConn();

			try {
				PreparedStatement pS = conn.prepareStatement(sql);

				ResultSet rs = pS.executeQuery();
				List<Student> studentList = new ArrayList<Student>();
				while (rs.next()) {
					Student s = new Student();
					s.setId(rs.getInt("person_id"));
					s.setName(rs.getString("name"));
					s.setAddress(rs.getString("address"));
					s.setMaSV(rs.getString("MaSV"));

					studentList.add(s);
				}
				return studentList;
			} catch (SQLException e) {
				System.out.println("Loi selectAlll !");
				e.printStackTrace();
			}
		return null;
	}

}
