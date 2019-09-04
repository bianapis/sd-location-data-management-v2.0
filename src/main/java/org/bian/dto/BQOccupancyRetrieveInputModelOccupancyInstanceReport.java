package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOccupancyRetrieveInputModelOccupancyInstanceReport
 */
public class BQOccupancyRetrieveInputModelOccupancyInstanceReport   {
  private String occupancyInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return occupancyInstanceReportReference
  **/

  public String getOccupancyInstanceReportReference() {
    return occupancyInstanceReportReference;
  }

  public void setOccupancyInstanceReportReference(String occupancyInstanceReportReference) {
    this.occupancyInstanceReportReference = occupancyInstanceReportReference;
  }


}

