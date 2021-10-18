package laborator5.second;

import laborator5.first.Task;

import java.util.ArrayList;

public class QueueArray implements Container{
    static int TASK_LIST_SIZE = 6;
    Task[] taskList = new Task[TASK_LIST_SIZE];

    @Override
    public Task pop() {
        if (taskList[0] == null) {
            return null;
        }
        else {
            for (int i = 0; i < taskList.length-1; i++) {
                taskList[i] = taskList [i+1];
                taskList[taskList.length-1] = null;
            }
            return taskList[0];
        }
    }

    @Override
    public void push(Task task) {
        for (int i = 0; i < taskList.length; i++) {
            if (taskList[i] == null) {
                taskList[i] = task;
                return;
            }
        }
    }

    @Override
    public int size() {
        for (int i = 0; i < taskList.length; i++) {
            if (taskList[i] == null) {
                return i;
            }
        }
        return TASK_LIST_SIZE;
    }

    @Override
    public boolean isEmpty() {
        for (Task task : taskList) {
            if (task != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void transferFrom(Container container) {

    }

}
