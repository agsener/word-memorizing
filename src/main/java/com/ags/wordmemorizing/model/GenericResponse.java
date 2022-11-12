package com.ags.wordmemorizing.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
public class GenericResponse<T> {
    private int code;
    private String message;
    private T data;
}
