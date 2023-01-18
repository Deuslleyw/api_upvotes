package com.deusley.api_upvotes.dto;


import lombok.*;


@Data
@Setter
@Getter
@NoArgsConstructor
public class UpvotesDTO {

    private Long postId;
    private Integer curtidas;

}
