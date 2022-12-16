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
    public void removeTeam(Long id){
        teamRepository.deleteById(id);
    }

    @Transactional
    public void addTeam(String name, Integer number){
        Team team = Team.builder()
                .name(name)
                .number(number)
                .build();

        teamRepository.save(team);
    }

}
