package laborator5.second;

import laborator5.first.Task;

import java.util.ArrayList;

public class Stack implements Container {
    ArrayList<Task> taskList = new ArrayList<>();

    @Override
    public Task pop() {
        if (!taskList.isEmpty()) {
            return taskList.remove(taskList.size() - 1);
        }
        return null;
    }

    @Override
    public void push(Task task) {
        taskList.add(task);
    }

    @Override
    public int size() {
        return taskList.size();
    }

    @Override
    public boolean isEmpty() {
        return taskList.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        ArrayList newContainer = new ArrayList(taskList);
    }

    public ArrayList<Task> getTasks() {
        return taskList;
    }


}