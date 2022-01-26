package HibernateConfigureConnection;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.util.xml.*;
import org.hibernate.*;
public class HibernateChecked {

	
	private static SessionFactory sessionfactory;
	 
	public static  SessionFactory getSessionFactory(){
		
		try {
			if(sessionfactory == null){
				Configuration cfg = new Configuration();
				cfg.configure("HotelManagementN/src/main/webapp/WEB-INF/hibernate.cfg.xml");
				sessionfactory = cfg.buildSessionFactory();
			}
			
			
			
			return sessionfactory;
			
			
			
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
}
