package com.example.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;

import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member>
{

	private Connection  con;
	private String memberName;
	
	
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public MemberRepository() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int add(Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Member> findAll()
	{
      List<Member> memberList = new ArrayList<Member>();
		
		String sql = "select * from sreemember";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next())
			{ 
				int memberId=rs.getInt("member_id");
				
				String memberName=rs.getString("member_name");
				
				String memberAddress=rs.getString("member_Address");
				
				LocalDate accountOpenDate=rs.getDate("acc_open_date").toLocalDate();
				
				String membershipType=rs.getString("membership_type");
				
				double feesPaid=rs.getDouble("fees_paid");
				 
			    int maxBookAllowed=rs.getInt("max_book_allowed");
				 
			    int penaltyAmount=rs.getInt("penalty_amount");
			    
			    
			    
			  Member memb= new Member(memberId, memberName, memberAddress,
					  accountOpenDate, membershipType, feesPaid, maxBookAllowed,penaltyAmount);
			  
			  memberList.add(memb);
			    
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

		return memberList;
	}

	public int remove(int id) 
	{
		String sql=("Delete from sri_member1 where memberid=? ");
		
		int rowsdeleted=0;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql))
		{
			pstmt.setInt(1, id);
			
			rowsdeleted=pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			
		
		return rowsdeleted;
	}
		
		
	

	public Member findById(int id) 
	{
		
		return null;
	}

	public int update(int feespaid, int memberid) 
	{
	
		String sql=("UPDATE sreemember SET feespaid = ? where memberid = ?");
		int rowsUpdated=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql))
		{
			pstmt.setInt(1, feespaid);
			pstmt.setInt(2, memberid);
			
			
			rowsUpdated=pstmt.executeUpdate(); 
			
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return rowsUpdated;
		
	}

	@Override
	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}