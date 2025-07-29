package br.com.risk.checkup.exceptions;

public class MessageDTO {

    private String message;
    private String fields;

    public MessageDTO(String message, String fields){
        this.message = message;
        this.fields = fields;
    }

    public String getMessage() {
        return message;
    }

    public String getFields() {
        return fields;
    }
}
