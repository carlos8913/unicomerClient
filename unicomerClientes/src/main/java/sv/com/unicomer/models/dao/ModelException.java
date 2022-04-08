package sv.com.unicomer.models.dao;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ModelException(String mensaje) {
	        super(mensaje);
	    }
}
