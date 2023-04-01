package dev.anderson.resource.handler;

import dev.anderson.exceptions.BookNotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionHandler implements ExceptionMapper<BookNotFoundException> {

    @Override
    public Response toResponse(BookNotFoundException e) {
        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(e.getMessage())
                .build();
    }
}
