package edu.mum.cs.springbatchtest.processor;

import edu.mum.cs.springbatchtest.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> Salo = new HashMap<>();
    public Processor(){
        Salo.put("001", "A");
        Salo.put("004", "B");
    }
    @Override
    public User process(User user) throws Exception {
        String salo = user.getSalary();
        String sss = Salo.get(salo);
        user.setSalary(sss);
        return user;
    }
}
