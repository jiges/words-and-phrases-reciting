package com.ccr.wapr.server.word.repository;

import com.ccr.wapr.server.word.model.WordsAndPhraseDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 通过此接口访问wordsAndPhraseDO集合
 * @author ccr12312@163.com at 2019-4-25
 */
public interface WordRepository extends MongoRepository<WordsAndPhraseDO, String> {
}
