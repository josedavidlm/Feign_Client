package com.codigo.feign.aggregates.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
  private  int code;
  private String message;
  private Optional date;
}
