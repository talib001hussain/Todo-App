package com.talib.tasks.service;

import com.talib.tasks.domain.Task;
import com.talib.tasks.repository.TaskRepository;

public class TaskServiceImp implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> tasksList() {
        return this.taskRepository.findAll();
    }
}
