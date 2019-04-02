package edu.cnm.deepdive.abqwifinder.model.dao.backend;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.abqwifinder.model.entity.backend.Review;
import edu.cnm.deepdive.abqwifinder.model.entity.backend.Reviewer;
import java.util.Date;
import java.util.List;

public interface ReviewDao {
  @Query("SELECT * FROM Review WHERE Review_id = :reviewId ORDER BY date DESC")
  List<Review> findAllByUserIdOrderByDate(long reviewId);



  @Query("SELECT * FROM review WHERE review_id = :reviewId")
  Reviewer findFirstBySearchId(long reviewId);



  @Insert
  List<Long> insert(Review... reviews);



  @Delete
  int delete(Review... reviews);

  @Query("SELECT * FROM review ORDER BY date DESC")
  List<Reviewer> findAll();


  @Query("SELECT * FROM Review WHERE date = :date")
  Review findFirstByDate(Date date);

}
