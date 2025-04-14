package com.gestion.plus.commons.dtos;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentoRequestDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private List<String> to;
	
	private String templateName;
	
	private String languageCode;
	
	private String pdfUrl;
	
	private String bodyText1;
	
	private String bodyText2;

}
