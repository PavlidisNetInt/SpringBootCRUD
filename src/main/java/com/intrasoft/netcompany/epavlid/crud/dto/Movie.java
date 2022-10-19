package com.intrasoft.netcompany.epavlid.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
//@Table(name = "movie_tbl")
@Builder
@NoArgsConstructor @AllArgsConstructor
@Data /* This equals to  @Getter + @Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode
       * !BUT there are severe performance issues when paired with JPA !
       */

//@ApiModel(description = "All details about the Contact.")
public class Movie {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    @JsonIgnore
//    @ApiModelProperty(notes = "The database generated movie ID", hidden = true)
    private Long id;

//    @JsonProperty("Title")
//    @ApiModelProperty(notes = "The movie's title", required = true)
    private String title;

//    @JsonProperty("Director")
//    @ApiModelProperty(notes = "The movie's director", required = true)
    private String director;

//    @JsonProperty("Release Year")
//    @ApiModelProperty(notes = "The movie's release year")
    private Integer releaseYear;

}
