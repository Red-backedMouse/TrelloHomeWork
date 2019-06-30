package com.trello.api.services;

import com.trello.api.models.TrelloList;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by lolik on 13.06.2019
 */
public interface ListsService {


    @GET("lists/{id}")
    Call<TrelloList> getList(@Path("id") String id);

    @POST("lists")
    Call<TrelloList> createList(@Query("idBoard") String idBoard, @Query("name") String name);

    @PUT("lists/{id}")
    Call<TrelloList> updateList(@Path("id") String id, @Body TrelloList trelloList);

}
