package com.delivery.api.account.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
//@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class) 공통화 가능
public class AccountMeResponse {
    private String email;
    private String name;
    private LocalDateTime registeredAt; //registered_at
}
