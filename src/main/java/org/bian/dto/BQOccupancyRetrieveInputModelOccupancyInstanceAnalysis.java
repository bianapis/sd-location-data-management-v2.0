package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOccupancyRetrieveInputModelOccupancyInstanceAnalysis
 */
public class BQOccupancyRetrieveInputModelOccupancyInstanceAnalysis   {
  private String occupancyInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return occupancyInstanceAnalysisReference
  **/

  public String getOccupancyInstanceAnalysisReference() {
    return occupancyInstanceAnalysisReference;
  }

  public void setOccupancyInstanceAnalysisReference(String occupancyInstanceAnalysisReference) {
    this.occupancyInstanceAnalysisReference = occupancyInstanceAnalysisReference;
  }


}

