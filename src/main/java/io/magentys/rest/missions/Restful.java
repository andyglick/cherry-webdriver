package io.magentys.rest.missions;

public class Restful {

    public static Get get(String url, Object... parameters) {
        return new Get(url, parameters);
    }
}
