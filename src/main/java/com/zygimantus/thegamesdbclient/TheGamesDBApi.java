/*
 * The MIT License
 *
 * Copyright 2018 Zygimantus.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.zygimantus.thegamesdbclient;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jaxb.JaxbConverterFactory;

/**
 *
 * @author Zygimantus
 */
public class TheGamesDBApi {

    private static final String BASE_URL = "http://thegamesdb.net/api/";

    private TheGamesDB sportDeer;
    private static TheGamesDBApi apiInstance;

    private TheGamesDBApi() {

        final Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(JaxbConverterFactory.create())
                .build();

        sportDeer = restAdapter.create(TheGamesDB.class);
    }

    public static void init() {
        apiInstance = new TheGamesDBApi();
    }

    public static TheGamesDB getApi() {
        return apiInstance.sportDeer;
    }

    public void setApi(TheGamesDB starWarsApi) {
        apiInstance.sportDeer = starWarsApi;
    }
}
