package laborator5.second;

import laborator5.first.Task;

import java.util.ArrayList;

public class Queue implements Container {
    ArrayList<Task> taskList = new ArrayList<>();

    @Override
    public Task pop() {
        if (!taskList.isEmpty()) {
            return taskList.remove(0);
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

    }

//    @Override
//    public void transferFrom(Container container) {
//            taskList.addAll(container.getTasks());
////            System.out.println(container.size());
//            container.getTasks().removeAll(taskList);
//    }

    public ArrayList<Task> getTasks() {
        return taskList;
    }
}
