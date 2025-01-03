package classwork_35.ait.dao;

import classwork_35.ait.model.Photo;

import java.time.LocalDate;

public interface Album {

    boolean addPhoto(Photo photo);
    boolean removePhoto(int albumId, int photoId);
    boolean updatePhoto(int albumId, int photoId, String url);
    Photo getPhotoFromAlbum(int albumId, int photoId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();

}
