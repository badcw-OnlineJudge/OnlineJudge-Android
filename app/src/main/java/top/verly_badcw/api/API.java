package top.verly_badcw.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import top.verly_badcw.util.ProblemList;

public interface API {
    @GET("/api/problem")
    Call<ProblemList> getProblemList(@Query("paging") boolean paging, @Query("offset") int offset, @Query("limit") int limit, @Query("page") int page);
}
