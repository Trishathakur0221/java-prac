public class MaxMinArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int max= arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);
        for(int j=0;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(min);
    }
    

}