package laborator5.second;

import laborator5.first.Task;

import java.util.Arrays;
import java.util.Iterator;

public class StackArray implements Container{
    static int TASK_LIST_SIZE = 6;
    Task[] taskList = new Task[TASK_LIST_SIZE];

    @Override
    public Task pop() {
        if (taskList[0] == null) {
            return null;
        }
        for (int i = 0; i < taskList.length; i++) {
            if (taskList[i] == null) {
                Task popTask = taskList[i-1];
                taskList[i-1] = null;
                return popTask;
            }
        }
        Task popTask = taskList[taskList.length-1];
        taskList[taskList.length-1] = null;
        return popTask;
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
        Task[] newTaskList = taskList;
    }
}
