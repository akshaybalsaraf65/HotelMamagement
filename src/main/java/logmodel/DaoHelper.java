package logmodel;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.apache.commons.collections.StaticBucketMap;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.util.PersistenceUtilHelper.MetadataCache;


































import pojo.city;
import pojo.hotel;
import pojo.room;
import Bean.register;
import Bean.Pojo.citysearch;
import Bean.Pojo.hotelsearch;
import Connectionchecknp.connectionchecked;
import HibernateConfigureConnection.HibernateChecked;
import beanpojo.user;
import connectionp.connectioncheck;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;






public class DaoHelper {
	
private String fname;
private String lname;
private user user;




	public static int save(register r)
	{
		int status = 0;
		try {
			Connection con;
			connectioncheck ck = new connectioncheck();
			con = connectioncheck.getConnection();
			System.out.println("database connection enstablished");
			PreparedStatement ps = con.prepareStatement("insert into user(fname,lname,mobile,username,password,cpassword,active) values(?,?,?,?,?,?,?)");
			ps.setString(1, r.getFirstname());
			ps.setString(2, r.getLastName());
			ps.setString(3, r.getMobileno());
		//	ps.setLong(7, r.getMobileno());
			ps.setString(4, r.getUsername());
			ps.setString(5, r.getPassword());
			ps.setString(6, r.getCpassword());
			ps.setInt(7, 0);
			status = ps.executeUpdate();
			System.out.println("query e");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

	/*public static Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay", "root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}*/
	
//	public boolean save(String Firstname,String lastName,String mobile,String username,String password ,String cpassword)
//	{
//		//Connection con;
//		SessionFactory factory = null;
//		Session ses = null;
//		Transaction transaction =null;
//		try {
//			 
//			  
//		
//			/*Configuration cfg = new Configuration();
//			cfg.configure("/WEB-INF/hibernate.cfg.xml");*/
//			
//			factory = HibernateChecked.getSessionFactory();
//			
//			
//            //factory =  new Configuration().configure().buildSessionFactory();
//           
//            
//            
//            ses = factory.getCurrentSession();
//            
//            transaction = ses.beginTransaction();
//          
//          user u = new user();
//            u.setFn(Firstname);
//            u.setLn(lastName);
//            u.setMob(mobile);
//            u.setUsern(username);
//            u.setPass(password);
//            u.setCpass(cpassword);
//            ses.save(u);
//            System.out.println("insertted user : "+u);
//           transaction.commit();
//           factory.close();
//           //ses.close();
//           System.out.println("bdh");
//           
//            return true; 
//			
//		/*	con = connectionchecked.getConnection();
//			System.out.println("database connection enstablished");
//			PreparedStatement ps = con.prepareStatement("insert into user(fname,lname,mobile,username,password,cpassword) values(?,?,?,?,?,?)");
//			ps.setString(1, Firstname);
//			ps.setString(2, lastName);
//			ps.setString(3, mobile);
//			ps.setString(4, username);
//			ps.setString(5, password);
//			ps.setString(6, cpassword);
//			
//			
//			int rs = ps.executeUpdate();
//			if(rs>0)
//			return true;*/
//			
//		} catch (HibernateException e) {
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		finally{
//			try {
//				factory.close();
//				ses.close();
//				transaction.commit();
//			} catch (HibernateException e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//			catch (Exception e2) {
//				// TODO: handle exception
//				e2.printStackTrace();
//			}
//		}
//		
//		
//		return false;
//	}
	
	/*public static int save(String Firstname,String lastName,String Mobileno,String username,String password ,String cpassword)
	{
		try {
			int status =0;
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?,?)")
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}*/
	
	
	
	
/*	public java.util.List<String> getDataFromHotelSearch(String cityname)
	{
		System.out.println("Inside check"); 
		java.util.List<String> recordList = new ArrayList<String>();
		PreparedStatement ps;
		String data;
		
		try {
			Connection con;
			con = connectioncheck.getConnection();
			System.out.println("database connection enstablished");
			StringBuffer sbr = new StringBuffer();
			
			
			//"select HName,CtName,RoomType,Price from Hotel h,City c where h.CtId=c.CtId and c.CtName=?"
			ps = con.prepareStatement("select hotelname ,cityname ,roomtype,price from hotel h , city c where h.cityid=c.cityid and c.cityname = ? ");
			//ps=con.prepareStatement("select  id, cityname ,hotelname from hotelsearch where cityname=?");
			ps.setString(1,cityname);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) 
			{   
				ArrayList<String> list=new ArrayList<String>();
				list.add(rs.getString("hotelname"));
				list.add(rs.getString("cityname"));
				list.add(rs.getString("roomtype"));
				list.add(rs.getString("price"));
				
				list.add(rs.getString("id"));
				list.add(rs.getString("cityname"));
				list.add(rs.getString("hotelname"));
				recordList.addAll(list);
				
			}
			return recordList;
			return (ArrayList<String>) recordMap;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error");
		}
		
		return null;
	}*/
	
	public boolean log(String username,String password)
	{
		Connection con;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction =null;
		try {
//			factory = HibernateChecked.getSessionFactory();
//			session = factory.openSession();
//			transaction = session.beginTransaction();
//			Query createquery = session.createQuery("from user where username = ? and password =?");
//			createquery.setParameter(0, username);
//			createquery.setParameter(1, password);
//			
//			java.util.List l = createquery.list();
//			
//			Iterator it = l.iterator();
//			while(it.hasNext())
//			{
//				return true;
//			}
			
			
			
			
			
			
			
			
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			PreparedStatement ps = con.prepareStatement("select * from user where username = ? and password =?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				return true;
			}
			
		} /*
			 * catch (HibernateException e) { e.printStackTrace(); }
			 */
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
//				factory.close();
//				session.close();
//				transaction.commit();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return false;
		
	}
	
	
	public boolean Search(String username,String password)
	{
		java.util.List<ResultSet> list = new ArrayList<ResultSet>();
		try {
			Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			PreparedStatement ps = con.prepareStatement("select * from user where username = ? and password =?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				list.add(rs);
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean forget(String username,String password,String cpassword)
	{
		
		/*SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;*/
		try {
			/*factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			user u = new user();
			u.setUsern(username);
			u.setPass(password);
			u.setCpass(cpassword);
			session.update(u);
			
			
			
			return true;*/
			
			
			Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			PreparedStatement ps = con.prepareStatement("update user set password = ?, cpassword =? where username = ?");
			ps.setString(1,password);
			ps.setString(2, cpassword);
			ps.setString(3, username);
		//	ps.setString(3, cpassword);
			
			int rs = ps.executeUpdate();
			if(rs>0)
				return true;
		} /*
			 * catch (HibernateException e) { e.printStackTrace(); }
			 */
		catch (Exception e) {
			e.printStackTrace();
		}
		/*finally{
			try {
				System.out.println("close");
				factory.close();
				session.close();
				transaction.commit();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}*/
		
		return false;
	}
	
	
/*	public ArrayList<user> getDataFromTable(String Firstname){
		try {
			java.util.List<user> empList = new ArrayList<>();
			
			Configuration cfg = new Configuration();
			cfg.configure("/WEB-INF/hibernate.cfg.xml");
			
			SessionFactory factory;
            factory = cfg.buildSessionFactory();
            
            Session ses = factory.getCurrentSession();
            Transaction transaction =null;
            transaction = ses.beginTransaction();
          
            Query createQuery = ses.createQuery(" from user where fname:FirstName");
			createQuery.setParameter("FirstName", fname);
			
			
			
            	
            
            Query createQuery = ses.createQuery("sbr.toString()");
            createQuery.setParameter("myName", Firstname);
            empList = createQuery.list();
            
            
            return (ArrayList<user>) empList;
            
            
            
            
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	*/

	public HashMap<Integer, java.util.List<String>> getDataFromTable(String id,String fname,String lname,String mobile,String username,String password ,String cpassword)
	{
		
		String where = null;
		System.out.println("Inside check"); 
		
/*		try {
			
		   Configuration cfg = new Configuration();
		    cfg.configure("/WEB-INF/hibernate.cfg.xml");
		
	   	SessionFactory factory;
        factory = cfg.buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        Transaction transaction =null;
        transaction = session.beginTransaction();
		
		
		
		   Query qry = session.createQuery("from user");
	         java.util.List list = qry.list();

	         Iterator it = list.iterator();


			while(it.hasNext())
			{
				Object o = (Object) it.next();
				Product p = (Product)o;
				System.out.println("Product Name : "+p.getProName());
				System.out.println("Product Price : "+p.getPrice());
				System.out.println("---------------------------");

			}		
		*/
		
		
		
		Map<Integer, java.util.List<String>> recordMap = new HashMap<>();
		java.util.List<user> emplist = new ArrayList<>();
		
		try {
			
			Configuration cfg = new Configuration();
			cfg.configure("/WEB-INF/hibernate.cfg.xml");
			
			SessionFactory factory;
            factory = cfg.buildSessionFactory();

            Session ses = factory.getCurrentSession();
            Transaction transaction =null;
            transaction = ses.beginTransaction();
      
            Query createquery = null;
            
            
            
            StringBuffer sbr = new StringBuffer();
			sbr.append("from user ");
			//if(where!="undefined" && where.length()!=0)
		/*	if(where!=null && !where.isEmpty())
			sbr.append(" where :'"+where+"'");*/
			//if(id.isEmpty() || fname.isEmpty() || mobile.isEmpty() || username.isEmpty())
			
			
				
				//	if((id!=null && !id.isEmpty()) || (fname!=null && !fname.isEmpty()) || (mobile!=null && !mobile.isEmpty()) || (username!=null && !username.isEmpty()) || (password!=null && !password.isEmpty()) || (cpassword!= null && !cpassword.isEmpty()))
			
		/*Another Logic - Start*/
		


/*

	if( (fname.isEmpty()) && (lname.isEmpty() || lname == null) && username.isEmpty() && password.isEmpty() && cpassword.isEmpty() && mobile.isEmpty())
				createquery = ses.createQuery(sbr.toString());
			else{
				
			
				
				//	if((id!=null && !id.isEmpty()) || (fname!=null && !fname.isEmpty()) || (mobile!=null && !mobile.isEmpty()) || (username!=null && !username.isEmpty()) || (password!=null && !password.isEmpty()) || (cpassword!= null && !cpassword.isEmpty()))
			sbr.append(" where");
			boolean isUseAnd=false;
			
			if(id!=null && !id.isEmpty())
				sbr.append(" id : id");

			if( fname!=null && !fname.isEmpty())
			{
				sbr.append("and fname : fname");
				isUseAnd = true;
			}
			//createquery.setParameter("fname", fname);

			if(lname!=null && !lname.isEmpty())
			{
			    if(isUseAnd)
			    	sbr.append(" and");
				sbr.append(" lname : lname");
				isUseAnd = true;
			}
						if(mobile!=null && !mobile.isEmpty())
						{
							
						if(isUseAnd)
							sbr.append(" and ");
				sbr.append(" mobile : mobile");
				isUseAnd = true;
						}
			if(username!=null && !username.isEmpty())
			{
				
				if(isUseAnd)
					sbr.append(" and ");
				sbr.append(" username :username");
				isUseAnd = true;
			}
			if(password!=null && !password.isEmpty())
			{
				
			if(isUseAnd)
					sbr.append(" and ");
				sbr.append("and password : password");
				isUseAnd = true;
			}
			if(cpassword!= null && !cpassword.isEmpty())
			{
				
				if(isUseAnd)
					sbr.append(" and ");
				sbr.append("and cpassword : cpassword");
				isUseAnd = true;
			}
	
			createquery = ses.createQuery(sbr.toString());
			}
			
			
			*/



		 
	/* Logic - End*/
			if(id!=null && !id.isEmpty())
				sbr.append(" where id : id");

			if( fname!=null && !fname.isEmpty())
				sbr.append("and fname : fname");
			//createquery.setParameter("fname", fname);

			if(lname!=null && !lname.isEmpty())
				sbr.append(" and lname : lname");
				
			if(mobile!=null && !mobile.isEmpty())		
				sbr.append(" and mobile : mobile");
				
						
			if(username!=null && !username.isEmpty())
				sbr.append(" and username :username");
			
			if(password!=null && !password.isEmpty())
				sbr.append("and password : password");
			
			if(cpassword!= null && !cpassword.isEmpty())
				sbr.append("and cpassword : cpassword");
			
			createquery = ses.createQuery(sbr.toString());
			
			
			
			
		 if(id!=null && !id.isEmpty())
				createquery.setParameter("id", id);
	
			if(fname!=null && !fname.isEmpty())
			createquery.setParameter("fname", fname);

			if(lname!=null && !lname.isEmpty())
			createquery.setParameter("lname", lname);

			if(mobile!=null && !mobile.isEmpty())
			createquery.setParameter("mobile", mobile);

			if(username!=null && !username.isEmpty())
			createquery.setParameter("username", username);

			if(password!=null && !password.isEmpty())
			createquery.setParameter("password", password);
			
			
			if(cpassword!= null && !cpassword.isEmpty())
			createquery.setParameter("cpassword", cpassword);
			
			
			System.out.println("Ssdvdv");
			
			
			//emplist = createquery.list();
			emplist = createquery.list();
			//Iterator it = emplist.iterator();
			int cnt =0;
			for(user ob : emplist)
			{
				cnt++;
				java.util.List<String> datalist = new ArrayList<>();
				
				int id5 = ob.getId();
				datalist.add(String.valueOf(id5));
				datalist.add(ob.getFn());
				datalist.add(ob.getLn());
				datalist.add(ob.getMob());
				datalist.add(ob.getUsern());
				datalist.add(ob.getPass());
				datalist.add(ob.getCpass());
				recordMap.put(cnt, datalist);
				System.out.println("datalist value : "+ob.getFn());
			}
			
			
		
			
            
			System.out.println("search user : ");
	           transaction.commit();
	           factory.close();
	           //ses.close();

          
          
        
          
          
          
         
          
          
          
          
          
   
            
      
            
            
            
			
			
			
			
			
			
			
	           
	           
	           
	        /* PREVIOUS MYSQL CODE  */
			
			
		/*Map<Integer, java.util.List<String>> recordMap = new HashMap<>();
		java.util.List<user> emplist = new ArrayList<>();
		try{
			Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			
			
			StringBuffer sbr = new StringBuffer();
			sbr.append("select * from user");
			
			if(id!=null && !id.isEmpty())
				sbr.append("where id = ?");
			
				
			if(fname!=null && !fname.isEmpty())
				sbr.append("and fname = ?");
			
			if(lastName!=null && !lastName.isEmpty())
				sbr.append("and lname = ?");
			
			if(mobile!=null && !mobile.isEmpty())
				sbr.append("and mobile = ?");
			
			if(username!=null && !username.isEmpty())
				sbr.append("and username = ?");
			
			if(password!=null && !password.isEmpty())
				sbr.append("and password = ?");
			
			if(cpassword!= null && !cpassword.isEmpty())
				sbr.append("and cpassword = ?");
			
			
			PreparedStatement ps = con.prepareStatement(sbr.toString());
			
			if(id!=null && !id.isEmpty())
				ps.setString(1, id);
			
			if(fname!=null && !fname.isEmpty())
				ps.setString(2, fname);
			
			if(lastName!=null && !lastName.isEmpty())
				ps.setString(3, lname);
			
			if(mobile!=null && !mobile.isEmpty())
				ps.setString(4, mobile);
			
			if(username!=null && !username.isEmpty())
				ps.setString(5, username);

			if(password!=null && !password.isEmpty())
				ps.setString(6, password);
				
					
			if(cpassword!= null && !cpassword.isEmpty())
				ps.setString(7, cpassword);
			
			
			
			System.out.println(ps.toString());
			
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			System.out.println(rs.toString());
			
			int cnt=0; 
			
			while(rs.next())
			{
				
				java.util.List<String> dataList = new ArrayList<>();
                cnt++; 
                dataList.add(rs.getString(1));
                dataList.add(rs.getString(2));
                dataList.add(rs.getString(3));
                dataList.add(rs.getString(4));
                dataList.add(rs.getString(5));
                dataList.add(rs.getString(6));
                dataList.add(rs.getString(7));
                recordMap.put(cnt, dataList);
                
			}*/
		}catch(HibernateException e){
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		return (HashMap<Integer, java.util.List<String>>) recordMap;
		
	}
	
	
	
	public boolean getDataDEleteTable(String id)
	{
		//int status = 0;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("/WEB-INF/hibernate.cfg.xml");
			
			SessionFactory factory;
            factory = cfg.buildSessionFactory();
          //  factory = cfg.buildSessionFactory();
            
            
            Session ses = factory.openSession();
            Transaction transaction =null;
            transaction = ses.beginTransaction();
            
            
            
            int id6 = Integer.parseInt(id);
			user u= findmypk(id6);
			
			u.setId(id6);
		
			ses.delete(u);
			 transaction.commit();
	           factory.close();
	           ses.close();
	           
            
            
            
            
          
          /*user u = new user();
          int id6=Integer.parseInt(id);
          int id1 = u.getId();
          String obj = String.valueOf(id1);
            u.setId(id6);
       
           
            ses.delete(u);
            System.out.println("delete user : "+u.getUsern());
           transaction.commit();
           factory.close();
           ses.close();*/
           
           
            return true; 
			
			
			
			
			
			/*Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			PreparedStatement ps = con.prepareStatement("delete from user where id = ?");
			ps.setString(1,id);
			//ps.setString(2, mobile);
			
			int status = ps.executeUpdate();
			if(status>0){
				
				return true;
			}
				*/
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	
	public java.util.List<Integer> deletetable(String username,String mobile)
	{
		
		
		System.out.println("Inside check"); 
		java.util.List<Integer> recordMap = new ArrayList<Integer>();
		try {
			Connection con;
			con =connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			PreparedStatement ps = con.prepareStatement("delete from user where username = ? and mobile = ?");
			ps.setString(1,username);
			ps.setString(2, mobile);
			
			int status = ps.executeUpdate();
			
			//recordMap = ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
/*	public boolean getDataDEleteTable(String username,String mobile)
	{
		try {
			Connection con;
			con = connectioncheck.getConnection();
			System.out.println("database connection enstablished");
			PreparedStatement ps = con.prepareStatement("delete from user where username = ? and mobile = ?");
			ps.setString(1,username);
			ps.setString(2, mobile);
			//ps.setString(3, username);
		//	ps.setString(3, cpassword);
			
			int rs = ps.executeUpdate();
			if(rs>0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	*/
	
	
	
	public boolean getDataFromEditTable(String id,String fname,String lname,String mobile,String username,String password ,String cpassword){
		//int status = 0;
		
		try {
			Configuration cfg = new Configuration();
			cfg.configure("/WEB-INF/hibernate.cfg.xml");
			
			SessionFactory factory;
	        factory = cfg.buildSessionFactory();
	      //  factory = cfg.buildSessionFactory();
	        
	        
	        Session ses = factory.getCurrentSession();
	        Transaction transaction =null;
	        transaction = ses.beginTransaction();
			int id6 = Integer.parseInt(id);
			user u= findmypk(id6);
			
			u.setId(id6);
			u.setFn(fname);
			u.setLn(lname);
			u.setMob(mobile);
			u.setUsern(username);
			u.setPass(password);
			u.setCpass(cpassword);
			ses.update(u);
			 transaction.commit();
	           factory.close();
	           return true;
	           
	           
	           
	           
	          
		
			
			
			
			
			
			
			
			

		/*	Configuration cfg = new Configuration();
			cfg.configure("/WEB-INF/hibernate.cfg.xml");
			
			SessionFactory factory;
            factory = cfg.buildSessionFactory();
          //  factory = cfg.buildSessionFactory();
            
            
            Session ses = factory.getCurrentSession();
            Transaction transaction =null;
            transaction = ses.beginTransaction();
          
          user u = new user();
          int id6=Integer.parseInt(id);
        int id1 = u.getId();
        String obj = String.valueOf(id1);
          u.setId(id6);
          u.setFn(fname);
            u.setLn(lname);
            u.setMob(mobile);
            u.setUsern(username);
            u.setPass(password);
            u.setCpass(cpassword);
            ses.update(u);
            System.out.println("Update user : "+u.getUsern());
           transaction.commit();
           factory.close();
           //ses.close();
           
           
            return true; 
			*/
			
			
			
	/*		Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			
			StringBuffer sbr = new StringBuffer();
			sbr.append("update user ");
			if(Firstname!= null && !Firstname.isEmpty())
				sbr.append(" set fname = ? ,");
			if(lastName!=null && !lastName.isEmpty())
				sbr.append(" lname = ? , ");
			if(mobile!=null && !mobile.isEmpty())
				sbr.append(" mobile = ? , ");
			if(password!=null && !password.isEmpty())
				sbr.append(" password = ? , ");
			if(cpassword!=null && !cpassword.isEmpty())
				sbr.append(" cpassword = ? ");
			
			if(username!=null && !username.isEmpty())
				sbr.append(" where username = ? ");
			
			PreparedStatement ps = con.prepareStatement("update user set fname =?,lname = ?, mobile = ? ,username = ? , password = ?, cpassword =?  where id = ?");
			
			
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, mobile);
			ps.setString(4, username);
			ps.setString(5, password);
			ps.setString(6, cpassword);
			ps.setString(7, id);
			
			int status = ps.executeUpdate();
			if(status>0)
			{
				return true;
			}
			*/
			
			
			
			
			/*if(Firstname!=null && !Firstname.isEmpty())
				ps.setString(1, fname);
				
			if(lastName!=null && !lastName.isEmpty())
				ps.setString(2, lname);
					
			if(mobile!=null && !mobile.isEmpty())
				ps.setString(3, mobile);
						
			if(password!=null && !password.isEmpty())
				ps.setString(4, password);
							
			if(cpassword!=null && !cpassword.isEmpty())
				ps.setString(5, cpassword);
								
			if(username!=null && !username.isEmpty())
				ps.setString(6, username);
			
			System.out.println(ps.toString());*/
			
			//status = ps.executeUpdate();
			
		}catch(HibernateException e){
			e.printStackTrace();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public user findmypk(int id){
		try{
		Configuration cfg = new Configuration();
		cfg.configure("/WEB-INF/hibernate.cfg.xml");
		
		SessionFactory factory;
        factory = cfg.buildSessionFactory();
      //  factory = cfg.buildSessionFactory();
        
        
        Session ses = factory.getCurrentSession();
        Transaction transaction =null;
        transaction = ses.beginTransaction();
        java.util.List<user> userobj = new ArrayList<>();
        Query hql = ses.createQuery("from user where id ='"+id+"'");
		userobj = hql.list();
		if(!userobj.isEmpty() && userobj.size()>0)
			user = userobj.get(0);
		
        
		}
		catch(HibernateException e){
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
	}
	
/*	public user findmypk11(int id)
	{
		SessionFactory factory=null;
		Transaction transaction = null;
		try {
			
			 
			 
			factory=HibernateChecked.buildSessionFactory();
			Session session=factory.openSession();
			session.beginTransaction();
			transaction = session.beginTransaction();
			java.util.List<user> userobj = new ArrayList<>();
			Query hql = session.createQuery("from user where id ='+id'");
			userobj = hql.list();
			if(!userobj.isEmpty() && userobj.size()>0)
				user = userobj.get(0);
			
			
			
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(factory!=null){
				factory.close();
			}
			transaction.commit();
		
		}
		
		return user;
		
		
	}*/
	
	
	
	
/*	public java.util.List<String> getDataEditTable(String Firstname,String lastName,String mobile,String username,String password ,String cpassword)
	{
		System.out.println("Inside check"); 
		//Map<Integer, java.util.List<String>> recordMap = new HashMap<>();
		java.util.List recordMap = new ArrayList<>();
		
		try {
			Connection con;
			con = connectioncheck.getConnection();
			System.out.println("database connection enstablished");
			
			StringBuffer sbr = new StringBuffer();
			sbr.append("update user");
			if(Firstname!= null && !Firstname.isEmpty())
				sbr.append("set fname = ? ,");
			if(lastName!=null && !lastName.isEmpty())
				sbr.append(" lname = ? , ");
			if(mobile!=null && !mobile.isEmpty())
				sbr.append(" mobile = ? , ");
			if(password!=null && !password.isEmpty())
				sbr.append(" password = ? , ");
			if(cpassword!=null && !cpassword.isEmpty())
				sbr.append(" cpassword = ? ");
			
			if(username!=null && !username.isEmpty())
				sbr.append(" where username = ? ");
			
			PreparedStatement ps = con.prepareStatement(sbr.toString());
			
			
			if(Firstname!=null && !Firstname.isEmpty())
				ps.setString(1, fname);
				
			if(lastName!=null && !lastName.isEmpty())
				ps.setString(2, lname);
					
			if(mobile!=null && !mobile.isEmpty())
				ps.setString(3, mobile);
						
						
			if(password!=null && !password.isEmpty())
				ps.setString(4, password);
							
			if(cpassword!=null && !cpassword.isEmpty())
				ps.setString(5, cpassword);
								
			if(username!=null && !username.isEmpty())
				ps.setString(6, username);
			
			System.out.println(ps.toString());
			
			
			int status = ps.executeUpdate();
			
			recordMap.add(status);
			
					} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return recordMap;
		
		
		
	}*/
	
	
	public HashMap<Integer, java.util.List<String>> getDataEditTable(String Firstname,String lastName,String mobile,String username,String password ,String cpassword)
	{
		System.out.println("Inside check"); 
		Map<Integer, java.util.List<String>> recordMap = new HashMap<>();
		
		try {
			Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			
			
			StringBuffer sbr = new StringBuffer();
			
			
			
			StringBuffer sbr1 = new StringBuffer();
			sbr1.append("update user");
			if(Firstname!= null && !Firstname.isEmpty())
				sbr1.append("set fname = ? ,");
			if(lastName!=null && !lastName.isEmpty())
				sbr1.append(" lname = ? , ");
			if(mobile!=null && !mobile.isEmpty())
				sbr1.append(" mobile = ? , ");
			if(password!=null && !password.isEmpty())
				sbr1.append(" password = ? , ");
			if(cpassword!=null && !cpassword.isEmpty())
				sbr1.append(" cpassword = ? ");
			
			if(username!=null && !username.isEmpty())
				sbr1.append(" where username = ? ");
			
			PreparedStatement ps = con.prepareStatement(sbr1.toString());
			
			
			if(Firstname!=null && !Firstname.isEmpty())
				ps.setString(1, fname);
				
			if(lastName!=null && !lastName.isEmpty())
				ps.setString(2, lname);
					
			if(mobile!=null && !mobile.isEmpty())
				ps.setString(3, mobile);
						
						
			if(password!=null && !password.isEmpty())
				ps.setString(4, password);
							
			if(cpassword!=null && !cpassword.isEmpty())
				ps.setString(5, cpassword);
								
			if(username!=null && !username.isEmpty())
				ps.setString(6, username);
			
			System.out.println(ps.toString());
	
			
			
			int status = ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		return null;
		
	}
	
	public Map<Integer, Map<city, java.util.List<hotel>>> getDataFromHotelSearch(String cityname)
	{
		System.out.println("Inside check"); 
		
		//Map<Integer,java.util.List<String>> datalist = new HashMap<>();
		
		HashMap<Integer, Map<city, java.util.List<hotel>>> recordMap = new HashMap<>();
		//java.util.List<String> recordList = new ArrayList<String>();
		PreparedStatement ps;
		String data;
		
		
		
		
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		
		try {
			
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			//StringBuffer sbr = new StringBuffer();
			
			/*if(HName!=null && !HName.isEmpty())*/
				
			
			
			/*"Select HName, RoomType,Price,CNAME from Hotel h ,City c where h.Hid=c.CID and c.CNAME=?"*/
			//select hotelname,cityname,roomtype,price from hotel h, city c where h.hotelid=c.cityid and c.cityname : CNAME
			//select hotelname,cityname,roomtype,price from hotel h, city c where h.hotelid=c.cityid and c.cityname= ?
			//"Select h.hotelname,c.cityname,h.roomtype from hotel h where h.hotelid=c.cityid"
			//from hotel h where h.hotelname =:hotelname and h.Price =:Price
			//from fare f where f.fid="+id
			
			Query createquery = session.createQuery("from city c  where c.cityname =:cityname" );
			createquery.setParameter("cityname", cityname);
		     java.util.List<city> citylist = createquery.list();
		     int cnt = 0;
		     for (int i = 0; i < citylist.size(); i++) {
		    	 city city = citylist.get(i);
		    	 Map<city, java.util.List<hotel>> hotellist = new HashMap<>();
		    	 int id = city.getCityid();
		    	 java.util.List<hotel> hotels = gethotel(id);
		    	 hotellist.put(city, hotels);
		    	 recordMap.put(cnt, hotellist);
		    	 cnt++;
		    	 
		    	 
		    	 
				
			}
		     
			//createquery.setParameter("Price", Price);
			
			
			//java.util.List<hotelsearch> hotelresultlist = createquery.list();
			
		/*	int cnt = 0;
			for (int i = 0; i < hotelresultlist.size(); i++) {
				hotelsearch hotelser = new hotelsearch();
				
				
				HashMap<citysearch, java.util.List<hotelsearch>> datalist = new HashMap<>();
				String id = hotelser.getHotelid();
				java.util.List<citysearch>  city = getcityes(id);
				
				// String id = hotelser.getHotelid();
				
			}*/
			
			
			
			
			
		/*	recordList = createquery.list();
			System.out.println("System");
			//int cnt = 0;
			Iterator it = recordList.iterator();
			while(it.hasNext()){
				java.util.List<String> recordListt = new ArrayList<>();
				//cnt++;
				hotelsearch h = new hotelsearch();
				citysearch c = new citysearch();
				recordListt.add(h.getHotelname());
				recordListt.add(h.getRoomtype());
				recordListt.add(h.getPrice());
				recordListt.add(c.getCityname());
				recordList.addAll(recordListt);
				//datalist.put(cnt, recordList);
				System.out.println("Record List value" +h.getCITYID());
				
			}
			return recordList;*/
			
			
			/*for(hotelsearch hs :recordList){
				
			}
			*/

			
			
			
			
			
			
			
			
			
			
			
			
			
			/*Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			StringBuffer sbr = new StringBuffer();
			
			
			//"select HName,CtName,RoomType,Price from Hotel h,City c where h.CtId=c.CtId and c.CtName=?"
//			ps = con.prepareStatement("select hotelname ,cityname ,roomtype,price from hotel h , city c where h.cityid=c.cityid and c.cityname = ? ");
			ps = con.prepareStatement("select hotelname,cityname,roomtype,price from hotel h, city c where h.hotelid=c.cityid and c.cityname= ? ");
			//ps=con.prepareStatement("select  id, cityname ,hotelname from hotelsearch where cityname=?");
			ps.setString(1,cityname);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) 
			{   
				ArrayList<String> list=new ArrayList<String>();
				list.add(rs.getString("hotelname"));
				list.add(rs.getString("cityname"));
				list.add(rs.getString("roomtype"));
				list.add(rs.getString("price"));
				
				list.add(rs.getString("id"));
				list.add(rs.getString("cityname"));
				list.add(rs.getString("hotelname"));
				recordList.addAll(list);
				
			}
			return recordList;*/
	/*		return (ArrayList<String>) recordMap;*/
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*finally{
			try {
				factory.close();
				session.close();
				transaction.commit();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}*/
		
		return recordMap;
	}
	
	
	
	private java.util.List<hotel> gethotel(int id){
		java.util.List<hotel> citylist = new ArrayList<>();
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction =null;
		try {
		
			
			
		 factory = HibernateChecked.getSessionFactory();
		 session = factory.openSession();
		 transaction = session.beginTransaction();
		 Query query = session.createQuery("from hotel h where h.city.cityid="+id);
		// query.setParameter(arg0, arg1)
		 citylist = query.list();
		 return citylist;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*finally{
			try {
				factory.close();
				session.close();
				transaction.commit();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}*/
		 return citylist;
	}
	
	
	

	public ArrayList<String> getDataFromHotelAutofocus(String fm)
	{
		System.out.println("Inside check"); 
		java.util.List<String> List = new ArrayList<String>();
		PreparedStatement ps;
		String data;
		try {
			Connection con;
			con = connectionchecked.getConnection();
			System.out.println("database connection enstablished");
			
			ps = con.prepareStatement("Select distinct(cityname) From city Where cityname Like ?");
			ps.setString(1, fm + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				data = rs.getString("cityname");
				List.add(data);
			}
			return (ArrayList<String>) List;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}


	
	public  boolean HotelRegistraction( String hotelname,String city,String checkIN,String checkOUT,String room,String price)
	{
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			//java.util.Date mydate = null;
			/*String sd = new SimpleDateFormat("DD/MM/YYYY").format(checkIN);
			String sd1 = new SimpleDateFormat("YYYY/MM/DD").format(sd);
			System.out.println(checkIN);*/
			
			
			
			
			
			java.util.Date date1 = null;
			java.util.Date date2 = null;
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			if(!checkIN.isEmpty())
			date1 = new java.util.Date(df.parse(checkIN).getTime());
			DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
			String strDate = df1.format(date1);
		
			
			SimpleDateFormat dff = new SimpleDateFormat("dd/MM/yyyy");
			if(!checkOUT.isEmpty())
			date2 = new java.util.Date(dff.parse(checkOUT).getTime());
			SimpleDateFormat dff1 = new SimpleDateFormat("yyyy/MM/dd");
			String strDate1 = df1.format(date2);
			
			
			
			
			
			
			hotel h = new hotel();
			city c = new city();
		//pojo.city findcityid = findcityid(c);
		//h.setCity(city);
			
		    h.setHotelname(hotelname);
		    h.setCheckIN(strDate);
		    h.setCheckOUT(strDate1);
		    
		    
		   //h.setCity(findcityid);
		    
		   /*int id = c.getCityid(); 
		    pojo.city findbyhotelpk = findbyhotelpk(id);
		    h.setCity(findbyhotelpk);*/
		   /* h.setCheckIN(strDate);
		    h.setCheckOUT(strDate1);*/
		    
		//    System.out.println("success");
		    
		       Serializable save = session.save(h);
		       
		       
		      hotel hotel = findbyCiTYpk(save);
		      pojo.city getcity = getcity(city, save);
		      h.setCity(getcity);
		      room m=findbyroompk(save);
		      getroom(hotel, price, save,room);
		      
		     // h.setCity(hotel);
		      transaction.commit();
		      
				
		      
		      
		       //findbyroompk(save);
		         //pojo.city getcity = getcity(city,save);
		        //getroom(room, price);
		       
		       return true;
		       
		       
		    
		    
		    
			
			
			
			
			
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				
				factory.close();
				session.close();
				transaction.commit();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return false;
		
	}
	
	private hotel IsExitDate(String cityname)
	{
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		hotel city = new hotel();
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			java.util.List<hotel> citysearch = new ArrayList<>();
			Query query = session.createQuery("from hotel where hotelname ='"+cityname+"' ");
			citysearch = query.list();
			if(!citysearch.isEmpty() && citysearch.size()>0)
			{
				city = citysearch.get(0);
				return city;
			}
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	
	private city getcity(String cityname,Serializable save)
	{
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			city c = new city();
		
		
			c.setCityname(cityname);
			session.save(c);
			transaction.commit();
			return c;
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	
	private room  getroom(hotel room,String price,Serializable save,String room1)
	{
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			room r = new room();
			/*hotel hotel = (pojo.hotel) save;*/
			hotel h = new hotel();
			/*r.setHotel(h.setHotelid(hotelid));*/
			r.setHotel(room);
			r.setRoomname(room1);
			r.setPrice(price);
			
		
			session.save(r);
			transaction.commit();
			return r;
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		room r = null;
		return r;
		
		
		
		
		
	}
	public room findbyroompk(Serializable save)
	{
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
		//	hotel r = new hotel();
			room r=new room();
			 java.util.List<room> userobj = new ArrayList<>();
		        Query hql = session.createQuery("from room where hotelid ='"+save+"'");
				userobj = hql.list();
				
				if(!userobj.isEmpty() && userobj.size()>0)
					r = userobj.get(0);
				
			return r;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
		
	}
	public hotel findbyCiTYpk(Serializable save)
	{
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			hotel c = new hotel();
			 java.util.List<hotel> userobj = new ArrayList<>();
		        Query hql = session.createQuery("from hotel where hotelid ='"+save+"'");
				userobj = hql.list();
				
				if(!userobj.isEmpty() && userobj.size()>0)
					c = userobj.get(0);
					//r = userobj.get(cityid);
				
			return c;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
		
	}
	private city findcityid(city city){
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			city c = new city();
			 
					//r = userobj.get(cityid);
				
			return c;
			
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	/*public hotel findbyhotelpk(Serializable save){
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = HibernateChecked.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			city c = new city();
			 java.util.List<city> userobj = new ArrayList<>();
		        Query hql = session.createQuery("from hotel where CITYID ='"+save+"'");
				userobj = hql.list();
				
				if(!userobj.isEmpty() && userobj.size()>0)
					c = userobj.get(0);
					//r = userobj.get(cityid);
				
			return c;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}*/
	
	


}
