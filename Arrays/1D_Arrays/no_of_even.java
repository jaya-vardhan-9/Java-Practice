public class no_of_even {
    public static void main(String[] args) {
        int arr[] = {23,45,62,63,65,67,80,90,34,57,66,108};

        int even_count = 0;
        int odd_count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Even count "+even_count);
        System.out.println("Odd count "+odd_count);
    }
}
