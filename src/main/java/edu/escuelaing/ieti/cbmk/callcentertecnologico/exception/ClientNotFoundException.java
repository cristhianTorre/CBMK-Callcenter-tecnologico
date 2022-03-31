package edu.escuelaing.ieti.cbmk.callcentertecnologico.exception;

import edu.eci.ezpz.error.ErrorCodeEnum;
import edu.eci.ezpz.error.InternalServerErrorException;
import org.springframework.http.HttpStatus;

public class ClientNotFoundException extends InternalServerErrorException {

    public ClientNotFoundException()
    {
        super( new ServerErrorResponseDto( "Client not found", ErrorCodeEnum.CLIENT_NOT_FOUND, HttpStatus.NOT_FOUND ),
                HttpStatus.NOT_FOUND );
    }
}
