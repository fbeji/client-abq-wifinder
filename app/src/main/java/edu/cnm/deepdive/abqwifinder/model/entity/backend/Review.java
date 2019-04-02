package edu.cnm.deepdive.abqwifinder.model.entity.backend;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(
    foreignKeys = @ForeignKey(
        entity = Review.class,
        parentColumns = "review_id", childColumns = "reviewer_id",
        onDelete = ForeignKey.CASCADE
    ))
public class Review {

  @ColumnInfo(name = "review_id")
  @PrimaryKey(autoGenerate = true)
  private long id;


  @ColumnInfo(name = "reviewer", index = true)
  private long reviewerId;

  @ColumnInfo(index = true)
  private String text;

  @ColumnInfo(index = true)
  private String photos;



  @ColumnInfo(index = true)
  private String location;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getReviewerId() {
    return reviewerId;
  }

  public void setReviewerId(long reviewerId) {
    this.reviewerId = reviewerId;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPhotos() {
    return photos;
  }

  public void setPhotos(String photos) {
    this.photos = photos;
  }
}
