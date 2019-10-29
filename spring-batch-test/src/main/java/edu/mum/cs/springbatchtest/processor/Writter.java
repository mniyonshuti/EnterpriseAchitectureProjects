package edu.mum.cs.springbatchtest.processor;

import edu.mum.cs.springbatchtest.model.User;
import edu.mum.cs.springbatchtest.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writter implements ItemWriter<User> {
    @Autowired
    UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println(users);
        userRepository.saveAll(users);
    }
}
