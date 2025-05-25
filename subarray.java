public class subarray {
    public static void main(String[] args) {
        int arr[]= {-4,2,5,-1,3};
        int max=0;
         for(int i=0;i<arr.length;i++){
        int sum=0;
       
        for(int j=i;j<arr.length;j++){
           sum +=arr[j];
           if(sum>max){
           max=sum;
        }
    }
}
System.out.println(max);
    }
    
}
