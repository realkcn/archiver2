package cn.kcn.archiver.model;

/**
 * Created by kcn on 14-8-23.
 */

@SuppressWarnings("UnusedDeclaration")
public class EncodingURLMapping {
    private String EncodingURL;

    private String mappingid;

    public EncodingURLMapping(Type type, String encodingURL, long newid) {
        setEncodingURL(convertToId(type, encodingURL));
        setMappingid(Long.toString(newid));
    }

    public EncodingURLMapping(Type type, String encodingURL, String newid) {
        setEncodingURL(convertToId(type, encodingURL));
        setMappingid(newid);
    }

    public enum Type {
        THREAD, ARTICLE, ATTACHMENT
    }

    public static String convertToId(Type type, String EncodingUrl) {
        switch (type) {
        case THREAD:
            return "1" + EncodingUrl;
        case ARTICLE:
            return "2" + EncodingUrl;
        case ATTACHMENT:
            return "3" + EncodingUrl;
        }
        return "4" + EncodingUrl;
    }

    public String getEncodingURL() {
        return EncodingURL;
    }

    public void setEncodingURL(String encodingURL) {
        EncodingURL = encodingURL;
    }

    public String getMappingid() {
        return mappingid;
    }

    public void setMappingid(String mappingid) {
        this.mappingid = mappingid;
    }

}
