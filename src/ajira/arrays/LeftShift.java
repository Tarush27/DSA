package ajira.arrays;

public class LeftShift {
    public static void main(String ...args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 1;
        for (int i = 0;i < a.length;i++){
            System.out.println(a[i] + " ");
        }
        for (int i = 0;i < n;i++){
            int j,temp;
            temp = a[0];
            for (j = 0;j< a.length-1;j++){
                a[j] = a[j+1];
            }
            a[j] = temp;
        }
        System.out.println("array is : ");
        for (int i = 0;i< a.length;i++){
            System.out.println(a[i] + " ");
        }
    }
}
