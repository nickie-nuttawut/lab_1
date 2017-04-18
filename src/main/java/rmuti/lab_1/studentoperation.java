package rmuti.lab_1;
import java.util.Random;
import org.fluttercode.datafactory.impl.DataFactory;



	public class studentoperation {

		DataFactory df = new DataFactory();
		Random rnd = new Random();
		private String[]  Firstname  = new String[10];
		private String[]  Lastname	 = new String[10];
		private String[]  City		 = new String[10];
		private int[]	  Number	 = new int[10];
		private int		  total		 = 0;
		private int		  now		 = rnd.nextInt(10) ;	
		
		

		public studentoperation() {
			for (int i = 0; i < 10; i++) {
				Firstname[i] = df.getFirstName();
				Lastname[i] = df.getLastName();
				City[i] = df.getCity();
				Number[i] = df.getNumberUpTo(100);
			}
		}
		public void getFirstname(){
			
			
			int j=1;	
			for(int i=0; i < 10; i++){
					
					System.out.println(j+" "+this.randomname()+" "+this.randompoint());
					now = rnd.nextInt(10);
					j++;
				
			}
			
		}	
		
		public int tot(){
			for(int i=0;i<10; i++){
				
				total =total+Number[i];
				
				
			}
			
			return total;
				
		}
		
		public String randomname(){
			
			return Firstname[now];
			
			
			
			
		}
		
		public int randompoint(){
			
			
			return Number[now];
			
		}
		 
	
				
		
			
		}
			

		



