package PattersProgram;

public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int n=3;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				if(i-j<n&&i+j>=n+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
