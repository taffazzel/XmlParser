
public class Employee {

	
		private String firstName;
		private String lastName;
		
		public String getFirstName()
		{
			return this.firstName;
		}
		public String getLastName()
		{
			return this.lastName;
		}
		
		public void setFirstName(String firstname)
		{
			this.firstName = firstName;
		}
		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
		
		@Override
		public String toString()
		{
			return firstName+ " " +lastName;
			
		}
		
		
	

	
}
