package com.zenika.zencontact.domain.blob;

import com.google.appengine.api.blobstore.*;
import com.zenika.zencontact.domain.User;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.zenika.zencontact.persistence.objectify.UserDaoObjectify;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PhotoService{


private static PhotoService INSTANCE = new PhotoService();

public static PhotoService getInstance() {
    return INSTANCE;
}

private BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

public void prepareUploadURL(User contact) {
    String uploadURL = blobstoreService.createUploadUrl("api/v0/photo/" + contact.id);
    contact.uploadURL(uploadURL);
}

public void updatePhoto(Long id) {
    
}

}