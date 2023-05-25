package com.example.retrofit_post;

import java.util.HashMap;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    //@GET("posts/1")
    // public Call<Post> getPost ();

    //@GET("posts/id")
    // public Call<Post> getPost (@Path("id") int postId);

    @GET("posts")
    public Call<List<Post>> getPost (@Query("userId") String userId);

    @POST("posts")
    public Call<Post> storePost(@Body HashMap<Object, Object> map);

}