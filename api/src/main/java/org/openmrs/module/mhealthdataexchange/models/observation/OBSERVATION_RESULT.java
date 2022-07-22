package org.openmrs.module.mhealthdataexchange.models.observation;

/**
 * @author Cynthia Kamau Created on 21/07/2022.
 */
public class OBSERVATION_RESULT {
	
	private String units;
	
	private String value_type;
	
	private String observation_value;
	
	private String observation_datetime;
	
	private String coding_system;
	
	private String abnormal_flags;
	
	private String observation_result_status;
	
	private String set_id;
	
	private String observation_identifier;
	
	public String getSet_id() {
		return set_id;
	}
	
	public void setSet_id(String set_id) {
		this.set_id = set_id;
	}
	
	public String getUnits() {
		return units;
	}
	
	public void setUnits(String units) {
		this.units = units;
	}
	
	public String getValue_type() {
		return value_type;
	}
	
	public void setValue_type(String value_type) {
		this.value_type = value_type;
	}
	
	public String getObservation_value() {
		return observation_value;
	}
	
	public void setObservation_value(String observation_value) {
		this.observation_value = observation_value;
	}
	
	public String getObservation_datetime() {
		return observation_datetime;
	}
	
	public void setObservation_datetime(String observation_datetime) {
		this.observation_datetime = observation_datetime;
	}
	
	public String getCoding_system() {
		return coding_system;
	}
	
	public void setCoding_system(String coding_system) {
		this.coding_system = coding_system;
	}
	
	public String getAbnormal_flags() {
		return abnormal_flags;
	}
	
	public void setAbnormal_flags(String abnormal_flags) {
		this.abnormal_flags = abnormal_flags;
	}
	
	public String getObservation_result_status() {
		return observation_result_status;
	}
	
	public void setObservation_result_status(String observation_result_status) {
		this.observation_result_status = observation_result_status;
	}
	
	public String getObservation_identifier() {
		return observation_identifier;
	}
	
	public void setObservation_identifier(String observation_identifier) {
		this.observation_identifier = observation_identifier;
	}
	
}
