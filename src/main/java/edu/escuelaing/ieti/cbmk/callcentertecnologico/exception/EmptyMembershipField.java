package edu.escuelaing.ieti.cbmk.callcentertecnologico.exception;



public class AdministratorNotFoundException extends Exception {

    public EmptyMembershipField()
    {
        super( new ServerErrorResponseDto( "There are one or more empty membership fields", ErrorCodeEnum.EMPTY_MEMBERSHIP_FIELD, HttpStatus.INTERNAL_SERVER_ERROR ),
                HttpStatus.INTERNAL_SERVER_ERROR );
    }
}