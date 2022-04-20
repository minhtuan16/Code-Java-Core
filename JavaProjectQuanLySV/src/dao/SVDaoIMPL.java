package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Lop;
import model.SinhVien;

public class SVDaoIMPL implements SVDao {

	@Override
	public void insert(SinhVien sv) {

		String sql = "INSERT INTO SINHVIEN(MaSV, HoTen, GioiTinh, NgaySinh, MaLop, HocBong) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, sv.getMaSV());
			ps.setString(2, sv.getHoTen());
			ps.setString(3, sv.getGioiTinh());
			ps.setDate(4, new java.sql.Date(sv.getNgaySinh().getTime()));
			ps.setInt(5, sv.getMaLop());
			ps.setInt(6, sv.getHocBong());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Loi insert !");
			e.printStackTrace();
		}
	}

	@Override
	public void update(SinhVien sv) {

		String sql = "UPDATE SINHVIEN Set HoTen = ?, GioiTinh = ?, NgaySinh = ?, MaLop = ?, HocBong = ? WHERE MaSV = ?";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, sv.getHoTen());
			ps.setString(2, sv.getGioiTinh());
			ps.setDate(3, new java.sql.Date(sv.getNgaySinh().getTime()));
			ps.setInt(4, sv.getMaLop());
			ps.setInt(5, sv.getHocBong());
			ps.setInt(6, sv.getMaSV());
			
			ps.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Loi update !");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int MaSV) {

		String sql = "DELETE FROM SINHVIEN WHERE MaSV = ?";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, MaSV);
			
			ps.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Loi delete !");
			e.printStackTrace();
		}
	}

	@Override
	public List<SinhVien> selectAll() {

		String sql = "SELECT sv.MaSV, HoTen, GioiTinh, NgaySinh, l.MaLop, HocBongFROM SINHVIEN sv "
				+ "INNER JOIN lop l on l.MaLop = sv.MaLop;";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<SinhVien> lists = new ArrayList<SinhVien>();
			
			while(rs.next()) {
				SinhVien sv = new SinhVien();
				sv.setMaSV(rs.getInt("MaSV"));
				sv.setHoTen(rs.getString("HoTen"));
				sv.setGioiTinh(rs.getString("GioiTinh"));
				sv.setNgaySinh(rs.getDate("NgaySinh"));
				
				Lop l = new Lop();
				l.setMaLop(rs.getInt("MaLop"));
				
				sv.setLop(l);
				
				sv.setHocBong(rs.getInt("HocBong"));
				
				lists.add(sv);
			}
			return lists;
		} catch(SQLException e) {
			System.out.println("Loi selectAll()");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<SinhVien> searchDSSinhVienTrongLop(String TenLop) {

		String sql = "select MaSV, HoTen, GioiTinh, NgaySinh, HocBong, Lop.MaLop, Lop.TenLop FROM sinhvien "
				+ "inner join lop on lop.MaLop = sinhvien.MaLop where lop.tenlop = ?;";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<SinhVien> svLists = new ArrayList<SinhVien>();
			
			while(rs.next()) {
				SinhVien sv = new SinhVien();
				
				sv.setMaSV(rs.getInt("MaSV"));
				sv.setHoTen(rs.getString("HoTen"));
				sv.setGioiTinh(rs.getString("GioiTinh"));
				sv.setNgaySinh(rs.getDate("NgaySinh"));
				
				Lop l = new Lop();
				l.setMaLop(rs.getInt("MaLop"));
				l.setTenLop(rs.getString("TenLop"));
				
				sv.setLop(l);
				svLists.add(sv);
			}
			return svLists;
		} catch (SQLException e) {
			System.out.println("Loi tim ds sinh vien theo lop !");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<SinhVien> searchHoTenCuaSV(String HoTen) {

		String sql = "select MaSV, HoTen, GioiTinh, NgaySinh, HocBong, MaLop FROM SINHVIEN "
				+ "WHERE HoTen like ?";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, HoTen);
			
			ResultSet rs = ps.executeQuery();
			
			List<SinhVien> lists = new ArrayList<SinhVien>();
			
			while(rs.next()) {
				SinhVien sv = new SinhVien();
				
				sv.setMaSV(rs.getInt("MaSV"));
				sv.setHoTen(rs.getString("HoTen"));
				sv.setGioiTinh(rs.getString("GioiTinh"));
				sv.setNgaySinh(rs.getDate("NgaySinh"));
				sv.setHocBong(rs.getInt("HocBong"));
				sv.setMaLop(rs.getInt("MaLop"));
				
				lists.add(sv);
			}
			return lists;
		} catch (SQLException e) {
			System.out.println("Loi tim ho ten sv !");
			e.printStackTrace();
		}
		return null;
	}

}
