package com.lai.twitch.model;


public record TwitchErrorResponse(
        String message,
        String error,
        String details
) {
}
