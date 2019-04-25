package com.ccr.wapr.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

/**
 * 生词本数据对象
 * @author ccr12312@163.com at 2019-4-25
 */
@Data
@Builder
public class WordsAndPhrasesDTO {
    private Integer id;

    private String word;

    private Collection<String> phrases;
}
