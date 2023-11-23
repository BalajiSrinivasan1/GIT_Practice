package pratic;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n*2;j++) {
				if(i+j>n&&j-i<n) {
					System.out.print(j+" ");
				}else { 
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
