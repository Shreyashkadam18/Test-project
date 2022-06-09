package pack_123;

public class demo {
	   private String password="Satara@123";
	   private String username="shreays35";
       private int a=10;
       private int b=20;
       demo(){
    	    a=100;
    	   b=200;
       }
    	demo(int x){
    		a=400;
    	}
    	public void test() {
    		a++;
    		b--;
    		System.out.println(a);
    		System.out.println(b);
    		
    	}
    	public  String getPassword() {
    		return password;
    	}
    	
}
