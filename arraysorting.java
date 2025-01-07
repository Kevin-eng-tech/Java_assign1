package array;

public class arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,3,4,6,1,7,9};
		for(int i = 0;i<7-1;i++) {
			for(int j = 0;j<7-i-1;j++) {
				if(num[j]>num[j+1]) {
					int temp =num[j];
					num[j] = num[j+1];
					num[j+1]=temp;
				}
					
				
			}
				
		}
		System.out.println("\nstorted array:");
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+"");
		}
	}

}
