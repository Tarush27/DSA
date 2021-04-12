package ajira.arrays;

public class Frequency {
    public static void main(String ...args){
        int[] arr = {1,2,8,3,2,2,2,1};
        int[] frr = new int[arr.length];
//        int c = 0;
        int v = -1;
        for (int i = 0;i < arr.length;i++){
            int c = 1;
            for (int j = i+1; j < arr.length;j++){
                if (arr[i] == arr[j]){
                    c++;
                    frr[j] = v;
                }
            }
            if (frr[i] !=  v){
                frr[i] = c;
            }
        }
        for (int i = 0;i< frr.length;i++){
            if (frr[i] != v){
                System.out.println(arr[i] + " " + frr[i]);
            }
        }
    }
}
