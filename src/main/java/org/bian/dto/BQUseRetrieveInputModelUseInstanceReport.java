package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUseRetrieveInputModelUseInstanceReport
 */
public class BQUseRetrieveInputModelUseInstanceReport   {
  private String useInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return useInstanceReportReference
  **/

  public String getUseInstanceReportReference() {
    return useInstanceReportReference;
  }

  public void setUseInstanceReportReference(String useInstanceReportReference) {
    this.useInstanceReportReference = useInstanceReportReference;
  }


}

