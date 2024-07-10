package com.planner.planner.domain.entity;

import com.planner.planner.domain.request.TripRequestPayload;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TripEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String destination;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;

    @Column(name = "ends_at", nullable = false)
    private LocalDateTime endsAt;

    @Column(name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;

    @Column(name = "owner_name", nullable = false)
    private String ownerName;

    @Column(name = "owner_email", nullable = false)
    private String ownerEmail;

    public TripEntity(TripRequestPayload payload) {
        this.destination = payload.destination();
        this.startsAt = LocalDateTime.parse(payload.startsAt());
        this.endsAt = LocalDateTime.parse(payload.endsAt());
        this.ownerName = payload.ownerName();
        this.ownerEmail = payload.ownerEmail();
        this.isConfirmed = false;
    }
}
