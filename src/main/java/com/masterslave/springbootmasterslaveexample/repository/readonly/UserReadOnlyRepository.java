package com.masterslave.springbootmasterslaveexample.repository.readonly;

import com.masterslave.springbootmasterslaveexample.annotation.ReadOnlyRepository;
import com.masterslave.springbootmasterslaveexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author : Ragil Gilang Maulana
 * @Date : 11/07/22
 **/
@Repository
@ReadOnlyRepository
public interface UserReadOnlyRepository  extends JpaRepository<User, Long> {
}
