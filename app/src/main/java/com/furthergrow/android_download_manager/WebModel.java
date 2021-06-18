package com.furthergrow.android_download_manager;

public class WebModel {

    String link;
    String finished;
    String progress;
    String downloadId;

    public void WebModel (String link, String finished, String progress, String downloadId){
        this.link = link;
        this.finished = finished;
        this.progress = progress;
        this.downloadId = downloadId;
    }

    public void WebModel(){

    }

    public String getLink(){
        return this.link;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getFinished(){
        return this.finished;
    }

    public void setFinished(String finished){
        this.finished = finished;
    }

    public String getProgress(){
        return this.progress;
    }

    public void setProgress(String progress){
        this.progress = progress;
    }

    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(long downloadId) {
        this.downloadId = downloadId;
    }




}
