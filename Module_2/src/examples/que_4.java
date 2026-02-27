package examples;

public class que_4 {

	    int id;
	    String name;

	    que_4() {
	        id = 0;
	        name = "Unknown";
	    }

	    que_4(int i, String n) {
	        id = i;
	        name = n;
	    }

	    void display() {
	        System.out.println("ID: " + id + ", Name: " + name);
	    }

	    public static void main(String[] args) {

	    	que_4 s1 = new que_4(); 
	    	que_4 s2 = new que_4(101, "Priyanshu"); 

	        s1.display();
	        s2.display();
	    }
	
}
