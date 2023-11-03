package com.fusion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class storedata {

	public static void main(String[] args) {
		
		try {
		SessionFactory factory = new Configuration().configure("employee.config.xml").buildSessionFactory();
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction(); 
      
     Employee e1=new Employee();    
        
     e1.setName("SHARATH");
      e1.setEmail("r@1234");
      
      Address ad=new Address();
      
      ad.setAddressLine1("sadashivanagara");    
      ad.setCity("MANGLORE");    
      ad.setState("Karnataka");    
      ad.setCountry("India");    
      ad.setPincode(512998);
       
      e1.setAddress(ad);
       ad.setEmployee(e1); 
        
   
    
    session.persist(e1);    
    t.commit();    
        
    session.close(); 
    
    
     
     System.out.println("YOU ARE SUCCSESSFULLY COMPLETE");
     
     
     
}  
		catch(Exception e) {
			
			System.out.print("Exception"+e);
		}

	}

}
