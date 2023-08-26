package com.todolvl.app.rest.Repository;

import com.todolvl.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
