package laborator5;

import laborator5.first.*;
import laborator5.fourth.BadAlbum;
import laborator5.fourth.DangerousAlbum;
import laborator5.fourth.Song;
import laborator5.fourth.ThrillerAlbum;
import laborator5.second.*;
import laborator5.third.Operation;

public class Main {

//    private static final int TASK_NO = 6;
//
//    private static Task[] taskList;

//    static {
//        taskList = new Task[TASK_NO];
//
//        taskList[0] = new OutTask("First message task");
//        taskList[1] = new RandomOutTask();
//        taskList[2] = new CounterOutTask();
//        taskList[3] = new OutTask("Second message task");
//        taskList[4] = new CounterOutTask();
//        taskList[5] = new RandomOutTask();
//    }

//    private static void test1() {
//
//        for (Task task : taskList) {
//            task.execute();
//        }
//    }

//    static private void test2() {
//        testQueue();
//        testStack();
//    }

//    private static void testStack() {
//        System.out.println("----> Stack");
//        StackArray s = new StackArray();
////        Stack s = new Stack();
//        fillContainer(s);
//        System.out.println(s.size());
//        executeTasks(s);
//        System.out.println(s.size());
//        System.out.println("----> End testStack");
//        System.out.println("----> Start Testare metoda transferFrom");
//        QueueArray q = new QueueArray();
//        fillContainer(s);
//        q.transferFrom(s);
//        executeTasks(q);
//        System.out.println("Q size: " + q.size());
//        System.out.println("S size: " + s.size());
//        System.out.println(s.isEmpty()); //trebuie sa afiseze true
//        System.out.println("----> End Testare metoda transferFrom");
//
//    }
//
////    private static Queue testQueue() {
//    private static QueueArray testQueue() {
//        System.out.println("----> Queue");
////        Queue q = new Queue();
//        QueueArray q = new QueueArray();
//        fillContainer(q);
//        System.out.println(q.size());
//        executeTasks(q);
//
//        System.out.println(q.size());
//
//        System.out.println("----> End testQueue");
//        return q;
//    }
//
//    private static void executeTasks(Container container) {
//        Task task = container.pop();
//
//        while (task != null) {
//            task.execute();
//            task = container.pop();
//        }
//    }
//
//    private static void fillContainer(Container container) {
//        for(Task task : taskList) {
//            container.push(task);
//        }
//    }
//
//    static private void test3() {
//        Operation op = new Operation(13);
//        op.div(0);
//        op.div(1);
//        System.out.println(op.getNumber()); //13
//        op.mult(2);
//        System.out.println(op.getNumber());  //26
//        op.minus(3);
//        System.out.println(op.getNumber());  //23
//        op.plus(7);
//        System.out.println(op.getNumber()); //30
//    }


    private static void test4() {
        Song song1 = new Song("Bad", 101, "Michael Jackson");
        Song song2 = new Song("Dangerous", 19, "Michael Jackson");
        Song song3 = new Song("Heal the world", 53, "Composer");
        Song song4 = new Song("Thriller", 82, "Michael Jackson" );
        Song song5 = new Song("Beat it", 83, "Michel Jakson");
        Song song6 = new Song("Smooth Criminal", 77, "Composer");

        DangerousAlbum dangerous = new DangerousAlbum();
        dangerous.addSong(song2);
        dangerous.addSong(song3);
        dangerous.addSong(song6);
        System.out.println(dangerous);

        ThrillerAlbum thriller = new ThrillerAlbum();
        thriller.addSong(song4);
        thriller.addSong(song6);
        thriller.addSong(song5);
        System.out.println(thriller);

        BadAlbum bad = new BadAlbum();
        bad.addSong(song1);
        bad.addSong(song6);
        System.out.println(bad);
    }

    public static void main(String[] args) {
//        testQueue();
//        testStack();

//        test2();
//        System.out.println("------\tTEST EX 2 FINISHED\t------");

//        test3();
//        System.out.println("------\tTEST EX 3 FINISHED\t------");
//
        test4();
        System.out.println("------\tTEST EX 4 FINISHED\t------");
    }

}
