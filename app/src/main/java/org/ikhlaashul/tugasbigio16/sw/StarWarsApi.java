package org.ikhlaashul.tugasbigio16.sw;

import retrofit.RestAdapter;


public class StarWarsApi {

    private StarWars mSwApi;
    private static StarWarsApi sInstance;

    private StarWarsApi() {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setClient(new StarWarsOkClient())
                .setEndpoint(org.ikhlaashul.tugasbigio16.APIConstants.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        mSwApi = restAdapter.create(StarWars.class);
    }

    public static void init() {
        sInstance = new StarWarsApi();
    }

    public static StarWars getApi() {
        return sInstance.mSwApi;
    }

    public void setApi(StarWars starWarsApi) {
        sInstance.mSwApi = starWarsApi;
    }
}
