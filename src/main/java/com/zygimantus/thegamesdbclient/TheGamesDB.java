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

import com.zygimantus.thegamesdb.model.GameArtData;
import com.zygimantus.thegamesdb.model.GameData;
import com.zygimantus.thegamesdb.model.GamesListData;
import com.zygimantus.thegamesdb.model.PlatformData;
import com.zygimantus.thegamesdb.model.PlatformListData;
import com.zygimantus.thegamesdb.model.UpdateItems;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *
 * @author Zygimantus
 */
public interface TheGamesDB {

    @GET("GetGamesList.php")
    public Call<GamesListData> getGamesList(@Query("name") String name,
            @Query("platform") String platform,
            @Query("genre") String genre);

    @GET("GetGame.php")
    public Call<GameData> getGame(@Query("name") String name,
            @Query("exactname") String exactname,
            @Query("id") int id,
            @Query("platform") String platform);

    @GET("GetArt.php")
    public Call<GameArtData> getArt(@Query("id") int id);

    @GET("GetPlatformsList.php")
    public Call<PlatformListData> getPlatformsList();

    @GET("GetPlatform.php")
    public Call<PlatformData> getPlatform(@Query("id") int id);

    @GET("GetPlatformGames.php")
    public Call<GamesListData> getPlatformGames(@Query("platform") int platform);

    @GET("PlatformGames.php")
    public Call<GamesListData> platformGames(@Query("platform") String platform);

    @GET("Updates.php")
    public Call<UpdateItems> updates(@Query("time") int time);

}
