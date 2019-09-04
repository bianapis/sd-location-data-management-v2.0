package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUseRetrieveOutputModelLocationDirectoryEntryInstanceRecord;
import org.bian.dto.BQUseRetrieveOutputModelUseInstanceAnalysis;
import org.bian.dto.BQUseRetrieveOutputModelUseInstanceReport;
import org.bian.dto.BQUseUpdateInputModelUseInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUseRetrieveOutputModel
 */
public class BQUseRetrieveOutputModel   {
  private BQUseRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord = null;

  private BQUseUpdateInputModelUseInstanceRecord useInstanceRecord = null;

  private String useRetrieveActionTaskReference = null;

  private Object useRetrieveActionTaskRecord = null;

  private String useRetrieveActionResponse = null;

  private BQUseRetrieveOutputModelUseInstanceReport useInstanceReport = null;

  private BQUseRetrieveOutputModelUseInstanceAnalysis useInstanceAnalysis = null;


  /**
   * Get locationDirectoryEntryInstanceRecord
   * @return locationDirectoryEntryInstanceRecord
  **/

  public BQUseRetrieveOutputModelLocationDirectoryEntryInstanceRecord getLocationDirectoryEntryInstanceRecord() {
    return locationDirectoryEntryInstanceRecord;
  }

  public void setLocationDirectoryEntryInstanceRecord(BQUseRetrieveOutputModelLocationDirectoryEntryInstanceRecord locationDirectoryEntryInstanceRecord) {
    this.locationDirectoryEntryInstanceRecord = locationDirectoryEntryInstanceRecord;
  }


  /**
   * Get useInstanceRecord
   * @return useInstanceRecord
  **/

  public BQUseUpdateInputModelUseInstanceRecord getUseInstanceRecord() {
    return useInstanceRecord;
  }

  public void setUseInstanceRecord(BQUseUpdateInputModelUseInstanceRecord useInstanceRecord) {
    this.useInstanceRecord = useInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Use instance retrieve service call 
   * @return useRetrieveActionTaskReference
  **/

  public String getUseRetrieveActionTaskReference() {
    return useRetrieveActionTaskReference;
  }

  public void setUseRetrieveActionTaskReference(String useRetrieveActionTaskReference) {
    this.useRetrieveActionTaskReference = useRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return useRetrieveActionTaskRecord
  **/

  public Object getUseRetrieveActionTaskRecord() {
    return useRetrieveActionTaskRecord;
  }

  public void setUseRetrieveActionTaskRecord(Object useRetrieveActionTaskRecord) {
    this.useRetrieveActionTaskRecord = useRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return useRetrieveActionResponse
  **/

  public String getUseRetrieveActionResponse() {
    return useRetrieveActionResponse;
  }

  public void setUseRetrieveActionResponse(String useRetrieveActionResponse) {
    this.useRetrieveActionResponse = useRetrieveActionResponse;
  }


  /**
   * Get useInstanceReport
   * @return useInstanceReport
  **/

  public BQUseRetrieveOutputModelUseInstanceReport getUseInstanceReport() {
    return useInstanceReport;
  }

  public void setUseInstanceReport(BQUseRetrieveOutputModelUseInstanceReport useInstanceReport) {
    this.useInstanceReport = useInstanceReport;
  }


  /**
   * Get useInstanceAnalysis
   * @return useInstanceAnalysis
  **/

  public BQUseRetrieveOutputModelUseInstanceAnalysis getUseInstanceAnalysis() {
    return useInstanceAnalysis;
  }

  public void setUseInstanceAnalysis(BQUseRetrieveOutputModelUseInstanceAnalysis useInstanceAnalysis) {
    this.useInstanceAnalysis = useInstanceAnalysis;
  }


}

