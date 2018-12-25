package top.verly_badcw.api;

import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.*;
import top.verly_badcw.activities.MainActivity;

import static android.support.constraint.Constraints.TAG;

public class login {

    private static OkHttpClient mOkHttpClient;
    private static HashMap<HttpUrl, List<Cookie>> cookieStore = new HashMap<>();

    public static int loginnow(final String username, final String password) throws InterruptedException {
        mOkHttpClient = new OkHttpClient.Builder()
                .cookieJar(new CookieJar() {
                    @Override
                    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                        cookieStore.put(url, cookies);
                        cookieStore.put(HttpUrl.parse("http://verly-badcw.top:8020/api/profile"), cookies);
                        for (Cookie cookie : cookies) {
                            Log.d(TAG, "cookie Name:" + cookie.name());
                            Log.d(TAG, "cookie Path:" + cookie.path());
                        }
                    }

                    @Override
                    public List<Cookie> loadForRequest(HttpUrl url) {
                        List<Cookie> cookies = cookieStore.get(HttpUrl.parse("http://verly-badcw.top:8020/api/profile"));
                        if (cookies == null) {
                            Log.d(TAG, "loadForRequest: cookie empty");
                        }
                        return cookies != null ? cookies : new ArrayList<Cookie>();
                    }
                })
                .build();

        Request get = new Request.Builder()
                .url("http://verly-badcw.top:8020/api/profile")
                .get()
                .build();
        final Call call = mOkHttpClient.newCall(get);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Response re = call.execute();
                    Log.d(TAG, "run: " + re.body().string());
                    RequestBody postb = new FormBody.Builder()
                            .add("username", username)
                            .add("password", password)
                            .build();
                    String csrf = cookieStore.get(HttpUrl.parse("http://verly-badcw.top:8020/api/profile")).get(0).value();
                    Log.d(TAG, "run: " + csrf);
                    Request post = new Request.Builder()
                            .url("http://verly-badcw.top:8020/api/login")
                            .addHeader("Content-Type", "application/json")
                            .header("X-CSRFToken", csrf)
                            .post(postb)
                            .build();
                    final Call call2 = mOkHttpClient.newCall(post);
                    Response res = call2.execute();
                    String result = res.body().string();
                    res.close();
                    MainActivity.editor.putInt("accept", result.contains("Succeeded") ? 1 : 0);
                    MainActivity.editor.commit();
                    Log.d(TAG, "res: " + result);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread.join(4000);

        Log.d(TAG, "loginnow: " + MainActivity.preferences.getInt("accept", 0));

        return MainActivity.preferences.getInt("accept", 0);
    }

}
