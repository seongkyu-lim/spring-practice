package com.alan.springexercisebook.jpaQueryMethod.service;

import com.alan.springexercisebook.jpaQueryMethod.domain.Team;
import com.alan.springexercisebook.jpaQueryMethod.domain.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public void removeTeam(String name){
        teamRepository.deleteByName(name);
    }

    @Transactional
    public Team addTeam(String name, Integer number){
        Team team = Team.builder()
                .name(name)
                .number(number)
                .build();

        return teamRepository.save(team);
    }

}
