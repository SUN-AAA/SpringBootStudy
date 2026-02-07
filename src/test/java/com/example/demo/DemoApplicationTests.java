package com.example.demo;

import java.time.LocalDateTime;
import java.util.Optional;

import com.example.demo.Answer.Answer;
import com.example.demo.Question.Question;
import com.example.demo.Answer.AnswerRepository;
import com.example.demo.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() {
        //데이터 저장
        /*
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);
        */

        //데이터 수정
        /*
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        q.setSubject("수정된 제목");
        q.setContent("수정이 제대로 되었는지 확인하고 싶습니다.");
        this.questionRepository.save(q);
         */

        //데이터 삭제
        /*
        assertEquals(3, this.questionRepository.count());
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        this.questionRepository.delete(q);
        assertEquals(2,this.questionRepository.count());
         */

        //Answer 데이터 추가하기
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q);
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);

    }

}
