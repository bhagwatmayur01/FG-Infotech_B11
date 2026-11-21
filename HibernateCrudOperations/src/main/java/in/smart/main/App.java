package in.smart.main;

import in.smart.entities.User;

public class App {
    public static void main(String[] args) {
       
    	User user1 =new User();
    	//user1.setId(1);
    	user1.setName("Mayur");
    	user1.setEmail("abc@gmail.com");
    	user1.setPassword("123");
    	user1.setGender("Male");
    	user1.setCity("Pune");
    	
    	Cofiguration cfg= new Configuration();
    	cfg.configuration("/in/sp/config/hebernate.cfg.xml");
    	
    	SessionFactory sessionFactory = cfg.builSessionFactory;
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	//---------Insert operation-----------
    	try 
    	{
    		session.save(user1);
        	transaction.commit();
        	
        	System.out.println("User details added successfully");
		} 
    	catch (Exception e) 
    	{
			transaction.rollback();
			e.printStackTrace();
			
			System.out.println("User details not added due to some error");
		}
    	
    	//---------------Select Operation--------------
         try
         {
        	User user = session.get(User.class, 1L);
        	
        	if (user != null) 
        	{
        		System.out.println(user.getId());
            	System.out.println(user.getName());
            	System.out.println(user.getEmail());
            	System.out.println(user.getPassword());
            	System.out.println(user.getGender());
            	System.out.println(user.getCity());
			} else 
			{
				System.out.println("User not found");
			}
        	
		 } 
         catch (Exception e) 
         {
        	 e.printStackTrace();
		 }
        
         
       //---------Update operation-----------
//         User user =new User(); 
//         user.setId(3)
//     	   user.setCity("Ladakh");
     	try 
     	{
     		User user = session.get(User.class,3L);
     		user.setCity("Ladakh");
     		
     		session.saveorUpdate(user);
         	transaction.commit();
         	
         	System.out.println("User details Updated successfully");
 		} 
     	catch (Exception e) 
     	{
 			transaction.rollback();
 			e.printStackTrace();
 			
 			System.out.println("User details not Updated due to some error");
 		}
         
     	 //---------Delete operation-----------
//      User user =new User(); 
//      user.setId(3)
//  	   user.setCity("Ladakh");
  	try 
  	{
  		User user = new User();
  		user.setId(3);
  		session.delete(user);
      	transaction.commit();
      	
      	System.out.println("User details deleted successfully");
		} 
  	catch (Exception e) 
  	{
			transaction.rollback();
			e.printStackTrace();
			
			System.out.println("User details not deleted due to some error");
		}  
    	
    }
}
