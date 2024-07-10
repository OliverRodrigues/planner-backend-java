package com.planner.planner.domain.request;

import java.util.List;

public record TripRequestPayload(
        String destination,
        String startsAt,
        String endsAt,
        List<String> emailsToInvite,
        String ownerName,
        String ownerEmail) {
}
