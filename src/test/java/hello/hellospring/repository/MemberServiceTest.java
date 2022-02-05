package hello.hellospring.repository;

import hello.hellospring.service.MemberService;
import org.junit.jupiter.api.BeforeEach;

class MemberServiceTest {

    MemberService memberservice = new MemberService();
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        MemberService memberService = new MemberService(memberRepository);
            
    }
}
