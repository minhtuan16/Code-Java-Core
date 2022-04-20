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

public class PersonDaoIMPL implements PersonDao {

	@Override
	public void insert(Person p) {

		String sql = "INSERT INTO PERSON(id, name, address) VALUES (?, ?, ?)";

		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			pS.setInt(1, p.getId());
			pS.setString(2, p.getName());
			pS.setString(3, p.getAddress());

			pS.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Loi insert !");
			e.printStackTrace();
		}

	}

	@Override
	public void update(Person p) {

		String sql = "UPDATE PERSON SET name = ? address = ? WHERE id = ?";

		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			pS.setString(1, p.getName());
			pS.setString(2, p.getAddress());
			pS.setInt(3, p.getId());

			pS.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Loi update !");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {

		String sql = "DELETE FROM PERSON WHERE id = ?";

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
	public List<Person> selectAll() {

		String sql = "SELECT id, name, address, email FROM PERSON";
		Connection conn = JDBCConnection.getConn();

		try {
			PreparedStatement pS = conn.prepareStatement(sql);

			ResultSet rs = pS.executeQuery();
			List<Person> personList = new ArrayList<Person>();
			while (rs.next()) {
				Person p1 = new Person();
				p1.setId(rs.getInt("id"));
				p1.setName(rs.getString("name"));
				p1.setAddress(rs.getString("address"));

				personList.add(p1);
			}
			return personList;
		} catch (SQLException e) {
			System.out.println("Loi selectAlll !");
			e.printStackTrace();
		}

		return null;
	}

}
