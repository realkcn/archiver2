package cn.kcn.archiver.model;

//@Document
public class Attachment {
    protected String attachmentid;

    protected String name;

    protected long datasize;

    public String getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(String attachmentid) {
        this.attachmentid = attachmentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDatasize() {
        return datasize;
    }

    public void setDatasize(long datasize) {
        this.datasize = datasize;
    }

}
