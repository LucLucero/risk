package br.com.risk.checkup.exceptions;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionController {

    private MessageSource messageSource;

    public ExceptionController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @ExceptionHandler (MethodArgumentNotValidException.class)
    public ResponseEntity<List<MessageDTO>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {

        List<MessageDTO> dto = new ArrayList<>();
        e.getBindingResult().getFieldErrors().forEach( err -> {

            String message = messageSource.getMessage(err, LocaleContextHolder.getLocale() );
            dto.add(new MessageDTO(message, err.getField()));

        });

        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }

}
