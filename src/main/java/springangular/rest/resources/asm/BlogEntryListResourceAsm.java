package springangular.rest.resources.asm;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import springangular.core.entry.BlogEntry;
import springangular.core.services.util.BlogEntryList;
import springangular.rest.mvc.controller.BlogController;
import springangular.rest.resources.BlogEntryListResource;
import springangular.rest.resources.BlogEntryResource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.util.List;

/**
 * Created by E5520 on 26.03.2017.
 */
public class BlogEntryListResourceAsm extends ResourceAssemblerSupport<BlogEntryList, BlogEntryListResource> {

    public BlogEntryListResourceAsm() {
        super(BlogController.class, BlogEntryListResource.class);
    }

    @Override
    public BlogEntryListResource toResource(BlogEntryList list) {
        List<BlogEntryResource> resources = (List<BlogEntryResource>) new BlogEntryResourceAsm().toResource((BlogEntry) list.getEntries());
        BlogEntryListResource listResource = new BlogEntryListResource();
        listResource.setEntries(resources);
        listResource.add(linkTo(methodOn(BlogController.class).findAllBlogEntries(list.getBlogId())).withSelfRel());
        return listResource;
    }
}