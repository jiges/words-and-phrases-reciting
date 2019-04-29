package com.ccr.wapr.server.word.controller;

import com.ccr.wapr.api.dto.WordsAndPhrasesDTO;
import com.ccr.wapr.server.word.model.WordsAndPhraseDO;
import com.ccr.wapr.server.word.service.WordsAndPhraseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ccr12312@163.com at 2019-4-29
 */
@RestController
@Api(tags = "单词接口", description = "提供单词增删改查功能")
public class WordController {

    @Autowired
    private WordsAndPhraseService wordService;


    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("words")
    @ApiOperation("添加到生词本")
    WordsAndPhrasesDTO newWord(@RequestBody WordsAndPhrasesDTO wordDTO){
        return asWordsAndPhrasesDTO(wordService.save(asWordsAndPhraseDO(wordDTO)));
    }

    private WordsAndPhrasesDTO asWordsAndPhrasesDTO(WordsAndPhraseDO wordDO) {
        return modelMapper.map(wordDO,WordsAndPhrasesDTO.class);
    }

    private WordsAndPhraseDO asWordsAndPhraseDO(WordsAndPhrasesDTO wordDTO) {
        return modelMapper.map(wordDTO,WordsAndPhraseDO.class);
    }
}
