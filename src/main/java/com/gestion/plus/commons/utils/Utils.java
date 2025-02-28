package com.gestion.plus.commons.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import com.gestion.plus.commons.dtos.ResponseDTO;


public class Utils {
	/**
	 * Método que permite mapear la respuesta de un servicio.
	 */
	public static ResponseDTO mapearRespuesta(final String message, final Integer statusCode,
			final Object objResponse) {
		ResponseDTO response = new ResponseDTO();
		response.setMessage(message);
		response.setCode(statusCode);
		response.setResponse(objResponse);

		return response;
	}

	/**
	 * Método que permite mapear la respuesta de un servicio.
	 */
	public static ResponseDTO mapearRespuesta(final String message, final Integer statusCode) {
		ResponseDTO response = new ResponseDTO();
		response.setMessage(message);
		response.setCode(statusCode);
		response.setResponse(null);

		return response;
	}

	/**
	 * Método que permite agregar horas cuando se actualiza la vigencia.
	 */
	public static Date sumarRestarHorasFecha(Date fecha, int horas) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(Calendar.HOUR, horas);
		return calendar.getTime();
	}

	/**
	 * Método que valida si una cadena es null.
	 */
	public static String validarValue(String valor) {
		return Objects.nonNull(valor) ? valor : "";
	}
}


