package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUseRetrieveOutputModelUseInstanceReport
 */
public class BQUseRetrieveOutputModelUseInstanceReport   {
  private Object useInstanceReportRecord = null;

  private String useInstanceReportType = null;

  private String useInstanceReportParameters = null;

  private Object useInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return useInstanceReportRecord
  **/

  public Object getUseInstanceReportRecord() {
    return useInstanceReportRecord;
  }

  public void setUseInstanceReportRecord(Object useInstanceReportRecord) {
    this.useInstanceReportRecord = useInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return useInstanceReportType
  **/

  public String getUseInstanceReportType() {
    return useInstanceReportType;
  }

  public void setUseInstanceReportType(String useInstanceReportType) {
    this.useInstanceReportType = useInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return useInstanceReportParameters
  **/

  public String getUseInstanceReportParameters() {
    return useInstanceReportParameters;
  }

  public void setUseInstanceReportParameters(String useInstanceReportParameters) {
    this.useInstanceReportParameters = useInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return useInstanceReport
  **/

  public Object getUseInstanceReport() {
    return useInstanceReport;
  }

  public void setUseInstanceReport(Object useInstanceReport) {
    this.useInstanceReport = useInstanceReport;
  }


}

