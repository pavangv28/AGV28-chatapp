package com.example.agv28.Fragments;

import com.example.agv28.Notifications.MyResponse;
import com.example.agv28.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAkjZ4aVI:APA91bEF5EJRBisMW9xI-QYl83jiA0HMai335abG5AckqlUo2m_KyhUv8UNuJM-VQLxjCdaqmnNK10gVgS_Y8OTJFHYWaUp5A_uTTlVma1PoanOdGQ-r6SdnqHhidPQd4b2BQ3_p0f7N"
            }
            )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
