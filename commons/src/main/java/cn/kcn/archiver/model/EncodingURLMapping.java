package cn.kcn.archiver.model;

/**
 * Created by kcn on 14-8-23.
 */

@SuppressWarnings("UnusedDeclaration")
public class EncodingURLMapping {
    private String encodingURL;

    private String mappingid;

    public EncodingURLMapping(Type type, String encodingURL, long newid) {
        setEncodingURL(convertToId(type, encodingURL));
        setMappingid(Long.toString(newid));
    }

    public EncodingURLMapping(Type type, String encodingURL, String newid) {
        setEncodingURL(convertToId(type, encodingURL));
        setMappingid(newid);
    }

    public static String convertToId(Type type, String encodingUrl) {
        switch (type) {
        case THREAD:
            return "1" + encodingUrl;
        case ARTICLE:
            return "2" + encodingUrl;
        case ATTACHMENT:
            return "3" + encodingUrl;
        default:
            return "4" + encodingUrl;
        }
    }

    public String getEncodingURL() {
        return encodingURL;
    }

    public void setEncodingURL(String encodingURL) {
        this.encodingURL = encodingURL;
    }

    public String getMappingid() {
        return mappingid;
    }

    public void setMappingid(String mappingid) {
        this.mappingid = mappingid;
    }

    public enum Type {
        THREAD, ARTICLE, ATTACHMENT
    }

}
