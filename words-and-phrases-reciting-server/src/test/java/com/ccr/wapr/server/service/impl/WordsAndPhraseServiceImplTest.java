package com.ccr.wapr.server.service.impl;

import com.ccr.wapr.server.model.UserDO;
import com.ccr.wapr.server.model.WordsAndPhraseDO;
import com.ccr.wapr.server.repository.UserRepository;
import com.ccr.wapr.server.service.WordsAndPhraseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author ccr12312@163.com at 2019-4-25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WordsAndPhraseServiceImplTest {

    @Autowired
    WordsAndPhraseService wordsAndPhraseService;

    @Autowired
    UserRepository userRepository;

    @Test
    public void saveWordsAndPhrase() {
        UserDO userDO = userRepository.findOne(Example.of(UserDO.builder().userName("Cherokee").build())).orElse(null);
        WordsAndPhraseDO wordsAndPhraseDO = WordsAndPhraseDO.builder()
                .word("constructor")
                .wordTranslation("构造器")
                .phoneticSymbol("美: [kən'strʌktər] 英: [kən'strʌktə(r)]")
                .user(userDO)
                .phrases(Collections.singletonList("Consider static factory methods instead of constructors"))
                .phraseTranslation(Collections.singletonList("考虑使用静态工厂方法代替构造器"))
                .build();
        System.out.println(wordsAndPhraseService.saveWordsAndPhrase(wordsAndPhraseDO));
    }
}