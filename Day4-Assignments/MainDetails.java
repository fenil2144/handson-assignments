import java.util.Date;

public class MainDetails {
	
	public static void main(String args[]){
		
		Admin admin = new Admin("Fenil Shah", new Date(), "Male", "7802904861" ,new Address("Ahmedabad", "Gujarat",380001),"fenil2144", "fenil13#", true, 12344L,40000, new Account(12345,120000),"Main Server");
		Manager manager = new Manager("Fenil Shah", new Date(), "Male", "7802904861" ,new Address("Ahmedabad", "Gujarat",380001),12345L,60000,new Account(15425,100000),15);
		Customer customer = new Customer("Fenil Shah", new Date(), "Male", "7802904861" ,new Address("Ahmedabad", "Gujarat",380001),77877,"Gold",new Account(153225,100000));
		Student student = new Student("Fenil Shah", new Date(), "Male", "7802904861" ,new Address("Ahmedabad", "Gujarat",380001),21L,"12",70);
		Programmer programmer = new Programmer("Fenil Shah", new Date(), "Male", "7802904861" ,new Address("Ahmedabad", "Gujarat",380001),3245L,70000,new Account(154223,30000),1222L,"java");
		
		admin.testDisplay();
		admin.testUpdate();
		
		manager.testDisplay();
		manager.testUpdate();
		
		customer.testDisplay();
		customer.testUpdate();
		
		student.testDisplay();
		student.testUpdate();
		
		programmer.testDisplay();
		programmer.testUpdate();
	}
	
	public void testDisplay(Person person){
		person.testDisplay();
	}
	public void testUpdate(Person person){
		
        if(person instanceof Employee){
        	person.testUpdate();
        }

          
        else if(person instanceof Student){
        	Student student=(Student)person;
            student.setGrade(80);
        }
        else if(person instanceof Customer){
        	Customer customer = (Customer)person;
        	customer.getAccount().setBalance(10000);
        }

	}

}
