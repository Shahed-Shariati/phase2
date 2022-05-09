package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.User;
import org.springframework.data.repository.CrudRepository;

public interface BaseRepository  extends CrudRepository<User,Integer> {
}
