package cn.kcn.archiver.service;

/**
 * Created by kcn on 15/3/18.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@SuppressWarnings("UnusedDeclaration")
@Service
public class BoardService {
    private static final Logger LOG = LoggerFactory.getLogger(BoardService.class);

    private static BoardService instance;

    public BoardService() {
        instance = this;
    }

    public static BoardService getInstance() {
        return instance;
    }
}
