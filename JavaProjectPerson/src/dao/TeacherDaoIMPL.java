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

public class TeacherDaoIMPL implements TeacherDao {

	PersonDao dao = new PersonDaoIMPL();

	@Override
	public void insert(Teacher t) {

		String sql = "INSERT INTO TEACHER(person_id, email) VALUES (?, ?)";

		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			pS.setInt(1, t.getId());
			pS.setString(2, t.getEmail());

			pS.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Loi insert !");
			e.printStackTrace();
		}
	}

	@Override
	public void update(Teacher t) {

		String sql = "UPDATE TEACHER SET email = ? WHERE person_id = ?";

		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			pS.setString(1, t.getEmail());
			pS.setInt(2, t.getId());

			pS.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Loi update !");
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		
		String sql = "DELETE FROM TEACHER WHERE person_id = ? ";

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
	public List<Teacher> selectAll() {

		
			String sql = "SELECT person_id, name, address, email FROM TEACHER"
					+ " "
					+ "INNER JOIN PERSON ON PERSON.id = TEACHER.person_id";
			Connection conn = JDBCConnection.getConn();

			try {
				PreparedStatement pS = conn.prepareStatement(sql);

				ResultSet rs = pS.executeQuery();
				List<Teacher> teacherList = new ArrayList<Teacher>();
				while (rs.next()) {
					Teacher t = new Teacher();
					t.setId(rs.getInt("person_id"));
					t.setName(rs.getString("name"));
					t.setAddress(rs.getString("address"));
					t.setEmail(rs.getString("email"));

					teacherList.add(t);
				}
				return teacherList;
			} catch (SQLException e) {
				System.out.println("Loi selectAlll !");
				e.printStackTrace();
			}
		return null;
	}

}
