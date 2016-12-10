
public class Quicksort {

	 public static void Quicksort(int array[],int low,int high){
	 int L=low;
	 int H=high;
	 int pivot=array[low];
	 
	 while(L<H)
	 {
		 
	 while(L<H&&array[H]>=pivot)                                                                               
	 H--;
	 
	 if(L<H){
	 int temp=array[H];
	 array[H]=array[L];
	 array[L]=temp;
	 L++;
	 }
	 
	 while(L<H&&array[L]<=pivot)
	 L++;
	 
	 if(L<H){
	 int temp=array[H];
	 array[H]=array[L];
	 array[L]=temp;
	 H--;
	 }
	 
	 }
	 
	 if(L>low)
		Quicksort(array,low,L-1);
	 if(H<high)
		Quicksort(array,L+1,high);
	 }
	
	public static void main(String []a){
		int []b=new int[]{1,3,2,4,1,6,5,8,7,0};
		Quicksort(b,0,b.length-1);
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i]);
		
	}
}
