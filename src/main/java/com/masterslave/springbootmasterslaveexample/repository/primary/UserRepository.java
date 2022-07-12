package com.masterslave.springbootmasterslaveexample.repository.primary;

import com.masterslave.springbootmasterslaveexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : Ragil Gilang Maulana
 * @Date : 11/07/22
 **/
public interface UserRepository extends JpaRepository<User, Long> {
}
