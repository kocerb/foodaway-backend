package com.tb.bimo.model.dto.request;

import com.sun.istack.internal.NotNull;
import com.tb.bimo.model.dto.common.ProductIdQuantity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBasketRequest {

    @NotNull
    String companyId;

    String campaignId;

    List<ProductIdQuantity> products;
}


