package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQUseExchangeInputModel
 */
public class BQUseExchangeInputModel   {
  private String locationDirectoryEntryInstanceReference = null;

  private String useInstanceReference = null;

  private Object useExchangeActionTaskRecord = null;

  private CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest useExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Location Directory Entry instance 
   * @return locationDirectoryEntryInstanceReference
  **/

  public String getLocationDirectoryEntryInstanceReference() {
    return locationDirectoryEntryInstanceReference;
  }

  public void setLocationDirectoryEntryInstanceReference(String locationDirectoryEntryInstanceReference) {
    this.locationDirectoryEntryInstanceReference = locationDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Use instance 
   * @return useInstanceReference
  **/

  public String getUseInstanceReference() {
    return useInstanceReference;
  }

  public void setUseInstanceReference(String useInstanceReference) {
    this.useInstanceReference = useInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return useExchangeActionTaskRecord
  **/

  public Object getUseExchangeActionTaskRecord() {
    return useExchangeActionTaskRecord;
  }

  public void setUseExchangeActionTaskRecord(Object useExchangeActionTaskRecord) {
    this.useExchangeActionTaskRecord = useExchangeActionTaskRecord;
  }


  /**
   * Get useExchangeActionRequest
   * @return useExchangeActionRequest
  **/

  public CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest getUseExchangeActionRequest() {
    return useExchangeActionRequest;
  }

  public void setUseExchangeActionRequest(CRLocationDirectoryEntryExchangeInputModelLocationDirectoryEntryExchangeActionRequest useExchangeActionRequest) {
    this.useExchangeActionRequest = useExchangeActionRequest;
  }


}

