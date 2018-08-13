package org.rpinzon.snapper.repository;

import org.rpinzon.snapper.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Renan T. Pinzon on 8/10/2018.
 */
@Repository
public interface DataRepository extends JpaRepository<Data, Integer> {

}
