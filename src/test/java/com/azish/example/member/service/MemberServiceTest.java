package com.azish.example.member.service;


import com.azish.example.member.exception.MemberException;
import org.junit.jupiter.api.*;


/**
 * Test class for member service
 */
class MemberServiceTest {

    private MemberService memberService;

    @BeforeEach
    void setUp() {
        memberService = new MemberServiceImpl();
    }


    @Test
    @DisplayName("start success")
    void start_success() throws MemberException {

    }

}
