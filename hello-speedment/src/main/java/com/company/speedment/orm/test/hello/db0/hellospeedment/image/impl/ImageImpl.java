package com.company.speedment.orm.test.hello.db0.hellospeedment.image.impl;

import com.company.speedment.orm.test.hello.db0.hellospeedment.image.Image;
import com.company.speedment.orm.test.hello.db0.hellospeedment.image.ImageBuilder;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * An implementation  representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.image'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class ImageImpl implements ImageBuilder {
    
    private Integer id;
    private String title;
    private String description;
    private Integer author;
    private Timestamp published;
    private String src;
    
    public ImageImpl() {
        
    }
    
    public ImageImpl(final Image image) {
        setId(image.getId());
        image.getTitle().ifPresent(this::setTitle);
        image.getDescription().ifPresent(this::setDescription);
        image.getAuthor().ifPresent(this::setAuthor);
        image.getPublished().ifPresent(this::setPublished);
        image.getSrc().ifPresent(this::setSrc);
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public final ImageImpl setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }
    
    @Override
    public final ImageImpl setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public final ImageImpl setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public Optional<Integer> getAuthor() {
        return Optional.ofNullable(author);
    }
    
    @Override
    public final ImageImpl setAuthor(Integer author) {
        this.author = author;
        return this;
    }
    
    @Override
    public Optional<Timestamp> getPublished() {
        return Optional.ofNullable(published);
    }
    
    @Override
    public final ImageImpl setPublished(Timestamp published) {
        this.published = published;
        return this;
    }
    
    @Override
    public Optional<String> getSrc() {
        return Optional.ofNullable(src);
    }
    
    @Override
    public final ImageImpl setSrc(String src) {
        this.src = src;
        return this;
    }
    
    @Override
    public Image build() {
        return new ImageImpl(this);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("title = "+Objects.toString(getTitle().orElse(null)));
        sj.add("description = "+Objects.toString(getDescription().orElse(null)));
        sj.add("author = "+Objects.toString(getAuthor().orElse(null)));
        sj.add("published = "+Objects.toString(getPublished().orElse(null)));
        sj.add("src = "+Objects.toString(getSrc().orElse(null)));
        return "ImageImpl "+sj.toString();
    }
}