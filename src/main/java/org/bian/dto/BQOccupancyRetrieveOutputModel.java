package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOccupancyRetrieveOutputModelLocationDirectoryEntryInstanceRecord;
import org.bian.dto.BQOccupancyRetrieveOutputModelOccupancyInstanceAnalysis;
import org.bian.dto.BQOccupancyRetrieveOutputModelOccupancyInstanceRecord;
import org.bian.dto.BQOccupancyRetrieveOutputModelOccupancyInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOccupancyRetrieveOutputModel
 */
public class BQOccupancyRetrieveOutputModel   {
  private BQOccupancyRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private BQOccupancyRetrieveOutputModelOccupancyInstanceRecord occupancyInstanceRecord = null;

  private String occupancyRetrieveActionTaskReference = null;

  private Object occupancyRetrieveActionTaskRecord = null;

  private String occupancyRetrieveActionResponse = null;

  private BQOccupancyRetrieveOutputModelOccupancyInstanceReport occupancyInstanceReport = null;

  private BQOccupancyRetrieveOutputModelOccupancyInstanceAnalysis occupancyInstanceAnalysis = null;


  /**
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public BQOccupancyRetrieveOutputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(BQOccupancyRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


  /**
   * Get occupancyInstanceRecord
   * @return occupancyInstanceRecord
  **/

  public BQOccupancyRetrieveOutputModelOccupancyInstanceRecord getOccupancyInstanceRecord() {
    return occupancyInstanceRecord;
  }

  public void setOccupancyInstanceRecord(BQOccupancyRetrieveOutputModelOccupancyInstanceRecord occupancyInstanceRecord) {
    this.occupancyInstanceRecord = occupancyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Occupancy instance retrieve service call 
   * @return occupancyRetrieveActionTaskReference
  **/

  public String getOccupancyRetrieveActionTaskReference() {
    return occupancyRetrieveActionTaskReference;
  }

  public void setOccupancyRetrieveActionTaskReference(String occupancyRetrieveActionTaskReference) {
    this.occupancyRetrieveActionTaskReference = occupancyRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return occupancyRetrieveActionTaskRecord
  **/

  public Object getOccupancyRetrieveActionTaskRecord() {
    return occupancyRetrieveActionTaskRecord;
  }

  public void setOccupancyRetrieveActionTaskRecord(Object occupancyRetrieveActionTaskRecord) {
    this.occupancyRetrieveActionTaskRecord = occupancyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return occupancyRetrieveActionResponse
  **/

  public String getOccupancyRetrieveActionResponse() {
    return occupancyRetrieveActionResponse;
  }

  public void setOccupancyRetrieveActionResponse(String occupancyRetrieveActionResponse) {
    this.occupancyRetrieveActionResponse = occupancyRetrieveActionResponse;
  }


  /**
   * Get occupancyInstanceReport
   * @return occupancyInstanceReport
  **/

  public BQOccupancyRetrieveOutputModelOccupancyInstanceReport getOccupancyInstanceReport() {
    return occupancyInstanceReport;
  }

  public void setOccupancyInstanceReport(BQOccupancyRetrieveOutputModelOccupancyInstanceReport occupancyInstanceReport) {
    this.occupancyInstanceReport = occupancyInstanceReport;
  }


  /**
   * Get occupancyInstanceAnalysis
   * @return occupancyInstanceAnalysis
  **/

  public BQOccupancyRetrieveOutputModelOccupancyInstanceAnalysis getOccupancyInstanceAnalysis() {
    return occupancyInstanceAnalysis;
  }

  public void setOccupancyInstanceAnalysis(BQOccupancyRetrieveOutputModelOccupancyInstanceAnalysis occupancyInstanceAnalysis) {
    this.occupancyInstanceAnalysis = occupancyInstanceAnalysis;
  }


}

