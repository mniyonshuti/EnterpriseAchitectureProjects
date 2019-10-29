package edu.mum.cs.springbatchtest.repository;

import edu.mum.cs.springbatchtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
