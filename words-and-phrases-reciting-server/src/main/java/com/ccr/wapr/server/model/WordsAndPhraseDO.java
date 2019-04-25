package com.ccr.wapr.server.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

/**
 * 单词本实体
 * @author ccr12312@163.com at 2019-4-25
 */
@Data
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "word")
public class WordsAndPhraseDO {

    @Id
    private String id;

    @DBRef
    @Indexed
    private UserDO user;

    @EqualsAndHashCode.Include
    @Indexed(unique = true) //唯一索引
    private String word;

    //单词翻译
    private String wordTranslation;

    //音标
    private String phoneticSymbol;

    //短语
    private Collection<String> phrases;

    //短语翻译
    private Collection<String> phraseTranslation;

}
