
package edu.uchicago.gerber.books.data.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Item {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("volumeInfo")
    @Expose
    private VolumeInfo volumeInfo;
    @SerializedName("saleInfo")
    @Expose
    private edu.uchicago.gerber.books.data.models.SaleInfo saleInfo;
    @SerializedName("accessInfo")
    @Expose
    private edu.uchicago.gerber.books.data.models.AccessInfo accessInfo;
    @SerializedName("searchInfo")
    @Expose
    private edu.uchicago.gerber.books.data.models.SearchInfo searchInfo;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public edu.uchicago.gerber.books.data.models.VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(edu.uchicago.gerber.books.data.models.VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public edu.uchicago.gerber.books.data.models.SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(edu.uchicago.gerber.books.data.models.SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public edu.uchicago.gerber.books.data.models.AccessInfo getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(edu.uchicago.gerber.books.data.models.AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    public edu.uchicago.gerber.books.data.models.SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(edu.uchicago.gerber.books.data.models.SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }



}
