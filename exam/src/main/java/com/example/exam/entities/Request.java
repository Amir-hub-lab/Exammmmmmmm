package com.example.exam.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "type_of_request")
    String typeOfRequest;

    @Column(name = "created_date")
    LocalDateTime createdDate;

    @PostPersist
    public void createdDate(){
        createdDate = LocalDateTime.now();
    }
}
