package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
//원하는 서비스에 컨트롤 시프트 t 를 누르고 아래 메소드 선택하고 생성.
class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void join() {
//        given 이 상황
        Member member = new Member();
        member.setName("hello");

//        when 이 과정
        //        스펙을 자유롭게 잡는다?
//        cl+al+v 리턴 생성
        Long saveId = memberService.join(member);

//        then 이 결과
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}