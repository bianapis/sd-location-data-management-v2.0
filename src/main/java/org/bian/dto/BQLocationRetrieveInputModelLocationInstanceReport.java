package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationRetrieveInputModelLocationInstanceReport
 */
public class BQLocationRetrieveInputModelLocationInstanceReport   {
  private String locationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return locationInstanceReportReference
  **/

  public String getLocationInstanceReportReference() {
    return locationInstanceReportReference;
  }

  public void setLocationInstanceReportReference(String locationInstanceReportReference) {
    this.locationInstanceReportReference = locationInstanceReportReference;
  }


}

