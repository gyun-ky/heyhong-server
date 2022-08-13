package com.heyhong.HeyHong.facility.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FacilityCommentCountDto {

    private Long facilityId;
    private Long commentCount;

}
