package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUseUpdateInputModelUseInstanceRecord
 */
public class BQUseUpdateInputModelUseInstanceRecord   {
  private String locationZoningType = null;

  private String locationUsage = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The planning or zoning status (e.g. residential, commercial, industrial) 
   * @return locationZoningType
  **/

  public String getLocationZoningType() {
    return locationZoningType;
  }

  public void setLocationZoningType(String locationZoningType) {
    this.locationZoningType = locationZoningType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed usage for the property at the location (e.g. domestic residence, manufacturing, retail) 
   * @return locationUsage
  **/

  public String getLocationUsage() {
    return locationUsage;
  }

  public void setLocationUsage(String locationUsage) {
    this.locationUsage = locationUsage;
  }


}

