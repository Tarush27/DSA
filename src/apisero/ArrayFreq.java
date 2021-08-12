package apisero;

public class ArrayFreq {
    public static void main(String... args) {
        int[] a = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] f = new int[a.length];
        int visited = -1;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c = 1;
            for (int j = i+1;j< a.length;j++){
                if (a[i] == a[j]){
                    c++;
                    f[j] = visited;
                }
            }
            if (f[i] != visited){
                f[i] = c;
            }
        }
        for (int i = 0;i< f.length;i++){
            if (f[i] != visited){
                System.out.println(a[i] + " " + f[i] + " ");
            }
        }
    }
}
