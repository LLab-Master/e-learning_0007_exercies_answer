package ex10a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class InqueryDAO {
	private Connection con;

	public InqueryDAO(Connection con) {
		super();
		this.con = con;
	}

	public int insert(Inquery inquery) {
		int result = 0;
		PreparedStatement psmt = null;
		try {
			psmt = con.prepareStatement("insert into inquery (name, age, zipcode, address, body) values (?, ?, ?, ?, ?)");
			psmt.setString(1, inquery.getName());
			psmt.setInt(2, inquery.getAge());
			psmt.setString(3, inquery.getZipcode());
			psmt.setString(4, inquery.getAddress());
			psmt.setString(5, inquery.getBody());
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("INSERT 失敗", e);
		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException("PreparedStatement close失敗", e);
			}
		}
		return result;
	}

	public List<Inquery> SelectAll() {
		// Listの定義
		List<Inquery> inqueryList = new ArrayList<Inquery>();

		// ステートメントの定義
		PreparedStatement psmt = null;
		try {
			psmt = con.prepareStatement("select * from inquery");
			// SQLの実行
			ResultSet rs = psmt.executeQuery();
			// 問い合わせ結果の取得
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String zipcode = rs.getString("zipcode");
				String address = rs.getString("address");
				String body = rs.getString("body");
				Inquery inq = new Inquery(name, age, zipcode, address, body);
				inqueryList.add(inq);
			}
		} catch (SQLException e) {
			throw new RuntimeException("SELECT 失敗", e);
		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException("PreparedStatement close失敗", e);
			}
		}
		return inqueryList;
	}
}
