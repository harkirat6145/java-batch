class WaveformArr{
public static void main(String args[]){
	int[] arr ={1,2,3,4,5,6,7,8,9};
	int i,temp;
	for(i=0;i<arr.length-1;i=i+2){
		if(arr[i]<arr[i+1]){
		temp= arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
		}
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		    }
	           }
                  }