package com.alan.springexercisebook.jpaQueryMethod.service;

import com.alan.springexercisebook.jpaQueryMethod.domain.Account;
import com.alan.springexercisebook.jpaQueryMethod.domain.AccountRepository;
import com.alan.springexercisebook.jpaQueryMethod.domain.Team;
import com.alan.springexercisebook.jpaQueryMethod.domain.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final TeamRepository teamRepository;

    @Transactional
    public void addAccount(String email, String name, String password, Team team){
        Account account = Account.builder()
                .email(email)
                .name(name)
                .password(password)
                .team(team)
                .build();

        accountRepository.save(account);
    }
}
