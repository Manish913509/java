public class maximum {

    public static void main(String[] args) {
        int arr[]={12,43,57,9,30};
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element : " + max); 
    }
}