package com.talib.tasks.service;

import com.talib.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> tasksList();
}
