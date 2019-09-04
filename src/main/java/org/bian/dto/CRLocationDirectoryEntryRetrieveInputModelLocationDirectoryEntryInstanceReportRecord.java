package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceReportRecord
 */
public class CRLocationDirectoryEntryRetrieveInputModelLocationDirectoryEntryInstanceReportRecord   {
  private String locationDirectoryEntryInstanceReportReference = null;

  private String locationDirectoryEntryInstanceReportType = null;

  private String locationDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return locationDirectoryEntryInstanceReportReference
  **/

  public String getLocationDirectoryEntryInstanceReportReference() {
    return locationDirectoryEntryInstanceReportReference;
  }

  public void setLocationDirectoryEntryInstanceReportReference(String locationDirectoryEntryInstanceReportReference) {
    this.locationDirectoryEntryInstanceReportReference = locationDirectoryEntryInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return locationDirectoryEntryInstanceReportParameters
  **/

  public String getLocationDirectoryEntryInstanceReportParameters() {
    return locationDirectoryEntryInstanceReportParameters;
  }

  public void setLocationDirectoryEntryInstanceReportParameters(String locationDirectoryEntryInstanceReportParameters) {
    this.locationDirectoryEntryInstanceReportParameters = locationDirectoryEntryInstanceReportParameters;
  }


}

