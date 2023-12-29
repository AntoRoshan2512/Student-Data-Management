package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentseeeimpl implements studentseeeintrf 
{
	Connection con;

	@Override
	public void createstudents(students std) 
	{
		Connection con=DBConnection.createDBConnection();
		String query="insert into students values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1, std.getName());
			pstm.setInt(2, std.getAge());
			pstm.setInt(3, std.getRollno());
			pstm.setString(4, std.getGender());
			pstm.setInt(5, std.getDOB());
			pstm.setInt(6, std.getDEPT_ID());
			pstm.setInt(7, std.getHOD_ID());
			int cnt=pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Students updated successfully!!!");
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally
		{
		DBConnection.closeConnection(con);
    }
	}

	@Override
	public void showAllstudents() {
		 con = DBConnection.createDBConnection();
	        String query = "select * from students";
	        System.out.println("Students Details :");
	        System.out.println("---------------------------------------------");

	        System.out.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "Name", "Age", "Rollno", "Gender", "DOB", "DEPT_ID", "HOD_ID");
	        System.out.println("---------------------------------------------");

	        try {
	            Statement stmt = con.createStatement();
	            ResultSet result = stmt.executeQuery(query);
	            while (result.next()) {
	                System.out.format("%s\t%d\t%d\t%s\t%d\t%d\t%d\n",result.getString(1), result.getInt(2), result.getInt(3), result.getString(4), result.getInt(5),  result.getInt(6),  result.getInt(7));
	                System.out.println("---------------------------------------------");
	            }

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            DBConnection.closeConnection(con);
	        }
	    }
	@Override
	public void showstudentsbasedonrollno(int rollno) {
		 con = DBConnection.createDBConnection();
	        String query = "select * from students where rollno=?";
	        try {
	            PreparedStatement pstm = con.prepareStatement(query);
	            pstm.setInt(1, rollno);
	            ResultSet result = pstm.executeQuery();
	            while (result.next()) {
	                System.out.format("%s\t%d\t%d\t%s\t%d\t%d\t%d\n", result.getString(1), result.getInt(2), result.getInt(3), result.getString(4), result.getInt(5), result.getInt(6), result.getInt(7));
	            }

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            DBConnection.closeConnection(con);
	        }
	    }
	
	@Override
	public void updatestudents(String name, int age, int DEPT_ID, int rollno)
	{
		con = DBConnection.createDBConnection();
	    String query = "update students set name=?, age=?, DEPT_ID=? where rollno=?";
	        try {
	            PreparedStatement pstm = con.prepareStatement(query);
	            pstm.setString(1, name);
	            pstm.setInt(2, age);
	            pstm.setInt(3, DEPT_ID);
	            pstm.setInt(4, rollno);
	            int cnt = pstm.executeUpdate();
	            if (cnt != 0)
	                System.out.println("Students Details updated successfully !!");

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            DBConnection.closeConnection(con);
	        }
	}

	@Override
	public void deletestudents(int rollno) {
		con = DBConnection.createDBConnection();
        String query = "delete from students where rollno=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, rollno);
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Students Deleted Successfully!!! " + rollno);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnection.closeConnection(con);
        }
	}

}
