package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.util.PropertiesUtil;

public class DButilities {

	 static Properties prop= PropUtil.readData("Config.properties");
	//Common method to connect with the database and get the raw data.
	public static ResultSet getData(String query) throws SQLException {
		
		ResultSet dataSet =null;
		String url = prop.getProperty("DB_URL");
		String username = prop.getProperty("DB_USERNAME");
		String password = prop.getProperty("DB_PASSWORD");
		
		Connection connection =DriverManager.getConnection(url,username,password);
		dataSet =connection.createStatement().executeQuery(query);
		
		
		return dataSet;
	}
	
	//Common method to convert the raw into collection data structure
	public static List<Map<String, String>> readData(String query ) throws SQLException {
		List<Map<String, String>> dataList =new ArrayList<Map<String,String>>();
		//get raw data from the DB 
		ResultSet dataSet =getData(query);
		
		while(dataSet.next()) {
			
		}
		
		
		
		
		
		return dataList;
	}

}
