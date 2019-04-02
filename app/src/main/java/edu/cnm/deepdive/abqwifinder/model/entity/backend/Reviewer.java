package edu.cnm.deepdive.abqwifinder.model.entity.backend;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(
    foreignKeys = @ForeignKey(
        entity = Reviewer.class,
        parentColumns = "reviewer", childColumns = "review_id",
        onDelete = ForeignKey.CASCADE
    ))

public class Reviewer {

  @ColumnInfo(name = "reviewer_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(index = true)
  private int age;

  @ColumnInfo(index = true)
  private String name;


  @ColumnInfo(index = true)
  private String reviewstatus;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getReviewstatus() {
    return reviewstatus;
  }

  public void setReviewstatus(String reviewstatus) {
    this.reviewstatus = reviewstatus;
  }
}
