/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class LocationDataManagementApiServiceImpl implements LocationDataManagementApiService {

	public SDLocationDataManagementActivateOutputModel activate(SDLocationDataManagementActivateInputModel request){
		return JsonReader.read("activate-SDLocationDataManagementActivateOutputModel.json",new TypeReference<SDLocationDataManagementActivateOutputModel>(){});
	}
	
	public SDLocationDataManagementConfigureOutputModel configure(String sdReferenceId, SDLocationDataManagementConfigureInputModel request){
		return JsonReader.read("configure-SDLocationDataManagementConfigureOutputModel.json",new TypeReference<SDLocationDataManagementConfigureOutputModel>(){});
	}
	
	public CRLocationDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryControlInputModel request){
		return JsonReader.read("control-CRLocationDirectoryEntryControlOutputModel.json",new TypeReference<CRLocationDirectoryEntryControlOutputModel>(){});
	}
	
	public BQLocationExchangeOutputModel exchangeLocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationExchangeInputModel request){
		return JsonReader.read("exchange-BQLocationExchangeOutputModel.json",new TypeReference<BQLocationExchangeOutputModel>(){});
	}
	
	public BQOccupancyExchangeOutputModel exchangeOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOccupancyExchangeInputModel request){
		return JsonReader.read("exchange-BQOccupancyExchangeOutputModel.json",new TypeReference<BQOccupancyExchangeOutputModel>(){});
	}
	
	public CRLocationDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryExchangeInputModel request){
		return JsonReader.read("exchange-CRLocationDirectoryEntryExchangeOutputModel.json",new TypeReference<CRLocationDirectoryEntryExchangeOutputModel>(){});
	}
	
	public BQUseExchangeOutputModel exchangeUse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUseExchangeInputModel request){
		return JsonReader.read("exchange-BQUseExchangeOutputModel.json",new TypeReference<BQUseExchangeOutputModel>(){});
	}
	
	public BQLocationExecuteOutputModel executeLocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationExecuteInputModel request){
		return JsonReader.read("execute-BQLocationExecuteOutputModel.json",new TypeReference<BQLocationExecuteOutputModel>(){});
	}
	
	public BQOccupancyExecuteOutputModel executeOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOccupancyExecuteInputModel request){
		return JsonReader.read("execute-BQOccupancyExecuteOutputModel.json",new TypeReference<BQOccupancyExecuteOutputModel>(){});
	}
	
	public BQUseExecuteOutputModel executeUse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUseExecuteInputModel request){
		return JsonReader.read("execute-BQUseExecuteOutputModel.json",new TypeReference<BQUseExecuteOutputModel>(){});
	}
	
	public SDLocationDataManagementFeedbackOutputModel feedback(String sdReferenceId, SDLocationDataManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDLocationDataManagementFeedbackOutputModel.json",new TypeReference<SDLocationDataManagementFeedbackOutputModel>(){});
	}
	
	public CRLocationDirectoryEntryInitiateOutputModel initiate(String sdReferenceId, CRLocationDirectoryEntryInitiateInputModel request){
		return JsonReader.read("initiate-CRLocationDirectoryEntryInitiateOutputModel.json",new TypeReference<CRLocationDirectoryEntryInitiateOutputModel>(){});
	}
	
	public CRLocationDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRLocationDirectoryEntryRequestOutputModel.json",new TypeReference<CRLocationDirectoryEntryRequestOutputModel>(){});
	}
	
	public CRLocationDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRLocationDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRLocationDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQLocationRetrieveOutputModel retrieveLocation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLocationRetrieveOutputModel.json",new TypeReference<BQLocationRetrieveOutputModel>(){});
	}
	
	public BQOccupancyRetrieveOutputModel retrieveOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOccupancyRetrieveOutputModel.json",new TypeReference<BQOccupancyRetrieveOutputModel>(){});
	}
	
	public BQUseRetrieveOutputModel retrieveUse(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQUseRetrieveOutputModel.json",new TypeReference<BQUseRetrieveOutputModel>(){});
	}
	
	public SDLocationDataManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDLocationDataManagementRetrieveOutputModel.json",new TypeReference<SDLocationDataManagementRetrieveOutputModel>(){});
	}
	
	public CRLocationDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLocationDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRLocationDirectoryEntryUpdateOutputModel.json",new TypeReference<CRLocationDirectoryEntryUpdateOutputModel>(){});
	}
	
	public BQLocationUpdateOutputModel updateLocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLocationUpdateInputModel request){
		return JsonReader.read("update-BQLocationUpdateOutputModel.json",new TypeReference<BQLocationUpdateOutputModel>(){});
	}
	
	public BQOccupancyUpdateOutputModel updateOccupancy(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOccupancyUpdateInputModel request){
		return JsonReader.read("update-BQOccupancyUpdateOutputModel.json",new TypeReference<BQOccupancyUpdateOutputModel>(){});
	}
	
	public BQUseUpdateOutputModel updateUse(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUseUpdateInputModel request){
		return JsonReader.read("update-BQUseUpdateOutputModel.json",new TypeReference<BQUseUpdateOutputModel>(){});
	}
	
}
