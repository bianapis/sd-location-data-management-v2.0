package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUseRetrieveInputModelUseInstanceAnalysis
 */
public class BQUseRetrieveInputModelUseInstanceAnalysis   {
  private String useInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return useInstanceAnalysisReference
  **/

  public String getUseInstanceAnalysisReference() {
    return useInstanceAnalysisReference;
  }

  public void setUseInstanceAnalysisReference(String useInstanceAnalysisReference) {
    this.useInstanceAnalysisReference = useInstanceAnalysisReference;
  }


}

