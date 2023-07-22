package com.backend.server.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "movies") //creates the collection in the mongodb 
public class Movies {
    @Id
    private int movieId;
    private String title;
    private String duration;
    private String year;
    private String posterUrl;
    private String theater;
    private String status;
    private String gener;
}
