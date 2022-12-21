package com.alan.springexercisebook.jpaQueryMethod.service;

import com.alan.springexercisebook.jpaQueryMethod.domain.Team;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TeamServiceTest {

    @Autowired
    private AccountService accountService;
    @Autowired
    private TeamService teamService;

    @Test
    @DisplayName("매핑이 되어있는 팀 데이터 삭제해보기.")
    void removeTeam(){
        // kotlin과 java 의  버전? 이 안맞아서 에러나는듯 ?
        Team team = teamService.addTeam("testTeam", 1);
        accountService.addAccount("test@gmail.com", "test", "test1234", team);
        accountService.addAccount("test2@gmail.com", "test2", "test1234", team);

        teamService.removeTeam("testTeam");
    }
}