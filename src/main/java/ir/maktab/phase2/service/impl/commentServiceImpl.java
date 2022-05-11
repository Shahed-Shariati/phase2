package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Comment;
import ir.maktab.phase2.repository.base.CommentRepository;
import ir.maktab.phase2.service.CommentService;
import ir.maktab.phase2.service.base.BaseServiceImpl;

public class commentServiceImpl extends BaseServiceImpl<CommentRepository, Comment,Integer> implements CommentService {
    public commentServiceImpl(CommentRepository repository) {
        super(repository);
    }
}
