package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Khoa;
import model.Lop;
import model.SinhVien;

public class LopDaoIMPL implements LopDao {

	@Override
	public void insert(Lop lop) {

		String sql = "INSERT INTO LOP(MaLop, TenLop, MaKhoa) "
				+ "VALUES (?, ?, ?)";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, lop.getMaLop());
			ps.setString(2, lop.getTenLop());
			ps.setString(3, lop.getMaKhoa());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Loi insert !");
			e.printStackTrace();
		}
	}

	@Override
	public void update(Lop lop) {

		String sql = "UPDATE LOP set TenLop = ?, MaKhoa = ? WHERE MaLop = ?";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, lop.getTenLop());
			ps.setString(2, lop.getMaKhoa());
			ps.setInt(3, lop.getMaLop());
			
			ps.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Loi update !");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int MaLop) {

		String sql = "DELETE FROM SINHVIEN WHERE MaLop = ?";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, MaLop);
			
			ps.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Loi delete !");
			e.printStackTrace();
		}
	}

	@Override
	public List<Lop> selectAll() {

		String sql = "SELECT l.MaLop, TenLop, k.MaKhoa FROM Lop l "
				+ "INNER JOIN Khoa k ON k.MaKhoa = l.MaKhoa;";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<Lop> lists = new ArrayList<Lop>();
			
			while(rs.next()) {
				
				Lop lop = new Lop();
				lop.setMaLop(rs.getInt("MaLop"));
				lop.setTenLop(rs.getString("TenLop"));
				
				Khoa khoa = new Khoa();
				khoa.setMaKhoa(rs.getString("MaKhoa"));
				
				lop.setKhoa(khoa);
				
				lists.add(lop);
			}
			return lists;
		} catch(SQLException e) {
			System.out.println("Loi selectAll() !");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Lop> searchDSLopTrongKhoa(String TenKhoa) {

		String sql = "select MaLop, TenLop, k.MaKhoa, k.TenKhoa FROM LOP l "
				+ "inner join Khoa k on k.MaKhoa = l.MaKhoa where k.TenKhoa = ?;";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<Lop> lopLists = new ArrayList<Lop>();
			
			while(rs.next()) {
				Lop lop = new Lop();
				
				lop.setMaLop(rs.getInt("MaLop"));
				lop.setTenLop(rs.getString("TenLop"));
				
				Khoa khoa = new Khoa();
				khoa.setMaKhoa(rs.getString("MaKhoa"));
				khoa.setTenKhoa(rs.getString("TenKhoa"));
				
				lop.setKhoa(khoa);
				lopLists.add(lop);
			}
			return lopLists;
		} catch (SQLException e) {
			System.out.println("Loi tim ds lop trong khoa !");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Lop> searchTenLop(String TenLop) {

		String sql = "select MaLop, TenLop, MaKhoa from LOP "
				+ "WHERE TenLop like ?";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, TenLop);
			
			ResultSet rs = ps.executeQuery();
			
			List<Lop> lists = new ArrayList<Lop>();
			
			while(rs.next()) {
				Lop lop = new Lop();
				
				lop.setMaLop(rs.getInt("MaLop"));
				lop.setTenLop(rs.getString("TenLop"));
				lop.setMaKhoa(rs.getString("MaKhoa"));
				
				lists.add(lop);
			}
			return lists;
		} catch (SQLException e) {
			System.out.println("Loi tim ten lop !");
			e.printStackTrace();
		}
		return null;
	}

}
