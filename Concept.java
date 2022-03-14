package reusable;

public class Concept {
static int i = 30; // static global variable , if no value then output is 0
int j; // non static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		//System.out.println(j);
	Concept a = new Concept();
	a.printvariables();
	a.j = 25;
	System.out.println(a.j);
	}
public  void printvariables() { // non static ( with static)
	System.out.println("Static & Non Static Methods with Global Variables");
	
}

	/*public void nonstatic(){
		System.out.println(i);
		System.out.println(j);*/
	}
