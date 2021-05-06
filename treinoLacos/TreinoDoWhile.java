package treinoLacos;

public class TreinoDoWhile {
	public static void main(String[] args) throws InterruptedException {
		
		int i=0;
		
		do { 
			
			System.out.println(i);
			i++;
			
			Thread.sleep(1000);
			
			
			
		} while(i<=10); 
	}

}
