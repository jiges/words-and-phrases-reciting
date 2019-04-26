package com.ccr.wapr.server.service.impl;

import com.ccr.wapr.server.model.WordsAndPhraseDO;
import com.ccr.wapr.server.repository.WordRepository;
import com.ccr.wapr.server.service.WordsAndPhraseService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ccr12312@163.com at 2019-4-25
 */
@Service
public class WordsAndPhraseServiceImpl extends AbstractCrudService<WordsAndPhraseDO,String> implements WordsAndPhraseService, InitializingBean {

    @Autowired
    WordRepository wordRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        super.setRepository(wordRepository);
    }
}
