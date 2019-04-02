package edu.cnm.deepdive.abqwifinder.model.entity.backend;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;


@Entity(
    foreignKeys = @ForeignKey(
        entity = Location.class,
        parentColumns = "location_id", childColumns = "googlemaps_id",
        onDelete = ForeignKey.CASCADE
    )

)

public class Location {

  @ColumnInfo(name = "location_id")
  @PrimaryKey(autoGenerate = true)
  private long id;


  @ColumnInfo(name = "location", index = true)
  private long locationId;

  @ColumnInfo(index = true)
  private String address;

  @ColumnInfo(index = true)
  private String latitude;

  @ColumnInfo(index = true)
  private String longitude;


  @ColumnInfo(index = true)
  private String pictures;

  @ColumnInfo(index = true)
  private int  review_id;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getLocationId() {
    return locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getPictures() {
    return pictures;
  }

  public void setPictures(String pictures) {
    this.pictures = pictures;
  }

  public int getReview_id() {
    return review_id;
  }

  public void setReview_id(int review_id) {
    this.review_id = review_id;
  }
}

