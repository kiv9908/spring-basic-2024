package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class memberServiceTest {

    MemberRepository memberRepository = new MemoryMemberRepository();

    @Test
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberRepository.save(member);
        Member findeMember = memberRepository.findById(1L);

        //then
        Assertions.assertThat(findeMember).isEqualTo(findeMember);
    }
}
