package com.aguiar.demo_park_api.repository;

import com.aguiar.demo_park_api.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
