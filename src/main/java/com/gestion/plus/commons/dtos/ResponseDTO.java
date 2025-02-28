package com.gestion.plus.commons.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
	
	private Boolean success;
	private String message;
	private Integer code;
	private Object response;
	
	public ResponseDTO(String message, Boolean success, Object response) {
        this.success = success;
        this.message = message;
        this.response = response;
        this.code = success ? 200 : 400; 
    }

  
    public ResponseDTO(String message, Boolean success) {
        this.success = success;
        this.message = message;
        this.code = success ? 200 : 400;
        this.response = null;
    }
}
