package edu.cnm.deepdive.abqwifinder.model.dao.backend;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.abqwifinder.model.entity.backend.Location;
import edu.cnm.deepdive.abqwifinder.model.entity.backend.Reviewer;
import java.util.Date;
import java.util.List;

public interface LocationDao {

  @Query("SELECT * FROM Location WHERE location_id= :locationId ORDER BY date DESC")
  List<Location> findAllByUserIdOrderByDate(long locationId);



  @Query("SELECT * FROM location WHERE location_id = :locationId")
  Location findFirstBySearchId(long locationId);



  @Insert
  List<Long> insert(Location... Locations);



  @Delete
  int delete(Location... Locations);

  @Query("SELECT * FROM location ORDER BY date DESC")
  List<Location> findAll();


  @Query("SELECT * FROM Location WHERE date = :date")
  Location findFirstByDate(Date date);

}
