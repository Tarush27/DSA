package ajira.arrays;

public class PrintDups {
    public static void main(String ...args){
        int[] a = {1,2,3,4,2,7,8,8,3};
        for (int i = 0;i< a.length;i++){
            for (int j = i+1;j< a.length;j++){
                if (a[i] == a[j]){
                    System.out.println(a[j]);
                }
            }
        }
        System.out.println();
    }
}
