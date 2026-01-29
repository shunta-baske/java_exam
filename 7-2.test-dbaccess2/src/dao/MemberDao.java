package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll() {
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM " + TABLE_NAME + " ORDER BY age ASC;";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			ResultSet rs = pstmt.executeQuery();

			List<Member> members = new ArrayList<>();

			while (rs.next()) {
				Member member =new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setDep_id(rs.getInt("dep_id"));
				members.add(member);
			}

			return members; // ←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return メンバー情報(検索されなかった場合はnullが返ります)
	 */

	String TABLE_NAME = "test_members";

	public Member load(int id) {
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM " + TABLE_NAME + " id WHERE id=" + id;

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く

			ResultSet rs = pstmt.executeQuery();

			Member member = new Member();
			if (rs.next()) {

				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				member.setDep_id(rs.getInt("dep_id"));

			}
			return member; // ←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member) {
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO "+TABLE_NAME+" (name, age, dep_id) VALUES (?,?,?);";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く

			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getAge());
			pstmt.setInt(3, member.getDep_id());


			int n =pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}


	public void update(Member member) {
		Connection con = DBManager.createConnection();
		String sql = "UPDATE "+TABLE_NAME+" SET name=? age=? dep_id=?;";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く

			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getAge());
			pstmt.setInt(3, member.getDep_id());


			int n =pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました", e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
}
