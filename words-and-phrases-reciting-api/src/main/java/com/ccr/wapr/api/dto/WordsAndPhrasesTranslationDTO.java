package com.ccr.wapr.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

/**
 * 单词短语翻译数据
 * @author ccr12312@163.com at 2019-4-25
 */
@Data
@Builder
public class WordsAndPhrasesTranslationDTO {
    private Integer id;

    private String word;

    //单词翻译
    private String wordTranslation;

    //音标
    private String phoneticSymbol;

    //短语翻译
    private Collection<String> phraseTranslation;
}
