package loopstatment;

public class Arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]  a = new int [3][2];
a[0][0] = 20;
a[0][1] = 50;
a[1][0] = 80;
a[1][1] = 100;
a[2][0] = 130;
a[2][1] = 150;
//System.out.println(a.length);//row lenght
//System.out.println(a[1].length);//col lenght
for(int i=0;i<3;i++) {
	for(int j=0 ;j<2; j++ ) {
	   // a[i][j]=i+j;
	    System.out.println(a[i][j]);
	    /*System.out.println("multiply");
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
        System.out.println(a[1][0]);
        System.out.println(a[1][1]);
        System.out.println(a[2][0]);
        System.out.println(a[2][1]);*/
        System.out.println("Next Loop");
	}
}

}
}