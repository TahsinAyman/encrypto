package com.fullstackbd.tahsin.backend.model;

import com.fullstackbd.tahsin.backend.exceptions.StatusCodeOutOfRange;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    private String message;
    private Boolean result;
    private Integer statusCode;
    private String version = "v1";

}
