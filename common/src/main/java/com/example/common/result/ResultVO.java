package com.example.common.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {
    private Integer code;

    private String message;

    private Object data;

    public ResultVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
