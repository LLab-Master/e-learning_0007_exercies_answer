package ex10a;

import java.sql.Connection;
import java.util.List;

public class InqueryLogic {	
	ConnectionManager cm;
	Connection con;

	public InqueryLogic() {
		// Open connection
		cm = new ConnectionManager();
		con = cm.getConnection();
	}

	public int insert(Inquery inquery) {
		InqueryDAO inqueryDAO = new InqueryDAO(con);
		return inqueryDAO.insert(inquery);
	}
	
	public List<Inquery> getInqueryList() {
		InqueryDAO inqueryDAO = new InqueryDAO(con);
		List<Inquery> inqueryList = inqueryDAO.SelectAll();
		return inqueryList;
	}
	
	public void close() {
		cm.closeConnection();
	}
}
