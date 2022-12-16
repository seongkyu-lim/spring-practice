package com.alan.springexercisebook.jpaQueryMethod.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

    void deleteByName(String name);
}
