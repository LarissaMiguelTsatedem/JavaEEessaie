package com.examplestage.demoExpleStage.data;

import com.examplestage.demoExpleStage.model.Message;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;

@Service
public interface MessageDAO extends JpaRepository<Message,Long>{

}
