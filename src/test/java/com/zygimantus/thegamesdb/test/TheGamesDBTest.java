package com.zygimantus.thegamesdb.test;

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
import com.zygimantus.thegamesdb.model.Game;
import com.zygimantus.thegamesdb.model.GameArtData;
import com.zygimantus.thegamesdb.model.GameData;
import com.zygimantus.thegamesdb.model.GamesListData;
import com.zygimantus.thegamesdb.model.PlatformData;
import com.zygimantus.thegamesdb.model.PlatformListData;
import com.zygimantus.thegamesdb.model.PlatformPlatform;
import com.zygimantus.thegamesdb.model.UpdateItems;
import com.zygimantus.thegamesdbclient.TheGamesDB;
import com.zygimantus.thegamesdbclient.TheGamesDBApi;
import java.io.IOException;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Assert;
import org.junit.Test;
import retrofit2.Response;

/**
 *
 * @author Zygimantus
 */
public class TheGamesDBTest {

    @Test
    public void equalsContractsTest() {
        EqualsVerifier.forClass(Game.class).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED)
                .suppress(Warning.NONFINAL_FIELDS).verify();
        EqualsVerifier.forClass(PlatformPlatform.class).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED)
                .suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void getGamesListTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<GamesListData> response = api.getGamesList("x-men", null, null).execute();

        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void getGameTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<GameData> response = api.getGame(null, null, 2, null).execute();

        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void getArtTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<GameArtData> response = api.getArt(2).execute();

        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void getPlatformsListTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<PlatformListData> response = api.getPlatformsList().execute();

        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void getPlatformTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<PlatformData> response = api.getPlatform(15).execute();

        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void getPlatformGamesTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<GamesListData> response = api.getPlatformGames(1).execute();

        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void platformGamesTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<GamesListData> response = api.platformGames("microsoft xbox 360").execute();

        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void updatesTest() throws IOException {

        TheGamesDBApi.init();
        TheGamesDB api = TheGamesDBApi.getApi();

        Response<UpdateItems> response = api.updates(1000000).execute();

        Assert.assertTrue(response.isSuccessful());
    }

}
