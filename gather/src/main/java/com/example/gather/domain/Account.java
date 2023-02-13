package com.example.gather.domain;

import javax.persistence.*;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter @Setter @EqualsAndHashCode(of="id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String nickname;

    private String password;

    private boolean emailVerified;  // 이메일 검증

    private String emailCheckToken; // 이메일 검증할 때 사용할 토큰 값

    private LocalDateTime joinedAt; // 이메일 검증을 거친 사용자들 가입이 된 날짜

    private String bio; // 자기소개

    private String mbti;  // mbti

    private String occupation; // 직업

    private String location; // 거주지역

    @Lob @Basic(fetch = FetchType.EAGER)
    private String profileImage;

    private boolean gatherCreatedByEmail;

    private boolean gatherCreatedByWeb;

    private boolean gatherEnrollmentResultByEmail;

    private boolean gatherEnrollmentResultByWeb;

    private boolean gatherUpdatedByEmail;

    private boolean gatherUpdatedByWeb;

    public void generateEmailCheckToken(){
        this.emailCheckToken = UUID.randomUUID().toString();
    }

}
