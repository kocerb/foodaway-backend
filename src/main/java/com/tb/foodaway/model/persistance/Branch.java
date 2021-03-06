package com.tb.foodaway.model.persistance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Branch {

    @Id
    private String id;

    @NotNull
    private String branchName;

    @NotNull
    private String companyId;

    @NotNull
    private String companyName;

    private String menuId;

    @NotNull
    private GeoJsonPoint location;
}
