/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LocationDataManagementApiService {

	SDLocationDataManagementActivateOutputModel activate(SDLocationDataManagementActivateInputModel request);
	
	SDLocationDataManagementConfigureOutputModel configure(String sdReferenceId, SDLocationDataManagementConfigureInputModel request);
	
	CRLocationDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryControlInputModel request);
	
	BQLocationExchangeOutputModel exchangeLocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationExchangeInputModel request);
	
	BQOccupancyExchangeOutputModel exchangeOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOccupancyExchangeInputModel request);
	
	CRLocationDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryExchangeInputModel request);
	
	BQUseExchangeOutputModel exchangeUse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUseExchangeInputModel request);
	
	BQLocationExecuteOutputModel executeLocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationExecuteInputModel request);
	
	BQOccupancyExecuteOutputModel executeOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOccupancyExecuteInputModel request);
	
	BQUseExecuteOutputModel executeUse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUseExecuteInputModel request);
	
	SDLocationDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDLocationDataManagementFeedbackInputModel request);
	
	CRLocationDirectoryEntryInitiateOutputModel initiate(String sdReferenceId, CRLocationDirectoryEntryInitiateInputModel request);
	
	CRLocationDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryRequestInputModel request);
	
	CRLocationDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQLocationRetrieveOutputModel retrieveLocation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOccupancyRetrieveOutputModel retrieveOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQUseRetrieveOutputModel retrieveUse(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDLocationDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRLocationDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryUpdateInputModel request);
	
	BQLocationUpdateOutputModel updateLocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationUpdateInputModel request);
	
	BQOccupancyUpdateOutputModel updateOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOccupancyUpdateInputModel request);
	
	BQUseUpdateOutputModel updateUse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUseUpdateInputModel request);
	
}
