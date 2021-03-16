package pbljlab;

class VideoStore{
    Video v[] = new Video[10];
    static int index = -1;
    void addVideo(String name){
        index++;
        v[index] = new Video();
        v[index].title = name;
        v[index].flag = true;
        v[index].average = 0.0f;
    }
    void checkOut(String name){
        for (int i=0;i<index;i++){
            if (v[i].title.equals(name)){
                v[i].beingCheckedOut();
            }
        }
    }
    void returnVideo(String name){
        for (int i=0;i<index;i++){
            if (v[i].title.equals(name)){
                v[i].beingReturned();
            }
        }
    }
    void receiveRating(String name,int rating){
        for (int i=0;i<=index;i++){
            if (v[i].title.equals(name)){
                v[i].receivedRating(rating);
            }
        }
    }
    void listInventory(){
        for (int i=0;i<index;i++){
            if (v[i].flag == true){
                System.out.println("Title is : " + v[i].title + " Rating is : " + v[i].average);
            }
        }
    }
}
class Video{
    String title;
    boolean flag;
    float average;

    void beingCheckedOut(){
        flag = false;
    }
    void beingReturned(){
        flag = true;
    }
    void receivedRating(int rating){
        average = (average + rating) / 2;
    }
}
public class VideoStoreLauncher {
    public static void main(String[] args){
        VideoStore vs = new VideoStore();
        vs.addVideo("The Matrix");
        vs.addVideo("The God Father");
        vs.addVideo("Avengers");
        vs.listInventory();
        vs.receiveRating("The Matrix",4);
        vs.receiveRating("The God Father",5);
        vs.receiveRating("Avengers",6);
        vs.listInventory();
        vs.checkOut("The Matrix");
        vs.checkOut("The God Father");
        vs.checkOut("Avengers");
        vs.listInventory();
        vs.returnVideo("The Matrix");
        vs.returnVideo("The God Father");
        vs.returnVideo("Avengers");
        vs.checkOut("The God Father");
    }
}
