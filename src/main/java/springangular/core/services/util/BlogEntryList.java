package springangular.core.services.util;

import springangular.core.model.entity.BlogEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5520 on 19.03.2017.
 */
public class BlogEntryList {

    private List<BlogEntry> entries = new ArrayList<BlogEntry>();
    private Long blogId;

    public BlogEntryList(List<BlogEntry> entries, Long blogId) {
        this.entries = entries;
        this.blogId = blogId;
    }

    public List<BlogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<BlogEntry> entries) {
        this.entries = entries;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }
}
