package com.lai.twitch.model;


import com.lai.twitch.db.entity.ItemEntity;


public record FavoriteRequestBody(
        ItemEntity favorite
) {}
