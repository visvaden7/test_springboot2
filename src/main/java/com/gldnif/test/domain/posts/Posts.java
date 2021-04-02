package com.gldnif.test.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성관련 내용 정리
    private Long id;

    @Column(length = 500, nullable = false)  // 컬럼설정 컬럼길이, null값 설정
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) //컬럼 정의
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}
