import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteMenu_DB {
	public deleteMenu_DB(String si) {
		String url = "jdbc:mysql://localhost:3306/javaproject?serverTimezone=UTC&user=root&password=2399";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs = null;
		Menu s;
		
		try
		{
			//����̹� ����
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("����̹� ���� ����!");
			//mySQL����
			conn = DriverManager.getConnection(url);
			System.out.println("������ ���̽� ���� ����!");
			//DB ����
			stmt = conn.createStatement();
			String usejavaproject = "use javaproject;";
			stmt.executeUpdate(usejavaproject);
			//�޴� �ҷ�����
			int i=Integer.parseInt(si);
			String SQL = "delete from menu where id="+i+";";
			stmt.executeUpdate(SQL);
						
			SortDB sort = new SortDB();
		}
		catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		finally{
			if(conn != null) {
				try {
					conn.close();
				}
				catch(SQLException se){
						
				}
			}
				
			if(stmt != null){
				try{
					stmt.close();
				}
				catch(SQLException se){
						
				}
			}
				
			if(rs != null){
				try
				{
					rs.close();
				}
				catch(SQLException se)
				{
						
				}
			}//end of if
			
		}//end of finally
			
	}
		
		
	


	}

