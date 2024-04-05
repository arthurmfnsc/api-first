package com.arthurfnsc.apifirst.rest;

import org.openapitools.api.BatidasApi;
import org.openapitools.model.Momento;
import org.springframework.http.ResponseEntity;

public class FolhaPontoController implements BatidasApi {

    @Override
    public ResponseEntity<Void> batidasPost(Momento momento) {
        return null;
    }
}
