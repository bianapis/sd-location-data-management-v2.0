package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationUpdateInputModelLocationInstanceRecord
 */
public class BQLocationUpdateInputModelLocationInstanceRecord   {
  private String locationType = null;

  private String locationAddress = null;

  private String locationCoordinates = null;

  private String locationDescription = null;

  private String locationConstructionType = null;

  private String locationCapacity = null;

  private String locationStatus = null;

  private String locationNeighborhoodType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Type of location (e.g. building, point of interest, virtual location/device) 
   * @return locationType
  **/

  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference address for the location (e.g. postal address, email, coordinates) 
   * @return locationAddress
  **/

  public String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The coordinates in a form that can be used to match tracked parties to the location (e.g. for real-time marketing) 
   * @return locationCoordinates
  **/

  public String getLocationCoordinates() {
    return locationCoordinates;
  }

  public void setLocationCoordinates(String locationCoordinates) {
    this.locationCoordinates = locationCoordinates;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the property, particularly if it has landmark characteristics 
   * @return locationDescription
  **/

  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The construction approach for a property at the location (e.g. era and architecture as might be used in valuation) 
   * @return locationConstructionType
  **/

  public String getLocationConstructionType() {
    return locationConstructionType;
  }

  public void setLocationConstructionType(String locationConstructionType) {
    this.locationConstructionType = locationConstructionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An indication of the size or scale of the property where appropriate (e.g. 4 bedroom, 600 seat auditorium, 40 cover restaurant) 
   * @return locationCapacity
  **/

  public String getLocationCapacity() {
    return locationCapacity;
  }

  public void setLocationCapacity(String locationCapacity) {
    this.locationCapacity = locationCapacity;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked status (e.g. under construction or repair, inhabited, vacant) 
   * @return locationStatus
  **/

  public String getLocationStatus() {
    return locationStatus;
  }

  public void setLocationStatus(String locationStatus) {
    this.locationStatus = locationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The general purpose and neighborhood of the property (e.g. residential, industrial, commercial) 
   * @return locationNeighborhoodType
  **/

  public String getLocationNeighborhoodType() {
    return locationNeighborhoodType;
  }

  public void setLocationNeighborhoodType(String locationNeighborhoodType) {
    this.locationNeighborhoodType = locationNeighborhoodType;
  }


}

