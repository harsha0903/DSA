import java.util.*;
class BinarySearch{
	public static void main(String args[]){
		System.out.println("How many elements do you want to insert in the array?");
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter the elements:");
		int ar[] = new int[num];
		for(int i=0;i<num;i++){
			ar[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to search in the array:");
		int n = sc.nextInt();
		int res = bs(ar,n);
		if(res == 0){
			System.out.println("The element you're searching is not present");
		}else{
			System.out.println("Element " +n+" is present at "+res+" position.");
		}
	}
	public static int bs(int ar[], int n){
		int left = 0;
		int right = ar.length -1;
		int output = 0; 
		while(left<=right){
			int mid = Math.abs((left+right)/2);
			if(ar[mid]<n){
				left=mid+1;
			}else if(ar[mid]>n){
				right=mid-1;
			}else if(ar[mid]==n){
				output = mid+1;
				break;
			}else{
				output = 0;
			}
		}
		return output;
	}
}