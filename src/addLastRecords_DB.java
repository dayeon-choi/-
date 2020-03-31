import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*���� ��� ���� �κ��� �����͸� �����ϴ� Ŭ����*/
public class addLastRecords_DB {	
		public addLastRecords_DB(String sid, String sdate, String sincome, String sordernum) {
			String url = "jdbc:mysql://localhost:3306/javaproject?serverTimezone=UTC&user=root&password=2399";
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs = null;
			
		
			
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
				//������ �� DB�� �°� ����
				int id=Integer.parseInt(sid);
				int income = Integer.parseInt(sincome);
				int ordernum = Integer.parseInt(sordernum);
				
				int i = 0;
				for(; i < LastRecords.recordsIndex; i++)
				{   //recordsIndex�� �ε���
					String SQL1 = "select * from lastrecord where id="+i+";";
					rs = stmt.executeQuery(SQL1);
					if(!rs.next())
						break;
				}//end of for
				
				
				
				
				String SQL = "insert into lastrecord(id, recordeddate, income, ordernum) values(" + id + ","+sdate +","+income+","+ ordernum + ");";
				stmt.executeUpdate(SQL);
				
					
					
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
