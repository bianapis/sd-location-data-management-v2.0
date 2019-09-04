package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOccupancyRetrieveOutputModelOccupancyInstanceReport
 */
public class BQOccupancyRetrieveOutputModelOccupancyInstanceReport   {
  private Object occupancyInstanceReportRecord = null;

  private String occupancyInstanceReportType = null;

  private String occupancyInstanceReportParameters = null;

  private Object occupancyInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return occupancyInstanceReportRecord
  **/

  public Object getOccupancyInstanceReportRecord() {
    return occupancyInstanceReportRecord;
  }

  public void setOccupancyInstanceReportRecord(Object occupancyInstanceReportRecord) {
    this.occupancyInstanceReportRecord = occupancyInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return occupancyInstanceReportType
  **/

  public String getOccupancyInstanceReportType() {
    return occupancyInstanceReportType;
  }

  public void setOccupancyInstanceReportType(String occupancyInstanceReportType) {
    this.occupancyInstanceReportType = occupancyInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return occupancyInstanceReportParameters
  **/

  public String getOccupancyInstanceReportParameters() {
    return occupancyInstanceReportParameters;
  }

  public void setOccupancyInstanceReportParameters(String occupancyInstanceReportParameters) {
    this.occupancyInstanceReportParameters = occupancyInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return occupancyInstanceReport
  **/

  public Object getOccupancyInstanceReport() {
    return occupancyInstanceReport;
  }

  public void setOccupancyInstanceReport(Object occupancyInstanceReport) {
    this.occupancyInstanceReport = occupancyInstanceReport;
  }


}

