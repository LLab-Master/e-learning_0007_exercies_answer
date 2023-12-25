package ex10a;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestInqueryLogic {

	@Test
	void testInsert() {
		InqueryLogic il = new InqueryLogic();
		Inquery inc = new Inquery("taro", 10, "122-3333", "Where", "What");
		int r = il.insert(inc);
		assertEquals(r, 1);
	}
	
	@Test
	void testGetInqueryList() {
		InqueryLogic il = new InqueryLogic();
		List<Inquery> inqList = il.getInqueryList();
		Inquery inq = inqList.get(0);
		assertEquals(inq.getName(), "taro");
	}
}
