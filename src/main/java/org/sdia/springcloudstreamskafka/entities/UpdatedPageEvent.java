package org.sdia.springcloudstreamskafka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class UpdatedPageEvent {
    private int nameLength;
    private int userLenght;
}
