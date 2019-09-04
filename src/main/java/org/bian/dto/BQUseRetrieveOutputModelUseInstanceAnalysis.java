package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUseRetrieveOutputModelUseInstanceAnalysis
 */
public class BQUseRetrieveOutputModelUseInstanceAnalysis   {
  private Object useInstanceAnalysisRecord = null;

  private String useInstanceAnalysisReportType = null;

  private String useInstanceAnalysisParameters = null;

  private Object useInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return useInstanceAnalysisRecord
  **/

  public Object getUseInstanceAnalysisRecord() {
    return useInstanceAnalysisRecord;
  }

  public void setUseInstanceAnalysisRecord(Object useInstanceAnalysisRecord) {
    this.useInstanceAnalysisRecord = useInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return useInstanceAnalysisReportType
  **/

  public String getUseInstanceAnalysisReportType() {
    return useInstanceAnalysisReportType;
  }

  public void setUseInstanceAnalysisReportType(String useInstanceAnalysisReportType) {
    this.useInstanceAnalysisReportType = useInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return useInstanceAnalysisParameters
  **/

  public String getUseInstanceAnalysisParameters() {
    return useInstanceAnalysisParameters;
  }

  public void setUseInstanceAnalysisParameters(String useInstanceAnalysisParameters) {
    this.useInstanceAnalysisParameters = useInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return useInstanceAnalysisReport
  **/

  public Object getUseInstanceAnalysisReport() {
    return useInstanceAnalysisReport;
  }

  public void setUseInstanceAnalysisReport(Object useInstanceAnalysisReport) {
    this.useInstanceAnalysisReport = useInstanceAnalysisReport;
  }


}

