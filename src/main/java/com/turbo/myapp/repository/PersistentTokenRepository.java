package com.turbo.myapp.repository;

import com.turbo.myapp.domain.PersistentToken;
import com.turbo.myapp.domain.User;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends MongoRepository<PersistentToken, String> {
    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);
}
