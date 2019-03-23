package me.nuncan.webapp.Models;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Data
@Entity
@Setter
@Generated
@Accessors
@AllArgsConstructor
@EqualsAndHashCode()
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}

