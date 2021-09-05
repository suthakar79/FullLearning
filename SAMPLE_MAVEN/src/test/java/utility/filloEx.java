package utility;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

class filloEx {
	
	public Fillo fillo;
	public Connection connection;
	Recordset recordset;
	public filloEx(String ExcelFilename){
		 fillo=new Fillo();
		 try {
			connection=fillo.getConnection(ExcelFilename);
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectQuery(String Query)
	{
		try {
			recordset = connection.executeQuery(Query);
		
		while(recordset.next()){
		System.out.println(recordset.getField("Name"));
		}
		 
		recordset.close();
		
		} catch (FilloException e) {
			
			e.printStackTrace();
		}
	}
	public void InsertQuery(String Query)
	{
		try {
			connection.executeUpdate(Query);
			System.out.println("Record inserted");
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void UpdateQuery(String Query)
	{
		try {
			connection.executeUpdate(Query);
			System.out.println("Record updated");
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void DeleteQuery(String Query)
	{
		try {
			connection.executeUpdate(Query);
			System.out.println("Record deleted");
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeConnection()
	{
		connection.close();
	}
	
public static void main(String arg[]){
	
	filloEx f=new filloEx("C:\\Users\\suthakar79\\Desktop\\Details.xlsx");
//	String Query="Insert into Details(Name,city) values('sankar','chennai')";
//	f.InsertQuery(Query);
//	String strQuery="Select * from Details where city='chennai'";
//	f.selectQuery(strQuery);
	String updateQuery="update details set Name='xxx' where city='mumbai'";
	f.UpdateQuery(updateQuery);
	System.out.println("After update");
	String strQuery="Select * from Details";
	f.selectQuery(strQuery);
	
	f.closeConnection();
	 
}
}
