package linkedlists;

class demo{
    int a = 56;
    // void change(int a[], int l){
    //     a[l-1] = 10;
    // }
}


public class Methodandclass {
   static int b = 0;
   static void change(int a[], int l){
        a[l-1] = 10;
    }
        public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        demo obj = new demo();
        // Methodandclass obj = new Methodandclass();
        change(arr,arr.length);
        int b = 3;
        obj.a = 6;
        System.out.println(k);
        // System.out.println(arr[arr.length-1]);
    }
}
