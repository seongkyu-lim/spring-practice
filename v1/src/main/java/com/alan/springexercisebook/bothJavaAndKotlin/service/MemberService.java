package com.alan.springexercisebook.bothJavaAndKotlin.service;

import com.alan.springexercisebook.bothJavaAndKotlin.domain.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public void createMember(){
        Member member = new Member("test", "lim", "seongkyu", "테스트 멤버입니다.", 1L);
        System.out.println(member.getDescription());
    }
}

class Test{
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.createMember();
    }
}
