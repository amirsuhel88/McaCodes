public class QuickSort{

	public static int partition(int arr[], int low, int high){
		int pivot = arr[high];	//considering the last element as pivot element.
		int i = low-1;
		
		for(int j = low; j<high; j++){
			 if(arr[j]<pivot){  //elements that are smaller than the pivot. 
			 	i++; 
			 	int temp = arr[i];
			 	arr[i] = arr[j];
			 	arr[j]=temp;   
			 }	
		}
		i++;
		int temp = arr[i];
		arr[i]= pivot;	//pivot == arr[high]   so same thing.
		arr[high]= temp;
		return i;	//pivot index.
	}

	public static void quickSort(int[] arr,int low,int high){
		if(low<high){
			int pidx = partition(arr,low,high);
			
			quickSort(arr,low, pidx-1);	//left side of the pivot element
			quickSort(arr,pidx+1,high);	//right side of the pivot eliment
		}
	}
	public static void main(String[] args){
		int[] arr = {6,3,9,5,2,12,10,8};
		int n = arr.length;
		quickSort(arr,0,n-1);
		for(int i=0; i<n-1; i++){
			System.out.println(arr[i]);
		}
	}
}
