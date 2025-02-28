package com.gestion.plus.commons.utils;

public class EntityValidationMessages {
	
	private EntityValidationMessages(){}
	
	public static final String NULL_FIELD_ERROR = "Error: EL campo no puede ser nulo. Nombre campo: {0}";
	public static final String INVALID_FORMAT_ERROR = "Error: El formato del campo es inválido. Nombre campo: {0}";
	public static final String INVALID_LENGTH_ERROR = "Error: La longitud mínima/máxima del campo es inválido. Nombre campo: {0}";
	public static final String INVALID_REFERENCE_ERROR = "Error: El valor referenciado por el campo es inválido: Nombre campo: {0}";
	public static final String INVALID_FIELD_LENGTH_ERROR = "Los campos enviados no cumplen con los tamaños";
}
