package com.java.springboot.xidmatv.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.java.springboot.xidmatv.model.Message;

@Service
public interface MessageDAO extends JpaRepository<Message, Long> {

}
