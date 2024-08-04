package com.delivery.db.accout;

import com.delivery.db.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Table(name = "account")
@Data
@EqualsAndHashCode(callSuper = true) // 객체 비교시 부모에 있는 값까지 비교
@SuperBuilder // 그냥 builder 사용 시 부모가 가지고 있는 변수를 빌드 불가능
@Entity
public class AccountEntity extends BaseEntity {
}
