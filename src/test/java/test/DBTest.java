package test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import utilities.DButilities;

public class DBTest {

	public static void main(String[] args) throws SQLException {
		List<Map<String, String>> data=DButilities.readData(null);
		System.out.println(data);
		System.out.println(data.get(0).get("title"));

	}

}
