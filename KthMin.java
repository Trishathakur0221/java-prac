public class KthMin {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 5, 7};
        int k=4;
        for (int i = 0; i < arr.length-1; i++) 
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
            if(i==k-1)
            {
                System.out.println("The kth minimum element is: "+arr[i]);
                
            }
            System.out.println(" ");
            for(int l=0;l<arr.length;l++)
            {
                System.out.print(arr[l]+" ");
            }

        }
    }
}
    

