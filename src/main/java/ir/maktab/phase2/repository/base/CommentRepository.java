package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
