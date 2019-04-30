package com.ccr.wapr.client.service.impl;

import com.ccr.wapr.api.dto.WordsAndPhrasesDTO;
import com.ccr.wapr.client.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ccr12312@163.com at 2019-4-29
 */
@Service
public class WordServiceImpl implements WordService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public WordsAndPhrasesDTO addWord(WordsAndPhrasesDTO word) {
        return restTemplate.postForObject("http://localhost:8080/words",word,WordsAndPhrasesDTO.class);
    }
}
