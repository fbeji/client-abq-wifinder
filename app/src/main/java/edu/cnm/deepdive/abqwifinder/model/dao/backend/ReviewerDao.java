package edu.cnm.deepdive.abqwifinder.model.dao.backend;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.abqwifinder.model.entity.backend.Reviewer;
import java.util.Date;
import java.util.List;

public interface ReviewerDao {

  @Query("SELECT * FROM Reviewer WHERE Reviewer_id = :reviewerId ORDER BY date DESC")
  List<Reviewer> findAllByUserIdOrderByDate(long reviewerId);



  @Query("SELECT * FROM reviewer WHERE reviewer_id = :reviewerId")
  Reviewer findFirstBySearchId(long reviewerId);



  @Insert
  List<Long> insert(Reviewer... reviewers);



  @Delete
  int delete(Reviewer... reviewers);

  @Query("SELECT * FROM reviewer ORDER BY date DESC")
  List<Reviewer> findAll();


  @Query("SELECT * FROM Reviewer WHERE date = :date")
  Reviewer findFirstByDate(Date date);

}
