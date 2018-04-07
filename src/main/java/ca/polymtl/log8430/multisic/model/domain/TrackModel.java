package ca.polymtl.log8430.multisic.model.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.util.UUID;
import java.util.Objects;

/**
 * A Track Model.
 */
public class TrackModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonSerialize(using = ToStringSerializer.class)
    protected Long id;

    protected String name;

    protected String album;

    protected String artist;

    protected String imagesurl;

    protected String previewurl;
    
	public TrackModel() {
		this.id = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
	}
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public TrackModel name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public TrackModel album(String album) {
        this.album = album;
        return this;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public TrackModel artist(String artist) {
        this.artist = artist;
        return this;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImagesurl() {
        return imagesurl;
    }

    public TrackModel imagesurl(String imagesurl) {
        this.imagesurl = imagesurl;
        return this;
    }

    public void setImagesurl(String imagesurl) {
        this.imagesurl = imagesurl;
    }

    public String getPreviewurl() {
        return previewurl;
    }

    public TrackModel previewurl(String previewurl) {
        this.previewurl = previewurl;
        return this;
    }

    public void setPreviewurl(String previewurl) {
        this.previewurl = previewurl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackModel track = (TrackModel) o;
        if (track.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), track.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Track{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", album='" + getAlbum() + "'" +
            ", artist='" + getArtist() + "'" +
            ", imagesurl='" + getImagesurl() + "'" +
            ", previewurl='" + getPreviewurl() + "'" +
            "}";
    }
}
