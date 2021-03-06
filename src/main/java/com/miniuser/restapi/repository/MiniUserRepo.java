package com.miniuser.restapi.repository;

import com.miniuser.restapi.model.MiniUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiniUserRepo extends JpaRepository<MiniUser, Integer> {
}
