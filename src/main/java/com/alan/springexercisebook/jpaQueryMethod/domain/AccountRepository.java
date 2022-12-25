package com.alan.springexercisebook.jpaQueryMethod.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    void deleteByName(String accountName);
}
