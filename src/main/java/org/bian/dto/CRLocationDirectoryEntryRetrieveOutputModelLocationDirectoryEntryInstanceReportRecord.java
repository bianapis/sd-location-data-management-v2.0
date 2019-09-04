package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceReportRecord
 */
public class CRLocationDirectoryEntryRetrieveOutputModelLocationDirectoryEntryInstanceReportRecord   {
  private String locationDirectoryEntryInstanceReportData = null;

  private String locationDirectoryEntryInstanceReportType = null;

  private Object locationDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return locationDirectoryEntryInstanceReportData
  **/

  public String getLocationDirectoryEntryInstanceReportData() {
    return locationDirectoryEntryInstanceReportData;
  }

  public void setLocationDirectoryEntryInstanceReportData(String locationDirectoryEntryInstanceReportData) {
    this.locationDirectoryEntryInstanceReportData = locationDirectoryEntryInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return locationDirectoryEntryInstanceReportType
  **/

  public String getLocationDirectoryEntryInstanceReportType() {
    return locationDirectoryEntryInstanceReportType;
  }

  public void setLocationDirectoryEntryInstanceReportType(String locationDirectoryEntryInstanceReportType) {
    this.locationDirectoryEntryInstanceReportType = locationDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return locationDirectoryEntryInstanceReport
  **/

  public Object getLocationDirectoryEntryInstanceReport() {
    return locationDirectoryEntryInstanceReport;
  }

  public void setLocationDirectoryEntryInstanceReport(Object locationDirectoryEntryInstanceReport) {
    this.locationDirectoryEntryInstanceReport = locationDirectoryEntryInstanceReport;
  }


}

