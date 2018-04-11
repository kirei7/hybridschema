package com.vlad.learn.hybridschema.service;

import com.vlad.learn.hybridschema.entity.Chair;
import com.vlad.learn.hybridschema.entity.Table;
import com.vlad.learn.hybridschema.repository.ChairRepository;
import com.vlad.learn.hybridschema.repository.TableRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestService {

    private final Logger logger = LoggerFactory.getLogger(TestService.class);
    @Autowired
    private TableRepository tableRepository;
    @Autowired
    private ChairRepository chairRepository;

    @PostConstruct
    public void doTest() {
        Chair chair = new Chair(null,5);
        chairRepository.save(chair);

        Table table = new Table(null, "nice table");
        tableRepository.save(table);

        logger.debug(chairRepository.findAll().toString());
        logger.debug(tableRepository.findAll().toString());
    }
}
