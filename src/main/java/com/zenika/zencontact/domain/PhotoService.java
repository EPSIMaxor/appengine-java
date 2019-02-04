
public class PhotoService{


private static PhotoService INSTANCE = new PhotoService;

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