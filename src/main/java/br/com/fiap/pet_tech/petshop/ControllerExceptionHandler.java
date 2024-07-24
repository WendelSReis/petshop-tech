package br.com.fiap.pet_tech.petshop;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {

    private StandardError error = new StandardError();

    public ResponseEntity<StandardError> entityNotFound(ControllerNotFoundExceptions e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        error.setTimestamp(Instant.now());
        error.setStatus(status.value());
        error.setError("Entity no found");
        error.setMessage(e.getMessage());
        error.setPath(request.getRequestURI());

        return ResponseEntity.status(status).body(this.error);
    }
}

