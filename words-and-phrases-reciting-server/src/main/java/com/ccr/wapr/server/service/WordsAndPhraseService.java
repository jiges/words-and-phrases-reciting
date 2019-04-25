package com.ccr.wapr.server.service;


import com.ccr.wapr.server.model.WordsAndPhraseDO;

/**
 * 单词短语的添加
 * @author ccr12312@163.com at 2019-4-25
 */
public interface WordsAndPhraseService {

    /**
     * 添加到生词本
     * @param wordsAndPhrase 单词短语
     */
    WordsAndPhraseDO saveWordsAndPhrase(WordsAndPhraseDO wordsAndPhrase);


}
